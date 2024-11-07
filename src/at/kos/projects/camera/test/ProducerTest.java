package at.kos.projects.camera.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import at.kos.projects.camera.Producer;

public class ProducerTest {

    private Producer producer;

    @Before
    public void setUp() {
        this.producer = new Producer("Hans", "Deutschland");
    }

    @Test
    public void testGetCountry() {
        Assert.assertEquals(this.producer.getCountry(), "Deutschland");
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(this.producer.getName(), "Hans");
    }
}
