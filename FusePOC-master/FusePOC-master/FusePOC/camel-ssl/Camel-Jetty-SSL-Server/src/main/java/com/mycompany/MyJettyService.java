package com.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyJettyService implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		
		exchange.getOut().setBody("{ \"name\" : \"JettyService\", \"version\" : \"1.0\" }");
		
		
		
	}
	
	

}
