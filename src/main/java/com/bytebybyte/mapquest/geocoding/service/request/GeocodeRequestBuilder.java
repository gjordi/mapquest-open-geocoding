package com.bytebybyte.mapquest.geocoding.service.request;

import java.util.LinkedHashMap;
import java.util.Map;

public class GeocodeRequestBuilder {

	protected Map<String, String> parameters = new LinkedHashMap<String, String>();

	public GeocodeRequestBuilder() {
	}

	/**
	 * A unique key to authorize use of the Routing Service.
	 * 
	 * This parameter is required.
	 * 
	 * @param key
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder key(String key) {
		parameters.put("key", key);
		return this;
	}

	/**
	 * Specifies the format of the request will by JSON.
	 * 
	 * @param json
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder json(String json) {
		parameters.put("inFormat", "json");
		parameters.put("json", json);
		return this;
	}

	/**
	 * Specifies the format of the request will by XML.
	 * 
	 * @param xml
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder xml(String xml) {
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
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder outFormat(String format) {
		parameters.put("outFormat", format);
		return this;
	}

	/**
	 * Depending on the geocode function being called, one or more locations are
	 * needed.
	 * 
	 * When using key/value pairs, the Geocoding Service provides a location=
	 * parameter that can be used.
	 * 
	 * Multiple location= parameters can be used for Batch Geocoding.
	 * 
	 * JSON and XML use Location objects, which are the same across all the
	 * services. Refer to the Locations documentation on how to properly form
	 * locations in all formats.
	 * 
	 * @param location
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder location(String location) {
		parameters.put("location", location);
		return this;
	}

	/**
	 * The 5-box input format allows for a higher degree of address
	 * specification by entering the full address already broken down into
	 * individual components. The 5-box input format is beneficial as it
	 * bypasses the parsing functionality of the single-line request. For more
	 * information about additional parameters that can be used with single-line
	 * and 5-box requests, refer to theLocations documentation.
	 * 
	 * @param street
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder street(String street) {
		parameters.put("street", street);
		return this;
	}

	/**
	 * The 5-box input format allows for a higher degree of address
	 * specification by entering the full address already broken down into
	 * individual components. The 5-box input format is beneficial as it
	 * bypasses the parsing functionality of the single-line request. For more
	 * information about additional parameters that can be used with single-line
	 * and 5-box requests, refer to theLocations documentation.
	 * 
	 * @param street
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder city(String city) {
		parameters.put("city", city);
		return this;
	}

	/**
	 * The 5-box input format allows for a higher degree of address
	 * specification by entering the full address already broken down into
	 * individual components. The 5-box input format is beneficial as it
	 * bypasses the parsing functionality of the single-line request. For more
	 * information about additional parameters that can be used with single-line
	 * and 5-box requests, refer to theLocations documentation.
	 * 
	 * @param street
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder state(String state) {
		parameters.put("state", state);
		return this;
	}

	/**
	 * The 5-box input format allows for a higher degree of address
	 * specification by entering the full address already broken down into
	 * individual components. The 5-box input format is beneficial as it
	 * bypasses the parsing functionality of the single-line request. For more
	 * information about additional parameters that can be used with single-line
	 * and 5-box requests, refer to theLocations documentation.
	 * 
	 * @param street
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder postalCode(String postalCode) {
		parameters.put("postalCode", postalCode);
		return this;
	}

	/**
	 * The geocoding target country can be specified by using the "adminArea1"
	 * or "country" request parameter (Refer to the Locations documentation).
	 * International designations are also supported with single-line
	 * addressing.
	 * 
	 * Country biasing is additionally provided. Currently, site referral can be
	 * used to provide a default country. For a given request, if the
	 * "HTTP_REFERER" header is populated with a URI that contains a valid
	 * country, that country will be used for geocoding.
	 * 
	 * The default country can be overridden by populating the "adminArea1"
	 * request parameter. To use this feature, the country must be part of the
	 * top-level-domain name (TLD) and in the standard format (For example:
	 * http://www.sitename.co.uk/referringpage/).
	 * 
	 * @param country
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder country(String country) {
		parameters.put("country", country);
		return this;
	}

	/**
	 * The number of results to limit the response to in the case of an
	 * ambiguous address. (-1 indicates no limit)
	 * 
	 * Default = -1
	 * 
	 * @param maxResults
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder maxResults(int maxResults) {
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
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder thumbMaps(boolean thumbMaps) {
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
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder boundingBox(double upperLeftLatitude,
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
	 * @return GeocodeRequestBuilder
	 */
	public GeocodeRequestBuilder ignoreLatLngInput(boolean ignoreLatLngInput) {
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
	public GeocodeRequestBuilder delimiter(String delimeter) {
		parameters.put("delimiter", delimeter);
		return this;
	}

	/**
	 * Build the request object.
	 * 
	 * @return AddressRequest
	 */
	public GeocodeRequest build() {
		return new GeocodeRequest(parameters);
	}
}
