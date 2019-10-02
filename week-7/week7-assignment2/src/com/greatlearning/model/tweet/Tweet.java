package com.greatlearning.model.tweet;
    
	
	import java.util.*;

    import java.sql.Connection;
    import java.sql.DriverManager;
	import com.greatlearning.model.user.*;

	public class Tweet implements Comparable<Tweet> {

		private final long id;
		private String tweetMsg;
		private String mediaUrl;
		private int numLikes;
		private int numComments;
		private static long tweetIdCounter = 100;
		private final Date createdDt = new Date();
		
	
		
		public Tweet( String tweetMsg, String mediaUrl) {		
			this.id = ++ tweetIdCounter;
			this.tweetMsg = tweetMsg;
			this.mediaUrl = mediaUrl;
		}
		public Tweet( String tweetMsg) {		
			this.id = ++ tweetIdCounter;
			
			this.tweetMsg = tweetMsg;
		}
		
		public void getTweetData() {
			System.out.println(this.tweetMsg+this.mediaUrl);
		}
		

		public static long getTweetIdCounter() {
			return tweetIdCounter;
		}

		public static void setTweetIdCounter(long tweetIdCounter) {
			Tweet.tweetIdCounter = tweetIdCounter;
		}

		public Date getCreatedDt() {
			return createdDt;
		}
		
		public void likeTweet(){
			
		 this.numLikes++;
		 System.out.println("Number of likes :"+this.numLikes);
		}
		
		public void commentTweet() {
			this.numComments++;
			System.out.println("Number of comments :"+this.numComments);
		}
		
		public void getnumLikes() {
			System.out.println(this.numLikes);
		}
		
		public void getnumComments() {
			System.out.println(this.numComments);
		}

		@Override
		public String toString() {
			return "Twitter [id=" + id + ", tweetMsg=" + tweetMsg + ", createdDt=" + createdDt + "]";
		}
		public int compareTo(Tweet tweet) {
			return this.tweetMsg.compareTo(tweet.tweetMsg);
		}
		

		enum MediaType{
			AUDIO,
			VEDIO,
			IMAGE
		}

		//aggregation
		class Media{
			private MediaType mediaType;
			private String url;
			
			public Media(MediaType mediaType, String url) {
				this.mediaType = mediaType;
				this.url = url;
			}
		}
	}

	    


