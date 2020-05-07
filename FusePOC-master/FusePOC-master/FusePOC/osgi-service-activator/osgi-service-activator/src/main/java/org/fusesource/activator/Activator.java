package org.fusesource.activator;

import org.fusesource.example.service.HelloWorldSvc;
import org.fusesource.example.service.impl.HelloWorldSvcImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator{
	
	private ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		registration = context.registerService(
                HelloWorldSvc.class.getName(),
                new HelloWorldSvcImpl(),
                null);
		System.out.println("Bundle Started");
		
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		registration.unregister();
		System.out.println("Bundle Stopped");
		
		
	}
	

}
