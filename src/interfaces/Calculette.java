package interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Calculette {
    @WebMethod int addition(int a, int b);
    @WebMethod int soustraction(int a, int b);
}
