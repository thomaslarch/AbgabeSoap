
package gen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ComputationService", targetNamespace = "http://localhost:1234/ComputationService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ComputationService {


    /**
     * 
     * @param artist
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "album", partName = "album")
    @Action(input = "http://localhost:1234/ComputationService/ComputationService/getAlbumRequest", output = "http://localhost:1234/ComputationService/ComputationService/getAlbumResponse")
    public String getAlbum(
        @WebParam(name = "artist", partName = "artist")
        String artist);

    /**
     * 
     * @param artist
     * @param album
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "bill", partName = "bill")
    @Action(input = "http://localhost:1234/ComputationService/ComputationService/buyAlbumRequest", output = "http://localhost:1234/ComputationService/ComputationService/buyAlbumResponse")
    public String buyAlbum(
        @WebParam(name = "artist", partName = "artist")
        String artist,
        @WebParam(name = "album", partName = "album")
        String album);

    /**
     * 
     * @param bandName
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(name = "preisBandName", partName = "preisBandName")
    @Action(input = "http://localhost:1234/ComputationService/ComputationService/getPriceRequest", output = "http://localhost:1234/ComputationService/ComputationService/getPriceResponse")
    public float getPrice(
        @WebParam(name = "bandName", partName = "bandName")
        String bandName);

}
