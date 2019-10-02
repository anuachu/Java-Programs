package com.greatlearning.model.user;

	
	import java.util.*;
	import com.greatlearning.model.tweet.*;

	public class User {
	   private final long userId ;
	   private final String userHandle;
	   private String firstName;
	   private String lastName;
	   private String password;
	   private Set<User> followers;
	   private Set<User> following;
	   private final Date createdDate;
	   private Date updatedDate = new Date();
	   private final String emailAddress;
	   private String coverPhoto;
	   private String profilePhoto;
	   private static long UserIdCounter = 1000;
	   private final Set<Tweet> tweets = new HashSet<>();
	 
	   
	public User(long userId, String userHandle, String firstName, String lastName, String password, String emailAddress,Date createdDate,Date updatedDate) {
		super();
		this.userId = userId;
		this.userHandle = userHandle;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.emailAddress = emailAddress;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		

		
	}
	
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Set<User> getFollowers() {
		return followers;
	}



	public void setFollowers(Set<User> followers) {
		
		this.followers = followers;
	}



	public Set<User> getFollowing() {
		
		return following;
	}



	public void setFollowing(Set<User> following) {
		
		this.following = following;
	}



	public static long getUserIdCounter() {
		return UserIdCounter;
	}



	public static void setUserIdCounter(long userIdCounter) {
		UserIdCounter = userIdCounter;
	}



	public Set<Tweet> getTweets() {
	    return tweets;
	}
	
	public void  setTweets(Tweet tweet){
		this.tweets.add(tweet);  
	}
	
	public void likeTweet(Tweet tweet){
		Iterator<Tweet> tweetIterator = this.tweets.iterator();
		while(tweetIterator.hasNext()) {
			Tweet tempTweet = tweetIterator.next();
			if(tempTweet== tweet) {
				tempTweet.likeTweet();
				
			}
		}
		
	}
	
	public void commentTweet(Tweet tweet){
		Iterator<Tweet> tweetIterator = this.tweets.iterator();
	while(tweetIterator.hasNext()) {
			Tweet tempTweet = tweetIterator.next();
			if(tempTweet== tweet) {
				tempTweet.commentTweet();
				
			}
		}
		
	}


	public void userStatus(){
		System.out.println("UserId"+userId);
		System.out.println("User name "+firstName);
	    
	     
	    
		 
	   
		
	}
		

	}



