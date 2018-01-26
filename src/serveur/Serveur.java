package serveur;

import implementations.CalculetteImpl;


import javax.xml.ws.Endpoint;

public class Serveur {
    static public void main(String[] args){
        Endpoint.publish("http://localhost:9999/ws/calculette", new CalculetteImpl());
    }
}
