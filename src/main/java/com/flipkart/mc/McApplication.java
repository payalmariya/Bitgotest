package com.flipkart.mc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class McApplication {

	/*Daily crypto marketing notification creation app
	We would like you to create a crypto notification app. The features it should include:



	Create a server which will be able to take in the following rest APIs


	Create a notification. Line items may include current price of BTC, market trade volume, intra day high price, market cap
	Send a notification to an email
	List sent notifications (sent, outstanding, failed etc.)
	Delete a notification

	How to submit
	Please upload the code for this project to GitHub, and post a link to your repository below.






	*/




	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(McApplication.class, args);




	}

}
