package com.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.http4.HttpComponent;
import org.apache.camel.util.jsse.KeyStoreParameters;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.apache.camel.util.jsse.TrustManagersParameters;


public class HttpClientConfigurer  extends RouteBuilder{
	
	
	public void configure() {

	   
	    configureSslForHttp4();

	    from("timer://foo0?fixedRate=true&period=5s")
	    .to("https4://127.0.0.1:8182/myJettyService/?q=ssl&bridgeEndpoint=true&throwExceptionOnFailure=false")
	    .log("body received is:${body}");
	}

	public void configureSslForHttp4() {
		
		KeyStoreParameters trust_ksp = new KeyStoreParameters();
	    trust_ksp.setResource("/tmp/ks.jks");
	    trust_ksp.setPassword("redhat");

	    TrustManagersParameters trustp = new TrustManagersParameters();
	    trustp.setKeyStore(trust_ksp);

	    SSLContextParameters scp = new SSLContextParameters();
	    scp.setTrustManagers(trustp);

	    HttpComponent httpComponent = getContext().getComponent("https4", HttpComponent.class);
	    httpComponent.setSslContextParameters(scp);
		
	}

	

}
