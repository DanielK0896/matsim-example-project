package org.matsim.class2019.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
	
	@Test
	public void testCalculateArea() {
		
		Rectangle rect = new Rectangle(10, 20);
		
		double area = rect.calculateArea();
		
		System.out.println("The area is: " + area);
		assertEquals(100, area, 0.0001);
	}
}
