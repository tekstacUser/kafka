package com.kafkaDemo;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaProducerExample {
	
	public static void main(String[] args) {
        // Kafka Producer properties
        String topicName="my-topic";
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        // Create Kafka producer
        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        // Send a message
        producer.send(new ProducerRecord<>("my-topic", "key", "Hello Kafka"));

        // Close the producer
        producer.close();
        System.out.println("Message sent successfully!");
    }

}
