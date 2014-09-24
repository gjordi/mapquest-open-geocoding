package com.bytebybyte.mapquest.geocoding.service.response;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum GeocodeQuality {

	// P1: A specific point location.
	POINT,

	// L1: A specific street address location.
	ADDRESS,

	// I1: An intersection of two or more streets.
	INTERSECTION,

	// B1: The center of a single street block. House number ranges are returned
	// if available.
	// B2: The center of a single street block, which is located closest to the
	// geographic center of all matching street blocks. No house number range is
	// returned
	// B3: The center of a single street block whose numbered range is nearest
	// to the input number. House number range is returned.
	STREET,

	// A6: Admin area. For USA, a neighborhood.
	NEIGHBORHOOD,

	// A5: Admin area. For USA, a city.
	CITY,

	// A4: Admin area. For USA, a county.
	COUNTY,

	// A3: Admin area. For USA, a state.
	STATE,

	// A1: Admin area, largest. For USA, a country.
	COUNTRY,

	// Z1: Postal code, largest. For USA, a ZIP.
	ZIP,

	// Z2: Postal code. For USA, a ZIP+2.
	// Z3: Postal code. For USA, a ZIP+4.
	// Z4: Postal code, smallest. Unused in USA.
	ZIP_EXTENDED,

	// a catch all for cases where the enum could not be identified.
	UNKNOWN;

	@JsonCreator
	public static GeocodeQuality newInstance(String value) {
		try {
			return GeocodeQuality.valueOf(value);
		} catch (IllegalArgumentException e) {
			return GeocodeQuality.UNKNOWN;
		}
	}

}
