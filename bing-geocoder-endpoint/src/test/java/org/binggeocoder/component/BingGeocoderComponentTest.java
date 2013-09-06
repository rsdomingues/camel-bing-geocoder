package org.binggeocoder.component;

import java.util.HashMap;

import org.binggeocoder.component.BingGeocoderComponent;
import org.binggeocoder.exception.BingGeocoderException;

import junit.framework.TestCase;

public class BingGeocoderComponentTest extends TestCase{

	
	public void testConstruct(){
		new BingGeocoderComponent();
		assertTrue(true);
	}
	
	public void testCreateEndpointError(){
		BingGeocoderComponent component = new BingGeocoderComponent();
		
		try {
			component.createEndpoint("binggeocoder", "InvalidGeocodingType", new HashMap<String, Object>());
			fail("should have thrown an excetion");
		} catch (Exception e) {
			if(e instanceof BingGeocoderException){
				assertEquals("Invalid geocodingType [InvalidGeocodingType], accepted values are [AddressToPojo, LatLongToPojo, AddressToXML, LatLongToXML, AddressToJson, LatLongToJson, AddressToMap, LatLongToMap]", e.getMessage());
			} else {
				fail("Should it be an BingGeocoderException");
			}
		}
	}
	
	public void testCreateEndpointSuccess1(){
		BingGeocoderComponent component = new BingGeocoderComponent();
		
		try {
			component.createEndpoint("binggeocoder", GeocodingType.AddressToJson.toString(), new HashMap<String, Object>());
		} catch (Exception e) {
			fail("Shouldn't throw exception");
		}
	}

	public void testCreateEndpointSuccess2(){
		BingGeocoderComponent component = new BingGeocoderComponent();
		
		try {
			component.createEndpoint("binggeocoder", GeocodingType.AddressToMap.toString(), new HashMap<String, Object>());
		} catch (Exception e) {
			fail("Shouldn't throw exception");
		}
	}

	public void testCreateEndpointSuccess3(){
		BingGeocoderComponent component = new BingGeocoderComponent();
		
		try {
			component.createEndpoint("binggeocoder", GeocodingType.AddressToPojo.toString(), new HashMap<String, Object>());
		} catch (Exception e) {
			fail("Shouldn't throw exception");
		}
	}

	public void testCreateEndpointSuccess4(){
		BingGeocoderComponent component = new BingGeocoderComponent();
		
		try {
			component.createEndpoint("binggeocoder", GeocodingType.AddressToXML.toString(), new HashMap<String, Object>());
		} catch (Exception e) {
			fail("Shouldn't throw exception");
		}
	}

	public void testCreateEndpointSuccess5(){
		BingGeocoderComponent component = new BingGeocoderComponent();
		
		try {
			component.createEndpoint("binggeocoder", GeocodingType.LatLongToJson.toString(), new HashMap<String, Object>());
		} catch (Exception e) {
			fail("Shouldn't throw exception");
		}
	}

	public void testCreateEndpointSuccesst6(){
		BingGeocoderComponent component = new BingGeocoderComponent();
		
		try {
			component.createEndpoint("binggeocoder", GeocodingType.LatLongToMap.toString(), new HashMap<String, Object>());
		} catch (Exception e) {
			fail("Shouldn't throw exception");
		}
	}

	public void testCreateEndpointSuccess7(){
		BingGeocoderComponent component = new BingGeocoderComponent();
		
		try {
			component.createEndpoint("binggeocoder", GeocodingType.LatLongToPojo.toString(), new HashMap<String, Object>());
		} catch (Exception e) {
			fail("Shouldn't throw exception");
		}
	}

	public void testCreateEndpointSuccess8(){
		BingGeocoderComponent component = new BingGeocoderComponent();
		
		try {
			component.createEndpoint("binggeocoder", GeocodingType.LatLongToXML.toString(), new HashMap<String, Object>());
		} catch (Exception e) {
			fail("Shouldn't throw exception");
		}
	}
	
}
