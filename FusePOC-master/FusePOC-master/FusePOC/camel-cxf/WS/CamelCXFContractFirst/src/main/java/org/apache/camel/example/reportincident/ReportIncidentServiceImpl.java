
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.apache.camel.example.reportincident;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.4.redhat-620133
 * 2017-08-04T17:33:09.156+05:30
 * Generated source version: 3.0.4.redhat-620133
 * 
 */

@javax.jws.WebService(
                      serviceName = "ReportIncidentEndpointService",
                      portName = "ReportIncidentService",
                      targetNamespace = "http://reportincident.example.camel.apache.org",
                      wsdlLocation = "file:/home/sarai/workspace/CamelCXFContractFirst/src/main/resources/wsdl/report_incident.wsdl",
                      endpointInterface = "org.apache.camel.example.reportincident.ReportIncidentEndpoint")
                      
public class ReportIncidentServiceImpl implements ReportIncidentEndpoint {

    private static final Logger LOG = Logger.getLogger(ReportIncidentServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see org.apache.camel.example.reportincident.ReportIncidentEndpoint#reportIncident(org.apache.camel.example.reportincident.InputReportIncident  in )*
     */
    public org.apache.camel.example.reportincident.OutputReportIncident reportIncident(InputReportIncident in) { 
        LOG.info("Executing operation reportIncident");
        System.out.println(in);
        try {
            org.apache.camel.example.reportincident.OutputReportIncident _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
