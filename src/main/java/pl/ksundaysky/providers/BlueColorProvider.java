package pl.ksundaysky.providers;

import com.google.inject.Provider;

class BlueColorProvider implements Provider<Color> {
    @Override
    public Color get() {
        return new Color("BLUE");
    }
}
