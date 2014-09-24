package com.bytebybyte.mapquest.geocoding.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.node.ObjectNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

	protected Location[] locations;
	protected ObjectNode providedLocation;

	public Result() {
	}

	public Location[] getLocations() {
		return locations;
	}

	public void setLocations(Location[] locations) {
		this.locations = locations;
	}

	public ObjectNode getProvidedLocation() {
		return providedLocation;
	}

	public void setProvidedLocation(ObjectNode providedLocation) {
		this.providedLocation = providedLocation;
	}

}
