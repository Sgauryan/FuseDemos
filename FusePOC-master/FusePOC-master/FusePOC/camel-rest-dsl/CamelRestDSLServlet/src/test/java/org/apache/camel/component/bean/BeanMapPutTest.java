package org.apache.camel.component.bean;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.JndiRegistry;

public class BeanMapPutTest extends ContextTestSupport {

	
	private Map myMap = new HashMap();

	/*@Override
	protected JndiRegistry createRegistry() throws Exception {
		// TODO Auto-generated method stub
		JndiRegistry jndi = super.createRegistry();
		jndi.bind("myMap", myMap);
		return jndi;
	}*/

	@Override
	protected RouteBuilder createRouteBuilder() throws Exception {
		// TODO Auto-generated method stub
		return new RouteBuilder() {
			@Override
		 		            public void configure() throws Exception {
		 		                from("direct:start")
		 		                .bean(myMap, "put('isMaster','true')");
		 		                    //.beanRef("myMap", "put('isMaster','true')");
		 		            }
		};
	}
	
	public void testMapPut() throws Exception {
		assertEquals(0, myMap.size());
		template.sendBody("direct:start", "Hello World");
		 assertEquals(1, myMap.size());
		 System.out.println("The Key Value coming is:"+myMap.get("isMaster"));
		 assertEquals("true", myMap.get("isMaster"));
		throw new ClassNotFoundException("msg");
	}
	
}
