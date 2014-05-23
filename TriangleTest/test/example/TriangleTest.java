package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void triangleHasAllPositivesides() {
		assertTrue(new Triangle(2,2,3).isValidTrangle());
		assertFalse(new Triangle(-2,2,3).isValidTrangle());		
		assertFalse(new Triangle(-2,-2,3).isValidTrangle());		
		assertFalse(new Triangle(-2,-2,-3).isValidTrangle());		
		assertFalse(new Triangle(2,-2,3).isValidTrangle());		
		assertFalse(new Triangle(2,2,-3).isValidTrangle());		
		assertFalse(new Triangle(-2,2,-3).isValidTrangle());		
		assertFalse(new Triangle(2,-2,-3).isValidTrangle());		
		assertFalse(new Triangle(2,-2,-3).isValidTrangle());		
		assertFalse(new Triangle(0,2,3).isValidTrangle());		
		assertFalse(new Triangle(0,-2,3).isValidTrangle());		
		assertFalse(new Triangle(0,-2,0).isValidTrangle());		
		assertFalse(new Triangle(0,0,0).isValidTrangle());		
	}
	
	@Test
	public void isoscelHasTwoEqualSides(){
		assertTrue(new Triangle(2,2,3).isEqualTwosides());
		assertFalse(new Triangle(2,2,2).isEqualTwosides());
		assertFalse(new Triangle(3,4,5).isEqualTwosides());
		assertTrue(new Triangle(2,2,3).isEqualTwosides());
		assertFalse(new Triangle(-2,2,3).isEqualTwosides());		
		assertFalse(new Triangle(-2,-2,3).isEqualTwosides());		
		assertFalse(new Triangle(-2,-2,-3).isEqualTwosides());		
		assertFalse(new Triangle(2,-2,3).isEqualTwosides());		
		assertFalse(new Triangle(2,2,-3).isEqualTwosides());		
		assertFalse(new Triangle(-2,2,-3).isEqualTwosides());		
		assertFalse(new Triangle(2,-2,-3).isEqualTwosides());		
		assertFalse(new Triangle(2,-2,-3).isEqualTwosides());		
		assertFalse(new Triangle(0,2,3).isEqualTwosides());		
		assertFalse(new Triangle(0,-2,3).isEqualTwosides());		
		assertFalse(new Triangle(0,-2,0).isEqualTwosides());		
		assertFalse(new Triangle(0,0,0).isEqualTwosides());
	}
	
	@Test
	public void twoSidesBiggerThanThird() {
		assertTrue(new Triangle(2,2,3).isValidTrangle());
		assertFalse(new Triangle(1,2,3).isValidTrangle());
		assertTrue(new Triangle(2,2,3).isValidTrangle());
		assertFalse(new Triangle(-2,2,3).isValidTrangle());		
		assertFalse(new Triangle(-2,-2,3).isValidTrangle());		
		assertFalse(new Triangle(-2,-2,-3).isValidTrangle());		
		assertFalse(new Triangle(2,-2,3).isValidTrangle());		
		assertFalse(new Triangle(2,2,-3).isValidTrangle());		
		assertFalse(new Triangle(-2,2,-3).isValidTrangle());		
		assertFalse(new Triangle(2,-2,-3).isValidTrangle());		
		assertFalse(new Triangle(2,-2,-3).isValidTrangle());		
		assertFalse(new Triangle(0,2,3).isValidTrangle());		
		assertFalse(new Triangle(0,-2,3).isValidTrangle());		
		assertFalse(new Triangle(0,-2,0).isValidTrangle());		
		assertFalse(new Triangle(0,0,0).isValidTrangle());
	}
	
	@Test
	public void isoscelHas3EqualSides() {
		assertTrue(new Triangle(2,2,2).isEqual3sides());
		assertFalse(new Triangle(2,2,3).isEqual3sides());
		assertFalse(new Triangle(2,2,3).isEqual3sides());
		assertFalse(new Triangle(-2,2,3).isEqual3sides());		
		assertFalse(new Triangle(-2,-2,3).isEqual3sides());		
		assertFalse(new Triangle(-2,-2,-3).isEqual3sides());		
		assertFalse(new Triangle(2,-2,3).isEqual3sides());		
		assertFalse(new Triangle(2,2,-3).isEqual3sides());		
		assertFalse(new Triangle(-2,2,-3).isEqual3sides());		
		assertFalse(new Triangle(2,-2,-3).isEqual3sides());		
		assertFalse(new Triangle(2,-2,-3).isEqual3sides());		
		assertFalse(new Triangle(0,2,3).isEqual3sides());		
		assertFalse(new Triangle(0,-2,3).isEqual3sides());		
		assertFalse(new Triangle(0,-2,0).isEqual3sides());		
		assertFalse(new Triangle(0,0,0).isEqual3sides());
	}

}
