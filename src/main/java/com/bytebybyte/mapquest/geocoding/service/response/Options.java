package com.bytebybyte.mapquest.geocoding.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Options {

	protected Boolean ignoreLatLngInput;
	protected Integer maxResults;
	protected Boolean thumbMaps;

	public Options() {
	}

	public Boolean getIgnoreLatLngInput() {
		return ignoreLatLngInput;
	}

	public void setIgnoreLatLngInput(Boolean ignoreLatLngInput) {
		this.ignoreLatLngInput = ignoreLatLngInput;
	}

	public Integer getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Boolean getThumbMaps() {
		return thumbMaps;
	}

	public void setThumbMaps(Boolean thumbMaps) {
		this.thumbMaps = thumbMaps;
	}

}
