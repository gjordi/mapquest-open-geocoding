package com.bytebybyte.mapquest.geocoding.service;

public interface IGeocodingService {

	IResponse geocode(IGeocodeRequest request);

	IResponse reverseGeocode(IReverseGeocodeRequest request);
}
