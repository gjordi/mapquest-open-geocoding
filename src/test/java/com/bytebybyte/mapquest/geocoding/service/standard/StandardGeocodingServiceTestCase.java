package com.bytebybyte.mapquest.geocoding.service.standard;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bytebybyte.mapquest.geocoding.service.request.AddressRequestBuilder;

@RunWith(SpringJUnit4ClassRunner.class)
public class StandardGeocodingServiceTestCase {

	protected StandardGeocodingService service;

	@Before
	public void setUp() throws Exception {
		service = new StandardGeocodingService();
	}

	@Test
	public void testGeocode() throws Exception {
		// setup
		AddressRequestBuilder builder = new AddressRequestBuilder();
		

		// execute

		// verify

	}
}
