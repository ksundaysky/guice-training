package pl.ksundaysky.providers;

import com.google.inject.Provider;

public class GumProvider implements Provider<Gum> {
    @Override
    public Gum get() {
        return new Gum(new Color("BLACK"));
    }
}
