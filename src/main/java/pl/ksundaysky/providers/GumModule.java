package pl.ksundaysky.providers;

import com.google.inject.AbstractModule;

public class GumModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Gum.class).toProvider(GumProvider.class);
    }
}
