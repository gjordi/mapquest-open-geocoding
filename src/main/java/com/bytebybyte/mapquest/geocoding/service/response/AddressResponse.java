package com.bytebybyte.mapquest.geocoding.service.response;

import com.bytebybyte.mapquest.geocoding.service.IAddressResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressResponse implements IAddressResponse {

	protected Result[] results;
	protected Info info;

	public AddressResponse() {
	}

	public Result[] getResults() {
		return results;
	}

	public void setResults(Result[] results) {
		this.results = results;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

}
