package com.greatlearning.fsd.exception;


	public class BidderException extends Exception {
		private double bid;
		
		public BidderException(double bid) {
			super("bidding amount is invalid");
			this.bid = bid;
		}
		
		public double getBid() {
			return bid;
		}
	}

