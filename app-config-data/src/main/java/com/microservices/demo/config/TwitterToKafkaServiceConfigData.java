package com.microservices.demo.config;

import java.util.List;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

//
//twitter-to-kafka-service:
//	 twitter-keywords:
//	  - Java
//	  - Microservices
//	  - Kafka
//	  - Elasticsearch
//	 welcome-message: Helllo micorservices!
//	 enable-mock-tweets:   true
//	 mock-min-tweet-length: 5
//	 mock-max-tweet-length: 15
//	 mock-sleep-ms: 10000
//	  
	 
@Data
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public class TwitterToKafkaServiceConfigData {

	private List<String> twitterKeywords;
	private String welcomeMessage;
	private Boolean enableMockTweets;
	private Long mockSleepMs;
	private Integer mockMinTweetLength;
	private Integer mockMaxTweetLength;
	

}
