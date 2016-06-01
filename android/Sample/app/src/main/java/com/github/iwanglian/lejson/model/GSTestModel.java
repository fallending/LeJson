// Generated by LeJson ,  DO NOT EDIT!
// Feedback to https://github.com/iwanglian/LeJson/issues,  DO NOT EDIT!

// Created by alick on 2016-06-01 16:41:33,  DO NOT EDIT!

package com.github.iwanglian.lejson.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class GSTestModel {
	@SerializedName("date")
	public String date; 
	@SerializedName("top_stories")
	public List<TopStories> topStories; 
	@SerializedName("stories")
	public List<Stories> stories; 

	public static class TopStories {
		@SerializedName("image")
		public String image; 
		@SerializedName("type")
		public int type; 
		@SerializedName("id")
		public int ID; 
		@SerializedName("ga_prefix")
		public String gaPrefix; 
		@SerializedName("title")
		public String title; 
	}
	

	public static class Stories {
		@SerializedName("images")
		public List<String> images; 
		@SerializedName("type")
		public int type; 
		@SerializedName("id")
		public int ID; 
		@SerializedName("ga_prefix")
		public String gaPrefix; 
		@SerializedName("title")
		public String title; 
	}
	
}
