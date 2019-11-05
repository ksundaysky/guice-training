package pl.ksundaysky.providers;

import com.google.inject.Inject;
import com.google.inject.Provider;


public class BlueGumProvider implements Provider<Gum> {

    @Inject
    Color color;

    @Override
    public Gum get() {
        return new Gum(color);
    }
}
