package com.mycompany;

import java.util.Date;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Route;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.RoutePolicySupport;
import org.apache.camel.routepolicy.quartz.SimpleScheduledRoutePolicy;


public class FlipRoutePolicy extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		SimpleScheduledRoutePolicy policy = new SimpleScheduledRoutePolicy();
		long startTime = System.currentTimeMillis() + 3000L;
		policy.setRouteStartDate(new Date(startTime));
		policy.setRouteStartRepeatCount(1);
		policy.setRouteStartRepeatInterval(3000);
		                
		from("direct:start")
		   .routeId("test")
		   .routePolicy(policy)
		   .log("Hello")
		   .to("mock:success");
		
	}
	
	
	
	
	

}
