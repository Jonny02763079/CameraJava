package at.kos.projects.camera;

public class Objective {

    private int focalLength;

    private Producer producers;

    public Objective(int focalLength, Producer producer) {
        this.focalLength = focalLength;
        this.producers = producer;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public Producer getProducers() {
        return producers;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }
}
