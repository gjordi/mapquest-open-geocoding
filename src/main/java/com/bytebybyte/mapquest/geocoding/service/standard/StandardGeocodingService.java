package com.bytebybyte.mapquest.geocoding.service.standard;

import java.net.URI;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.bytebybyte.mapquest.geocoding.service.IAddressRequest;
import com.bytebybyte.mapquest.geocoding.service.IAddressResponse;
import com.bytebybyte.mapquest.geocoding.service.IGeocodingService;
import com.bytebybyte.mapquest.geocoding.service.response.AddressResponse;

/**
 * The standard implementation of the mapquest open geocoding service.
 * 
 * @author gjordi
 *
 */
public class StandardGeocodingService implements IGeocodingService {

	protected static final Logger logger = LoggerFactory
			.getLogger(StandardGeocodingService.class);

	protected static final String URL = "http://open.mapquestapi.com/geocoding/v1/address";

	protected RestTemplate restTemplate;

	public StandardGeocodingService() {
		this(new RestTemplate());
	}

	public StandardGeocodingService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public IAddressResponse geocode(IAddressRequest request) {

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);

		for (Map.Entry<String, String> entry : request.getParameters()
				.entrySet())
			builder.queryParam(entry.getKey(), entry.getValue());

		URI uri = builder.build().toUri();

		return restTemplate.getForObject(uri, AddressResponse.class);
	}
}
