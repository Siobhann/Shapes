/**
 * 
 */
package org.cvtc.shapes_ssteindorf1;

/**
 * @author steinsl
 *
 */
public class ShapesTest {
	// Main method
	public static void main(String[] args) {
		// Instantiating new object instances
		Cuboid cuboid = new Cuboid(5, 6, 1);
		Cylinder cylinder = new Cylinder(5, 10);
		Sphere sphere = new Sphere(5);
		
		// Calling the render method for each object
		cuboid.render();
		cylinder.render();
		sphere.render();
	}
}
