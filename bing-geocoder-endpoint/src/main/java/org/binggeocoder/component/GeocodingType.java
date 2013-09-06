package org.binggeocoder.component;

public enum GeocodingType {
	AddressToPojo, LatLongToPojo, AddressToXML, LatLongToXML, AddressToJson, LatLongToJson, AddressToMap, LatLongToMap;
	
	
	public static String validTypes(){
		return "[AddressToPojo, LatLongToPojo, AddressToXML, LatLongToXML, AddressToJson, LatLongToJson, AddressToMap, LatLongToMap]";
	}
}
