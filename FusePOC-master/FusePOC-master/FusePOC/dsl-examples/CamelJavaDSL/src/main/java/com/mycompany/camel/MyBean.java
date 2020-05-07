package com.mycompany.camel;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangeProperty;
import org.apache.camel.Processor;

public class MyBean implements Processor{

	public void usingBeanComponent(String body,
		      @ExchangeProperty(Exchange.TIMER_COUNTER) String timerCount) {
		 System.out.println("I am called with body : " + body);
		    System.out.println("Timer Counter : " + timerCount);
		    System.out.println("I am called usingBeanComponent");
		    
		  }
	public void usingBeanInvocation(String body,
		      @ExchangeProperty(Exchange.TIMER_COUNTER) String timerCount) {
		 System.out.println("I am called with body : " + body);
		    System.out.println("Timer Counter : " + timerCount);
		    System.out.println("usingBeanInvocation");
		    
		  }
	public void usingClassComponent(String body,
		      @ExchangeProperty(Exchange.TIMER_COUNTER) String timerCount) {
		    System.out.println("I am called with body : " + body);
		    System.out.println("Timer Counter : " + timerCount);
		    System.out.println("Using usingClassComponent");
		  }

		  public void process(Exchange exchange) throws Exception {
		    System.out.print("Route Id: "+exchange.getFromRouteId());
		    System.out.print("; Timer Counter : "
		        + exchange.getProperty(Exchange.TIMER_COUNTER));
		    System.out.println(
		        "; Timer Name : " + exchange.getProperty(Exchange.TIMER_NAME));
		    System.out.println("Called by usingProcessor");
		  }
	
	
	
	


}
