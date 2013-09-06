package org.binggeocoder.endpoint;

import java.util.Map;

import org.apache.camel.Producer;
import org.apache.camel.impl.ProcessorEndpoint;
import org.binggeocoder.component.GeocodingType;

public class BingGeocoderEndpoint extends ProcessorEndpoint{

	public static final String DEFAULT_NAME = "bingGeocoder";

	private GeocodingType geocodingType;
	
	private Map<String , Object> parameters;
	
	public BingGeocoderEndpoint(GeocodingType geocodingType,
			Map<String, Object> parameters){
		this.geocodingType = geocodingType;
		this.parameters = parameters;
	}
	
	@Override
	public Producer createProducer() throws Exception {
		System.out.println(geocodingType);
		System.out.println(parameters);
		return null;
	}

	
}
