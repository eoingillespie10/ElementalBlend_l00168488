// ElementalBlendTest.java

import org.
        junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementalBlendTest {

    @Test
    void testGetShardType() {
        ElementalBlend blend = new ElementalBlend("Fire");
        assertEquals("Fire", blend.getShardType());
    }

    @Test
    void testSetShardType() {
        ElementalBlend blend = new ElementalBlend("Fire");
        blend.setShardType("Water");
        assertEquals("Water", blend.getShardType());
    }

    @Test
    void testAltarActivation() {
        ElementalBlend blend = new ElementalBlend("Air");
        assertFalse(blend.isAltarActivated());

        blend.activateAltar();
        assertTrue(blend.isAltarActivated());
    }

    @Test
    void testCreateStormWithoutActivation() {
        ElementalBlend blend = new ElementalBlend("Earth");
        assertEquals("Activate the altar first!", blend.createStorm());
    }

    @Test
    void testCreateStormWithActivation() {
        ElementalBlend blend = new ElementalBlend("Earth");
        blend.activateAltar();
        assertEquals("Storm created with Earth shard!", blend.createStorm());
    }
}
