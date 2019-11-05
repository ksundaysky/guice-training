package pl.ksundaysky.providers;

import com.google.inject.Provider;

import javax.inject.Inject;

public class GumballMachine {

    @Inject
    private Provider<Gum> gumProvider;

    Gum dispense(){
        return gumProvider.get();
    }
}
