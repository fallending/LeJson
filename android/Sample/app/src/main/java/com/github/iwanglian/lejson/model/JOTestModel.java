// Generated by LeJson ,  DO NOT EDIT!
// Feedback to https://github.com/iwanglian/LeJson/issues,  DO NOT EDIT!

// Created by alick on 2016-06-01 16:41:33,  DO NOT EDIT!

package com.github.iwanglian.lejson.model;

import java.util.List;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class JOTestModel {
	public String date; 
	public List<TopStories> topStories; 
	public List<Stories> stories; 

    public static JOTestModel objectFromString(String string) throws JSONException {
        JSONObject jsonObject = new JSONObject(string);
        return objectFromJSON(jsonObject);
    }

    public static String stringFromObject(JOTestModel object) throws JSONException {
        JSONObject jsonObject = JSONFromObject(object);
        return jsonObject.toString();
    }

	public static JOTestModel objectFromJSON(JSONObject jsonObject) {
	    JOTestModel object = new JOTestModel();
	
		object.date = jsonObject.optString("date");
		if (jsonObject.optJSONArray("top_stories") != null) {
		    JSONArray jsonArray = jsonObject.optJSONArray("top_stories");
		    List<TopStories> list = new ArrayList<>();
		    for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonObj = jsonArray.optJSONObject(i);
				if(jsonObj!=null) {
				    TopStories item = TopStories.objectFromJSON(jsonObj);
				    list.add(item);
				}
		    }
		    object.topStories = list;
		}
		
		if (jsonObject.optJSONArray("stories") != null) {
		    JSONArray jsonArray = jsonObject.optJSONArray("stories");
		    List<Stories> list = new ArrayList<>();
		    for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonObj = jsonArray.optJSONObject(i);
				if(jsonObj!=null) {
				    Stories item = Stories.objectFromJSON(jsonObj);
				    list.add(item);
				}
		    }
		    object.stories = list;
		}
		
		return object;
	}
	
	public static JSONObject JSONFromObject(JOTestModel object) {
	    JSONObject jsonObject = new JSONObject();
	    try { 
			jsonObject.put("date", object.date);
			if(object.topStories!=null){
			    List<TopStories> list = object.topStories;
			    JSONArray jsonArray = new JSONArray();
				for (TopStories item : list) {
				    JSONObject jsonObj = TopStories.JSONFromObject(item);
				    jsonArray.put(jsonObj);
				} 
			    jsonObject.put("top_stories",jsonArray);
			} 
			if(object.stories!=null){
			    List<Stories> list = object.stories;
			    JSONArray jsonArray = new JSONArray();
				for (Stories item : list) {
				    JSONObject jsonObj = Stories.JSONFromObject(item);
				    jsonArray.put(jsonObj);
				} 
			    jsonObject.put("stories",jsonArray);
			} 
		} catch (JSONException e) {
		    e.printStackTrace();
		}
		
		return jsonObject; 
	}

	public static class TopStories {
		public String image; 
		public int type; 
		public int ID; 
		public String gaPrefix; 
		public String title; 
	
		public static TopStories objectFromJSON(JSONObject jsonObject) {
		    TopStories object = new TopStories();
		
			object.image = jsonObject.optString("image");
			object.type = jsonObject.optInt("type");
			object.ID = jsonObject.optInt("id");
			object.gaPrefix = jsonObject.optString("ga_prefix");
			object.title = jsonObject.optString("title");
			return object;
		}
		
		public static JSONObject JSONFromObject(TopStories object) {
		    JSONObject jsonObject = new JSONObject();
		    try { 
				jsonObject.put("image", object.image);
				jsonObject.put("type", object.type);
				jsonObject.put("id", object.ID);
				jsonObject.put("ga_prefix", object.gaPrefix);
				jsonObject.put("title", object.title);
			} catch (JSONException e) {
			    e.printStackTrace();
			}
			
			return jsonObject; 
		}
	}
	

	public static class Stories {
		public List<String> images; 
		public int type; 
		public int ID; 
		public String gaPrefix; 
		public String title; 
	
		public static Stories objectFromJSON(JSONObject jsonObject) {
		    Stories object = new Stories();
		
			if (jsonObject.optJSONArray("images") != null) {
			    JSONArray jsonArray = jsonObject.optJSONArray("images");
			    List<String> list = new ArrayList<>();
			    for (int i = 0; i < jsonArray.length(); i++) {
					String item = jsonArray.optString(i);
					list.add(item);
			    }
			    object.images = list;
			}
			
			object.type = jsonObject.optInt("type");
			object.ID = jsonObject.optInt("id");
			object.gaPrefix = jsonObject.optString("ga_prefix");
			object.title = jsonObject.optString("title");
			return object;
		}
		
		public static JSONObject JSONFromObject(Stories object) {
		    JSONObject jsonObject = new JSONObject();
		    try { 
				if(object.images!=null){
				    List<String> list = object.images;
				    JSONArray jsonArray = new JSONArray();
					for (String item : list) {
					    jsonArray.put(item);
					} 
				    jsonObject.put("images",jsonArray);
				} 
				jsonObject.put("type", object.type);
				jsonObject.put("id", object.ID);
				jsonObject.put("ga_prefix", object.gaPrefix);
				jsonObject.put("title", object.title);
			} catch (JSONException e) {
			    e.printStackTrace();
			}
			
			return jsonObject; 
		}
	}
	
}
