package com.friends.friendsquiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class handles the booting and starting of the app.
 */
@SpringBootApplication
@SuppressWarnings("checkstyle:hideutilityclassconstructor")
public class FriendsQuizApplication {

     /**
     * Main method to run the app.
     * @param args Arguments passed to the SpringApp runner.
     */
    public static void main(final String[] args) {
        SpringApplication.run(FriendsQuizApplication.class, args);
    }
}
