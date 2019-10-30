package pl.ksundaysky.simple.di.module;

import com.google.inject.AbstractModule;
import pl.ksundaysky.simple.di.DrawShape;
import pl.ksundaysky.simple.di.DrawSquare;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
    }
}
