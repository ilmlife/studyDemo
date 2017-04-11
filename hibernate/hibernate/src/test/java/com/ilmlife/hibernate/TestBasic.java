package com.ilmlife.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.ilmlife.hibernate.model.User;

import junit.framework.TestCase;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com 
 * @version1.0 创建时间：2017年4月8日 上午8:57:27
 */
public class TestBasic extends TestCase {
	private SessionFactory sessionFactory;

	@Override
	protected void setUp() throws Exception {
		// A SessionFactory is set up once for an application!
		// configures settings from hibernate.cfg.xml
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had
			// trouble building the SessionFactory
			// so destroy it manually.
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	@Override
	protected void tearDown() throws Exception {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}

	public void testBasicUsage() {
		// create a couple of events...
		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(new User("张三", "123456"));
//		session.save(new User("李四", "123456"));
//		session.getTransaction().commit();
//		session.close();
//
//		// now lets pull events from the database and list them
//		session = sessionFactory.openSession();
		session.beginTransaction();
		List<User> result = session.createQuery("from User", User.class).list();
		for (User user : result) {
			System.out.println("user (" + user.getId() + ") : " + user.getUsername());
		}
		session.getTransaction().commit();
		session.close();
	}
}
