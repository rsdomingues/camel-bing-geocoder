package org.binggeocoder.component;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.impl.DefaultComponent;
import org.binggeocoder.endpoint.BingGeocoderEndpoint;
import org.binggeocoder.exception.BingGeocoderException;


public class BingGeocoderComponent extends DefaultComponent{

	@Override
	protected Endpoint createEndpoint(String uri, String remaining,
			Map<String, Object> parameters) throws Exception {
		try {
			GeocodingType geocodingType = GeocodingType.valueOf(remaining);
			BingGeocoderEndpoint geocoderEndpoint = new BingGeocoderEndpoint(geocodingType, parameters);
			return geocoderEndpoint;
		} catch (Exception e) {
			throw new BingGeocoderException(String.format("Invalid geocodingType [%s], accepted values are %s", remaining, GeocodingType.validTypes()));
		}
	}

}
