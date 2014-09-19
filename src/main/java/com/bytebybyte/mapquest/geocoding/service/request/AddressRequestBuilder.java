package com.bytebybyte.mapquest.geocoding.service.request;

import java.util.HashMap;
import java.util.Map;

import com.bytebybyte.mapquest.geocoding.service.IAddressRequest;

public class AddressRequestBuilder implements IAddressRequest {

	protected Map<String, String> parameters = new HashMap<String, String>();

	public AddressRequestBuilder() {
	}

	@Override
	public Map<String, String> getParameters() {
		return parameters;
	}

	/**
	 * A unique key to authorize use of the Routing Service.
	 * 
	 * This parameter is required.
	 * 
	 * @param key
	 * @return AddressRequestBuilder
	 */
	public AddressRequestBuilder key(String key) {
		parameters.put("key", key);
		return this;
	}

	/**
	 * Specifies the format of the request will by JSON.
	 * 
	 * @param json
	 * @return AddressRequestBuilder
	 */
	public AddressRequestBuilder json(String json) {
		parameters.put("inFormat", "json");
		parameters.put("json", json);
		return this;
	}

	/**
	 * Specifies the format of the request will by XML.
	 * 
	 * @param xml
	 * @return AddressRequestBuilder
	 */
	public AddressRequestBuilder xml(String xml) {
		parameters.put("inFormat", xml);
		parameters.put("xml", xml);
		return this;
	}

	/**
	 * Specifies the format of the response. Must be one of the following, if
	 * supplied: json xml csv (character delimited)
	 * 
	 * Defaults to "json" if not supplied
	 * 
	 * @param format
	 * @return AddressRequestBuilder
	 */
	public AddressRequestBuilder outFormat(String format) {
		parameters.put("outFormat", format);
		return this;
	}

	/**
	 * 
	 * @param location
	 * @return AddressRequestBuilder
	 */
	public AddressRequestBuilder location(String location) {
		parameters.put("location", location);
		return this;
	}

	/**
	 * The number of results to limit the response to in the case of an
	 * ambiguous address. (-1 indicates no limit)
	 * 
	 * Default = -1
	 * 
	 * @param maxResults
	 * @return AddressRequestBuilder
	 */
	public AddressRequestBuilder maxResults(int maxResults) {
		parameters.put("maxResults", String.valueOf(maxResults));
		return this;
	}

	/**
	 * This parameter tells the service whether it should return a URL to a
	 * static map thumbnail image for a location being geocoded.
	 * 
	 * true - The response will include a URL to a static map image of the
	 * geocoded location.
	 * 
	 * false - The response will not include a static map image URL.
	 * 
	 * Default = true
	 * 
	 * @param thumbMaps
	 * @return AddressRequestBuilder
	 */
	public AddressRequestBuilder thumbMaps(boolean thumbMaps) {
		parameters.put("thumbMaps", String.valueOf(thumbMaps));
		return this;
	}

	/**
	 * When using batch geocoding or when ambiguous results are returned, any
	 * results within the provided bounding box will be moved to the top of the
	 * results list. Bounding box format is: upper left latitude, upper left
	 * longitude, lower right latitude, lower right longitude.
	 * 
	 * Refer to the Geocode Options Sample for examples of how to format this
	 * parameter.
	 * 
	 * @param upperLeftLatitude
	 * @param upperLeftLongitude
	 * @param lowerRightLatitude
	 * @param lowerRightLongitude
	 * @return AddressRequestBuilder
	 */
	public AddressRequestBuilder boundingBox(double upperLeftLatitude,
			double upperLeftLongitude, double lowerRightLatitude,
			double lowerRightLongitude) {
		parameters.put("boundingBox", upperLeftLatitude + ","
				+ upperLeftLongitude + "," + lowerRightLatitude + ","
				+ lowerRightLongitude);
		return this;
	}

	/**
	 * This option tells the service whether it should fail when given a
	 * latitude/longitude pair in an address or batch geocode call, or if it
	 * should ignore that and try and geocode what it can.
	 * 
	 * true - The geocoder will ignore the LatLng specified in the location, and
	 * use the address info to perform geocode
	 * 
	 * false - The geocoder will return a geoaddress object containing the
	 * LatLng passed in and write a warning message to Info block
	 * 
	 * Default = false (Applies to address and batch calls)
	 * 
	 * @param ignoreLatLngInput
	 * @return AddressRequestBuilder
	 */
	public AddressRequestBuilder ignoreLatLngInput(boolean ignoreLatLngInput) {
		parameters.put("ignoreLatLngInput", String.valueOf(ignoreLatLngInput));
		return this;
	}

	/**
	 * A delimiter is used only when outFormat=csv. The delimiter is the single
	 * character used to separate the fields of a character delimited file.
	 * 
	 * The delimiter defaults to a comma(,).
	 * 
	 * The valid choices are:
	 * 
	 * Comma (,) - All fields are quoted when comma is used.
	 * 
	 * Pipe (|) - The fields are not quoted when pipes are used.
	 * 
	 * Colon (:) - All fields are quoted when colon is used.
	 * 
	 * Semicolon (;) - All fields are quoted when semicolon is used.
	 * 
	 * Default = comma
	 * 
	 * @param delimeter
	 * @return
	 */
	public AddressRequestBuilder delimiter(String delimeter) {
		parameters.put("delimiter", delimeter);
		return this;
	}
}
