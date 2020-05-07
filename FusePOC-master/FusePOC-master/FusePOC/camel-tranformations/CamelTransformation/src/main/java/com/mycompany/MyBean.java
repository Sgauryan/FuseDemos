package com.mycompany;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyBean implements Processor{
	

	@Override
	public void process(Exchange arg0) throws Exception {
		System.out.println("Body: "+arg0.getIn().getBody().toString()+"Is transformed successfully.");
		
	}
	
	public void transform(@Body String myBody){
		 System.out.println("Body: "+myBody+"Is transformed successfully.");
	}

}
