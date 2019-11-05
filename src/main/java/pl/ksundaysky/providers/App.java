package pl.ksundaysky.providers;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;

public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GumModule());
        GumballMachine machine = injector.getInstance(Key.get(GumballMachine.class));
        System.out.println(machine.dispense());
        System.out.println(machine.dispense());
    }
}
