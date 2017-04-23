
package org.uber.main;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.uber.main package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDestinationCoordinatesResponse_QNAME = new QName("http://main.uber.org/", "getDestinationCoordinatesResponse");
    private final static QName _GetDestinationCoordinates_QNAME = new QName("http://main.uber.org/", "getDestinationCoordinates");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.uber.main
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDestinationCoordinates }
     * 
     */
    public GetDestinationCoordinates createGetDestinationCoordinates() {
        return new GetDestinationCoordinates();
    }

    /**
     * Create an instance of {@link GetDestinationCoordinatesResponse }
     * 
     */
    public GetDestinationCoordinatesResponse createGetDestinationCoordinatesResponse() {
        return new GetDestinationCoordinatesResponse();
    }

    /**
     * Create an instance of {@link Cluster }
     * 
     */
    public Cluster createCluster() {
        return new Cluster();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationCoordinatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main.uber.org/", name = "getDestinationCoordinatesResponse")
    public JAXBElement<GetDestinationCoordinatesResponse> createGetDestinationCoordinatesResponse(GetDestinationCoordinatesResponse value) {
        return new JAXBElement<GetDestinationCoordinatesResponse>(_GetDestinationCoordinatesResponse_QNAME, GetDestinationCoordinatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationCoordinates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main.uber.org/", name = "getDestinationCoordinates")
    public JAXBElement<GetDestinationCoordinates> createGetDestinationCoordinates(GetDestinationCoordinates value) {
        return new JAXBElement<GetDestinationCoordinates>(_GetDestinationCoordinates_QNAME, GetDestinationCoordinates.class, null, value);
    }

}
