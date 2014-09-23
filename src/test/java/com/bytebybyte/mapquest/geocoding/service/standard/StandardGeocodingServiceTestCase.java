package com.bytebybyte.mapquest.geocoding.service.standard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bytebybyte.mapquest.geocoding.service.IAddressResponse;
import com.bytebybyte.mapquest.geocoding.service.request.AddressRequest;
import com.bytebybyte.mapquest.geocoding.service.request.AddressRequestBuilder;

public class StandardGeocodingServiceTestCase {

	/**
	 * NOTE: The api key presented in the map quest api key manager is url
	 * encoded, it needs to be decoded here.
	 */
	protected static final String KEY = "Fmjtd|luur2hu1n5,2s=o5-9wawhy";

	protected StandardGeocodingService service;

	@Before
	public void setUp() throws Exception {
		service = new StandardGeocodingService();
	}

	@Test
	public void testGeocode_CalgaryAddress() throws Exception {
		// setup
		AddressRequestBuilder builder = new AddressRequestBuilder();
		AddressRequest request = builder.key(KEY)
				.location("1015 120 Ave SE, Calgary, AB T2J 2L1").build();

		// execute
		IAddressResponse response = service.geocode(request);

		// verify
		Assert.assertNotNull(response);
		Assert.assertNotNull(response.getInfo());
		Assert.assertEquals(new Integer(0), response.getInfo().getStatusCode());
		Assert.assertNotNull(response.getResults());
		Assert.assertEquals(1, response.getResults().length);
		Assert.assertNotNull(response.getResults()[0].getLocations());
		Assert.assertEquals(1, response.getResults()[0].getLocations().length);
		Assert.assertEquals("CA",
				response.getResults()[0].getLocations()[0].getAdminArea1());

	}

}
