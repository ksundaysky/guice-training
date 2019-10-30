package pl.ksundaysky.simple.di;

import javax.inject.Inject;

public class SquareRequest {

    private DrawShape drawShape;

    @Inject
    public SquareRequest(DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    void makeRequest() {
        drawShape.draw();
    }
}
