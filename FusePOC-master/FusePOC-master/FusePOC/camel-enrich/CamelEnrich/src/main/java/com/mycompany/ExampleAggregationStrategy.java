package com.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class ExampleAggregationStrategy implements AggregationStrategy {
	
	public Exchange aggregate(Exchange original, Exchange resource) {
        Object originalBody = original.getIn().getBody();
        String resourceResponse = resource.getIn().getBody(String.class);
        String mergeResult = originalBody.toString()+resourceResponse.toString();
        if (original.getPattern().isOutCapable()) {
            original.getOut().setBody(mergeResult);
        } else {
            original.getIn().setBody(mergeResult);
        }
        return original;
    }

}
