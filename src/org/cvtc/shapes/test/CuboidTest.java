package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes_ssteindorf1.Cuboid;
import org.junit.Test;

public class CuboidTest {

	@Test
	public void testSurfaceArea() {
		Cuboid cube1 = new Cuboid(6, 5, 1);
		assertEquals(82, cube1.surfaceArea(), 0.0002);
		
	}

	@Test
	public void testVolume() {
		fail("Not yet implemented");
	}

	@Test
	public void testRender() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWidth() {
		Cuboid cube1 = new Cuboid(1,2,2);
		assertEquals(1, cube1.getWidth(), 0.0002);
	}

	@Test
	public void testGetHeight() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDepth() {
		fail("Not yet implemented");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCuboid() {
		Cuboid cube1 = new Cuboid(-1,2,3);
	}
}
