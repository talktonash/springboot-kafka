# springboot-kafka
Simple implementation of Kafka to understand the basics of integration of Kafka clusters

## Prerequisite

- Install JDK 8 or above in your system
- Install Apache Kafka latest version in your local machine.



## Apachhe Kafka Useful Commands

### Start the ZooKeeper service
$ bin/zookeeper-server-start.sh config/zookeeper.properties

## Start the Kafka broker service
$ bin/kafka-server-start.sh config/server.properties

## Read message from topic
$ bin/kafka-console-consumer.sh --topic topic1 --from-beginning --bootstrap-server localhost:9092
