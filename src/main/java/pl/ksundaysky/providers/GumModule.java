package pl.ksundaysky.providers;

import com.google.inject.AbstractModule;


public class GumModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Color.class).toProvider(BlueColorProvider.class);
        bind(Gum.class).toProvider(BlueGumProvider.class);
    }
}
