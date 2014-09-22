package com.bytebybyte.mapquest.geocoding.service;

import org.springframework.util.MultiValueMap;

public interface IAddressRequest {

	MultiValueMap<String, String> getParameters();
}
