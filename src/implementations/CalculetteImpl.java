package implementations;

import interfaces.Calculette;

import javax.jws.WebService;

@WebService(endpointInterface = "interfaces.Calculette")
public class CalculetteImpl implements Calculette{
    @Override
    public int addition(int a, int b) {
        return a+b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a-b;
    }
}
