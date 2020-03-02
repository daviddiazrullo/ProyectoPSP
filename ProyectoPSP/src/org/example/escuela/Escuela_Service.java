package org.example.escuela;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-02-29T15:39:13.585+01:00
 * Generated source version: 3.3.5
 *
 */
@WebServiceClient(name = "escuela",
                  wsdlLocation = "file:/C:/Users/gemel/eclipse-workspace/PracticaPSP/WSDLFile.wsdl",
                  targetNamespace = "http://www.example.org/escuela/")
public class Escuela_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/escuela/", "escuela");
    public final static QName EscuelaSOAP = new QName("http://www.example.org/escuela/", "escuelaSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/gemel/eclipse-workspace/PracticaPSP/WSDLFile.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Escuela_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/gemel/eclipse-workspace/PracticaPSP/WSDLFile.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Escuela_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Escuela_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Escuela_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Escuela_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Escuela_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Escuela_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Escuela
     */
    @WebEndpoint(name = "escuelaSOAP")
    public Escuela getEscuelaSOAP() {
        return super.getPort(EscuelaSOAP, Escuela.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Escuela
     */
    @WebEndpoint(name = "escuelaSOAP")
    public Escuela getEscuelaSOAP(WebServiceFeature... features) {
        return super.getPort(EscuelaSOAP, Escuela.class, features);
    }

}
