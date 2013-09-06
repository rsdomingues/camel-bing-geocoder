package org.binggeocoder.endpoint;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;


public class BingGeocoderProducer extends DefaultProducer{

	public BingGeocoderProducer(Endpoint endpoint) {
		super(endpoint);
	}

	@Override
	public void process(Exchange exchange) throws Exception {
	}

}
