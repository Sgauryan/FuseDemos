package org.apache.camel.component.cxf.jaxrs.interceptor;

import java.io.IOException;

import org.apache.camel.component.cxf.jaxrs.testbean.CustomerService;
import org.apache.cxf.attachment.AttachmentDeserializer;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestInterceptor extends AbstractPhaseInterceptor<Message>{
	
	private static final Logger LOG = LoggerFactory.getLogger(TestInterceptor.class);

	@Override
	public void handleMessage(Message message) throws Fault {
		// TODO Auto-generated method stub
		String methodReq = (String)message.get(Message.REQUEST_URL);
		
		LOG.info("##########################################################The Request method is:"+methodReq);
		
	}
	
	public TestInterceptor(){
		super(Phase.UNMARSHAL);
	}
	
	

}
