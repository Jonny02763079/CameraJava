package at.kos.projects.camera.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import at.kos.projects.camera.Camera;
import at.kos.projects.camera.Objective;
import at.kos.projects.camera.Producer;
import at.kos.projects.camera.SDCard;

public class CameraTest {

    private Camera cam;
    private Objective objective;
    private Producer producer;
    private SDCard sdCard;

    @Before
    public void setUp() {
        this.producer = new Producer("Heinzle", "Dubai");
        this.sdCard = new SDCard(32800);
        this.objective = new Objective(16, producer);
        this.cam = new Camera(48, 180, "green", this.sdCard, this.objective, this.producer);
    }

    @Test
    public void testGetColor() {
        Assert.assertEquals(this.cam.getColor(), "green");
    }

    @Test
    public void testGetObjective() {
        Assert.assertEquals(this.cam.getObjective(), this.objective);
    }

    @Test
    public void testGetPixel() {
        Assert.assertEquals(this.cam.getPixel(), 48);
    }

    @Test
    public void testGetProducer() {
        Assert.assertEquals(this.cam.getProducer(), this.producer);
    }

    @Test
    public void testGetSdCard() {
        Assert.assertEquals(this.cam.getSdCard(), this.sdCard);
    }

    @Test
    public void testGetWeight() {
        Assert.assertEquals(this.cam.getWeight(), 180);
    }
}
