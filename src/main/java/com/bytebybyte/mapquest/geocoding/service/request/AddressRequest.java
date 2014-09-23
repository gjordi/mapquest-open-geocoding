package com.bytebybyte.mapquest.geocoding.service.request;

import java.util.Map;

import com.bytebybyte.mapquest.geocoding.service.IAddressRequest;

public class AddressRequest implements IAddressRequest {

	protected Map<String, String> parameters;

	protected AddressRequest() {
	}

	public AddressRequest(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	@Override
	public Map<String, String> getParameters() {
		return parameters;
	}

}
