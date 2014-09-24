package com.bytebybyte.mapquest.geocoding.service.request;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseGeocodeRequestBuilder {

	protected Map<String, String> parameters = new LinkedHashMap<String, String>();

	public ReverseGeocodeRequestBuilder() {
	}

	/**
	 * A unique key to authorize use of the geocoding service.
	 * 
	 * This parameter is required.
	 * 
	 * @param key
	 * @return ReverseGeocodeRequestBuilder
	 */
	public ReverseGeocodeRequestBuilder key(String key) {
		parameters.put("key", key);
		return this;
	}

	/**
	 * The location latitude and longitude.
	 * 
	 * This parameter is required.
	 * 
	 * @param lat
	 * @param lng
	 * @return ReverseGeocodeRequestBuilder
	 */
	public ReverseGeocodeRequestBuilder location(Double lat, Double lng) {
		parameters.put("location", lat + "," + lng);
		return this;
	}

	/**
	 * Build the request object.
	 * 
	 * @return AddressRequest
	 */
	public ReverseGeocodeRequest build() {
		return new ReverseGeocodeRequest(parameters);
	}

}
