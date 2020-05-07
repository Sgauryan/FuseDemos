package com.mycompany;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.util.jndi.JndiContext;

public class CamelRoute extends RouteBuilder {
	
	
	@Override
	public void configure() throws Exception {
		/* When this route is started, it will automatically create the work/cbr/input directory 
		 * where you can drop the file that need to be processed.

        The <log/> elements are used to add human-friendly business logging statements. They 
        make it easier to see what the route is doing.

        The <choice/> element contains the content based router. The two <when/> clauses use 
        XPath to define the criteria for entering that part of the route. When the country in 
        the XML message is set to UK or US, the file will be moved to a directory for that country. 
        The <otherwise/> element ensures that any file that does not meet the requirements for 
        either of the <when/> elements will be moved to the work/cbr/output/others directory.
        
		 */
		
		// using bean component
		from("timer://mytimer?delay=2000&fixedRate=true&period=10000").routeId("usingBeanComponent")
	     .setBody(simple("${routeId} - Hello bean."))
	     .to("bean:myBean?method=printHello");
	    
	

	}
		
}
