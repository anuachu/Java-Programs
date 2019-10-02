package com.greatlearning.client;

import java.util.*;
import java.util.Scanner.*;
import java.util.Set.*;

import com.greatlearning.model.tweet.*;
import com.greatlearning.model.user.*;

public class Client {

	public static void main(String[] args) {
		
		
		    User user = new User(0, "@anushaanu", "anusha", "anu", "***", "anushamohan@gmail.com", new Date(), new Date());
	        User user1 = new User(1, "@anushaanu", "anusha", "anu", "***", "anushamohan@gmail.com", new Date(), new Date());
	        User user2 = new User(2, "@anushaanu", "anusha", "anu", "***", "anushamohan@gmail.com", new Date(), new Date());
	        User user3 = new User(3, "@anushaanu", "anusha", "anu", "***", "anushamohan@gmail.com", new Date(), new Date());
	        User user4 = new User(4, "@anushaanu", "anusha", "anu", "***", "anushamohan@gmail.com", new Date(), new Date());
	        User user5 = new User(5, "@anushaanu", "anusha", "anu", "***", "anushamohan@gmail.com", new Date(), new Date());
   
	        user.userStatus();
	        
			Set<User> followers = new HashSet<User>();
			
	        followers.add(user1);
	        followers.add(user2);
	        user.setFollowers(followers);
	        
	        Set<User> following =new HashSet<User>();
	        
	        following.add(user3);
	        following.add(user4);
	        following.add(user5);
	        user.setFollowing(following);
			
	        user.userStatus();
			Tweet tweet = new Tweet("GoodMorning","anushamohan@gmail.com");
            Tweet tweet1 = new Tweet("Goodnight","anushamohan@gmail.com");
            Tweet tweet2 = new Tweet("Goodafternoon","anushamohan@gmail.com");
            Tweet tweet3 = new Tweet("Good","anushamohan@gmail.com");
            Tweet tweet4 = new Tweet("Hello","anushamohan@gmail.com");
		user.setTweets(tweet4);
		user.setTweets(tweet3);
		user.setTweets(tweet2);
		user.setTweets(tweet1);
		user.setTweets(tweet);
		Set<Tweet> addTweet = new HashSet<Tweet>(); 
		
	addTweet = user.getTweets(); 
		addTweet.forEach((e)->e.getTweetData());	
		
		user.likeTweet(tweet1);
		user.commentTweet(tweet1);
			
		user.likeTweet(tweet1);
		user.commentTweet(tweet1);
			
		user.likeTweet(tweet1);
		user.commentTweet(tweet1);
			
		user.likeTweet(tweet1);
		user.commentTweet(tweet1);
			
		user.likeTweet(tweet1);
		user.commentTweet(tweet1);
			
			
			
	

	}

}
