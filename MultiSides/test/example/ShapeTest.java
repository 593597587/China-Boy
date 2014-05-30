package example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {

	@Test
	public void isValidShape() {		
		assertTrue(new Shape(new double[] { 1, 1, 1, 1, 1 }).isValidShape());
		assertFalse(new Shape(new double[] { 0, 1, 1, 1, 1 }).isValidShape());
		assertFalse(new Shape(new double[] { -1, 1, 1, 1, 1 }).isValidShape());
		assertFalse(new Shape(new double[] { 1, 1, 1, 4, 1 }).isValidShape());
		assertFalse(new Shape(new double[] { 1, 1, 1, 10, 1 }).isValidShape());
		assertTrue(new Shape(new double[] { 1, 1, 1, 1, 1,1,1,1,1,1,1 }).isValidShape());
		assertFalse(new Shape(new double[] { 0, 1, 1, 1, 1,1,1,1,1,1,1 }).isValidShape());
		assertFalse(new Shape(new double[] { -1, 1, 1, 1, 1,1,1,1,1,1,1 }).isValidShape());
		assertFalse(new Shape(new double[] { 11, 1, 1, 1, 1,1,1,1,1,1,1 }).isValidShape());
		assertFalse(new Shape(new double[] { 100, 1, 1, 1, 1,1,1,1,1,1,1 }).isValidShape());
	}

	@Test
	public void isNEqualSides() {
		assertTrue(new Shape(new double[] { 1, 1, 1, 1, 1 }).hasNEqualSides(5));
		assertFalse(new Shape(new double[] { 1, 1, 1, 1, 1 }).hasNEqualSides(4));
		assertTrue(new Shape(new double[] {4,5,6}).hasNEqualSides(1));
		assertTrue(new Shape(new double[] {4,4,4}).hasNEqualSides(3));
		assertFalse(new Shape(new double[] {4,4,4}).hasNEqualSides(2));
		assertFalse(new Shape(new double[] {0,4,4,4,4}).hasNEqualSides(4));
		assertFalse(new Shape(new double[] {-4,4,4,4,4}).hasNEqualSides(4));
		assertFalse(new Shape(new double[] {100,4,4,4,4}).hasNEqualSides(4));
		assertFalse(new Shape(new double[] {16,4,4,4,4}).hasNEqualSides(4));
	}
}


