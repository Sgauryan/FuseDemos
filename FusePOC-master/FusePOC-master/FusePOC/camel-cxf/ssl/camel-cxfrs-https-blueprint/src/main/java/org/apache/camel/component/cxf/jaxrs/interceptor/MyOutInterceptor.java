package org.apache.camel.component.cxf.jaxrs.interceptor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class MyOutInterceptor extends AbstractPhaseInterceptor<Message> {

	public MyOutInterceptor() {
		super(Phase.SEND);
	}

	public void handleMessage(Message message) {
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("ACCESS_TOKEN", Arrays.asList("046b6c7f-0b8a-43b9-b35d-6489e6daee91"));
		message.put(Message.PROTOCOL_HEADERS, headers);
	}
}
