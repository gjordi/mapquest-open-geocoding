package com.bytebybyte.mapquest.geocoding.service.request;

import org.springframework.util.MultiValueMap;

import com.bytebybyte.mapquest.geocoding.service.IAddressRequest;

public class AddressRequest implements IAddressRequest {

	protected MultiValueMap<String, String> parameters;

	protected AddressRequest() {
	}

	public AddressRequest(MultiValueMap<String, String> parameters) {
		this.parameters = parameters;
	}

	@Override
	public MultiValueMap<String, String> getParameters() {
		return parameters;
	}

}
