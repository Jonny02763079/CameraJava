package at.kos.projects.camera.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import at.kos.projects.camera.SDCard;

public class SDCardTest {

    private SDCard sdCard;

    @Before
    public void setUp() {
        this.sdCard = new SDCard(32800);
    }

    @Test
    public void testGetFreeCapazity() {
        Assert.assertEquals(this.sdCard.getFreeCapazity(), 32800);
    }

    @Test
    public void testGetSystemCapazity() {
        Assert.assertEquals(this.sdCard.getSystemCapazity(), 32800);
    }
}
