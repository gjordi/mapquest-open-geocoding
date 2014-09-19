package com.bytebybyte.mapquest.geocoding.service.standard;

import com.bytebybyte.mapquest.geocoding.service.IAddressRequest;
import com.bytebybyte.mapquest.geocoding.service.IAddressResponse;
import com.bytebybyte.mapquest.geocoding.service.IGeocodingService;

/**
 * The standard implementation of the mapquest open geocoding service.
 * 
 * @author gjordi
 *
 */
public class StandardGeocodingService implements IGeocodingService {

	protected static final String URI = "http://open.mapquestapi.com/geocoding/v1/address?key=YOUR_KEY_HERE&location=Lancaster,PA&callback=renderGeocode";

	@Override
	public IAddressResponse address(IAddressRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
