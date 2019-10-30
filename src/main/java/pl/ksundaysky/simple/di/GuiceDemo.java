package pl.ksundaysky.simple.di;

import com.google.inject.Guice;
import com.google.inject.Injector;
import pl.ksundaysky.simple.di.module.AppModule;

public class GuiceDemo {

    private static final String SQUARE_REQ = "SQUARE";

    private static void sendRequest(String squareReq){
        if(squareReq.equals("SQUARE")) {
            Injector injector = Guice.createInjector(new AppModule());

            SquareRequest squareRequest = injector.getInstance(SquareRequest.class);
            squareRequest.makeRequest();
        }
    }

    public static void main(String[] args) {
        sendRequest(SQUARE_REQ);
    }
}
