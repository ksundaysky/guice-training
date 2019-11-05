package pl.ksundaysky.providers;


class Gum {

    private Color color;

    Gum(Color color) {
        this.color = color;
    }

    Gum() {
        color = new Color("BLACK");
    }

    @Override
    public String toString() {
        return "Gum{" +
                "color=" + color +
                '}';
    }
}
