package com.bytebybyte.mapquest.geocoding.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

	protected LatLng latLng;
	protected String street;
	protected String adminArea6;
	protected String adminArea6Type;
	protected String adminArea5;
	protected String adminArea5Type;
	protected String adminArea4;
	protected String adminArea4Type;
	protected String adminArea3;
	protected String adminArea3Type;
	protected String adminArea1;
	protected String adminArea1Type;
	protected String postalCode;
	protected String type;
	protected Boolean dragPoint;
	protected LatLng displayLatLng;
	protected String geocodeQuality;
	protected String geocodeQualityCode;
	protected String linkId;
	protected String sideOfStreet;

	public Location() {
	}

	/**
	 * Returns the latitude/longitude for routing and is the nearest point on a
	 * road for the entrance.
	 * 
	 * @return LatLng
	 */
	public LatLng getLatLng() {
		return latLng;
	}

	public void setLatLng(LatLng latLng) {
		this.latLng = latLng;
	}

	/**
	 * Street address
	 * 
	 * @return street
	 */
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Neighborhood name
	 * 
	 * @return adminArea6
	 */
	public String getAdminArea6() {
		return adminArea6;
	}

	public void setAdminArea6(String adminArea6) {
		this.adminArea6 = adminArea6;
	}

	public String getAdminArea6Type() {
		return adminArea6Type;
	}

	public void setAdminArea6Type(String adminArea6Type) {
		this.adminArea6Type = adminArea6Type;
	}

	/**
	 * City name
	 * 
	 * @param adminArea5
	 */
	public String getAdminArea5() {
		return adminArea5;
	}

	public void setAdminArea5(String adminArea5) {
		this.adminArea5 = adminArea5;
	}

	public String getAdminArea5Type() {
		return adminArea5Type;
	}

	public void setAdminArea5Type(String adminArea5Type) {
		this.adminArea5Type = adminArea5Type;
	}

	/**
	 * County name
	 * 
	 * @return adminArea4
	 */
	public String getAdminArea4() {
		return adminArea4;
	}

	public void setAdminArea4(String adminArea4) {
		this.adminArea4 = adminArea4;
	}

	public String getAdminArea4Type() {
		return adminArea4Type;
	}

	public void setAdminArea4Type(String adminArea4Type) {
		this.adminArea4Type = adminArea4Type;
	}

	/**
	 * State name
	 * 
	 * @return adminArea3
	 */
	public String getAdminArea3() {
		return adminArea3;
	}

	public void setAdminArea3(String adminArea3) {
		this.adminArea3 = adminArea3;
	}

	public String getAdminArea3Type() {
		return adminArea3Type;
	}

	public void setAdminArea3Type(String adminArea3Type) {
		this.adminArea3Type = adminArea3Type;
	}

	/**
	 * Country name
	 * 
	 * @return adminArea1
	 */
	public String getAdminArea1() {
		return adminArea1;
	}

	public void setAdminArea1(String adminArea1) {
		this.adminArea1 = adminArea1;
	}

	public String getAdminArea1Type() {
		return adminArea1Type;
	}

	public void setAdminArea1Type(String adminArea1Type) {
		this.adminArea1Type = adminArea1Type;
	}

	/**
	 * Postal code
	 * 
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Type of location.
	 * 
	 * 's' = stop (default) 'v' = via
	 * 
	 * @return type
	 */
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Is location a drag point? This option only applies when making a
	 * dragroute call.
	 * 
	 * true = location is a drag point
	 * 
	 * false = location is not a drag point (default)
	 * 
	 * @return
	 */
	public Boolean getDragPoint() {
		return dragPoint;
	}

	public void setDragPoint(Boolean dragPoint) {
		this.dragPoint = dragPoint;
	}

	/**
	 * A lat/lng pair that can be helpful when showing this address as a Point
	 * of Interest.
	 * 
	 * @return displayLatLng
	 */
	public LatLng getDisplayLatLng() {
		return displayLatLng;
	}

	public void setDisplayLatLng(LatLng displayLatLng) {
		this.displayLatLng = displayLatLng;
	}

	/**
	 * The precision of the geocoded location. Refer to the Geocode Quality
	 * reference page for more information.
	 * 
	 * @return geocodeQuality
	 */
	public String getGeocodeQuality() {
		return geocodeQuality;
	}

	public void setGeocodeQuality(String geocodeQuality) {
		this.geocodeQuality = geocodeQuality;
	}

	/**
	 * The five character quality code for the precision of the geocoded
	 * location. Refer to the Geocode Quality reference page for more
	 * information.
	 * 
	 * @return geocodeQualityCode
	 */
	public String getGeocodeQualityCode() {
		return geocodeQualityCode;
	}

	public void setGeocodeQualityCode(String geocodeQualityCode) {
		this.geocodeQualityCode = geocodeQualityCode;
	}

	/**
	 * String that identifies the closest road to the address for routing
	 * purposes.
	 * 
	 * @return linkId
	 */
	public String getLinkId() {
		return linkId;
	}

	public void setLinkId(String linkId) {
		this.linkId = linkId;
	}

	/**
	 * Specifies the side of street.
	 * 
	 * 'L' = left 'R' = right 'N' = none (default)
	 * 
	 * @return sideOfStreet
	 */
	public String getSideOfStreet() {
		return sideOfStreet;
	}

	public void setSideOfStreet(String sideOfStreet) {
		this.sideOfStreet = sideOfStreet;
	}

}
