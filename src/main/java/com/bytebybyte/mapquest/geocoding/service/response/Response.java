package com.bytebybyte.mapquest.geocoding.service.response;

import com.bytebybyte.mapquest.geocoding.service.IResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response implements IResponse {

	protected Result[] results;
	protected Options options;
	protected Info info;

	public Response() {
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
