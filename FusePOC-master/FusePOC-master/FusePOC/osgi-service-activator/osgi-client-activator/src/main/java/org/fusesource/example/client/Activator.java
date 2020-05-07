package org.fusesource.example.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.fusesource.example.service.HelloWorldSvc;
import org.osgi.framework.ServiceReference;
public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		ServiceReference reference = context.getServiceReference(HelloWorldSvc.class.getName());
		HelloWorldSvc srv = (HelloWorldSvc) context.getService(reference);
		srv.sayHello();
		
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Stopping bundle");
		
		
	}
	
	

}
