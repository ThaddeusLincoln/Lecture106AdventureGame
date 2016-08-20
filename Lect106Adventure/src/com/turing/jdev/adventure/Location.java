package com.turing.jdev.adventure;

import java.util.HashMap;
import java.util.Map;

public class Location {
	
	private final int locationID;
	private final String description;
	private final Map<String, Integer> exits;
	
	public Location(int locationID, String description){
		this.locationID = locationID;
		this.description = description;
		this.exits = new HashMap<String, Integer>();
	}

	public int getLocationID() {
		return locationID;
	}

	public String getDescription() {
		return description;
	}

	// we do this because we don't want any external class to modify the actual content of the map
	// doing it like this, we're returning a copy of the actual map's content
	public Map<String, Integer> getExits() {
		return new HashMap<String, Integer>(exits);
	}
	
	public void addExit(String direction, int location){
		exits.put(direction, location);
	}
	
	
}
