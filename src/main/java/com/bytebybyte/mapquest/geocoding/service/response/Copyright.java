package com.bytebybyte.mapquest.geocoding.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Copyright {

	protected String text;
	protected String imageUrl;
	protected String imageAltText;

	public Copyright() {
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageAltText() {
		return imageAltText;
	}

	public void setImageAltText(String imageAltText) {
		this.imageAltText = imageAltText;
	}

}
