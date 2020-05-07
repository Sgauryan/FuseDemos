Camel Project for Blueprint 
=========================================

To build this project use

    mvn install
    
    

To run the project you can execute the following Maven goal

    mvn camel:run


First you need to install the following features in Karaf/ServiceMix with:

	feature:install camel-servlet
	feature:install camel-jackson
	feature:install war


To deploy the project in OSGi. For example using Apache Karaf.
You can run the following command from its shell:

    osgi:install -s mvn:com.mycompany/camel-blueprint/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
