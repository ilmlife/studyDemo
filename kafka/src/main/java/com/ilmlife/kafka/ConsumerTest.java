package com.ilmlife.kafka;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2018年7月15日 下午8:35:47
 */
public class ConsumerTest {
	public static void main(String[] args) {
		Properties props = new Properties();
	     props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.1.222:9092");
	     props.put(ConsumerConfig.GROUP_ID_CONFIG, "test");
	     props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
	     props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
	     props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	     props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	     KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
	     consumer.subscribe(Arrays.asList("topic-test-002"));
	     
	     try {
		     while (true) {
		         ConsumerRecords<String, String> records = consumer.poll(100);
		         for (ConsumerRecord<String, String> record : records) {
		             System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
		         }
		     }
	     }finally {
	    	 consumer.close();
	     }
	}
}
