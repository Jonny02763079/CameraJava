package at.kos.projects.camera.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import at.kos.projects.camera.Objective;
import at.kos.projects.camera.Producer;

public class ObjectiveTest {

    private Objective objective;
    private Producer producer;

    @Before
    public void setUp() {
        this.producer = new Producer("Haze", "Dubai");
        this.objective = new Objective(2, this.producer);
    }

    @Test
    public void testGetFocalLength() {
        Assert.assertEquals(this.objective.getFocalLength(), 2);
    }

    @Test
    public void testGetProducers() {
        Assert.assertEquals(this.objective.getProducers(), this.producer);
    }
}
