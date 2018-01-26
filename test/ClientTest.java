import interfaces.Calculette;
import org.testng.annotations.*;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import static org.testng.Assert.*;

public class ClientTest {
    private Calculette calc;

    @BeforeClass
    public void setUp() throws Exception{
        URL url = new URL("http://localhost:9999/ws/calculette?wsdl");
        QName qname = new QName("http://implementations/", "CalculetteImplService");
        Service service = Service.create(url, qname);
        calc = service.getPort(Calculette.class);
    }

    @AfterClass
    public void tearDown() throws Exception{
        calc = null;
    }

    @Test
    public void testAddition() throws Exception{
        assertEquals(calc.addition(2,3),5);
    }

    @Test
    public void testSoustraction() throws Exception{
        assertEquals(calc.soustraction(5,1),4);
    }

}
