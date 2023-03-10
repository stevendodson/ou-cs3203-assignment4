import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class assignment4Test {

	@Test
	public final void testTotalAtEnd() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(-9);
		arr.add(0);
		arr.add(2);
		arr.add(3);
		assertTrue(new assignment4().isTotalInList(arr, 5));
	}
	
	@Test
	public final void testTotalAtBeginning() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(0);
		arr.add(1);
		assertTrue(new assignment4().isTotalInList(arr, 5));
	}
	
	@Test
	public final void testTotalOnBothSides() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(-56);
		arr.add(0);
		arr.add(5);
		assertTrue(new assignment4().isTotalInList(arr, 7));
	}
	
	@Test
	public final void testNoTotal() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(78);
		arr.add(4);
		arr.add(-9);
		assertFalse(new assignment4().isTotalInList(arr, 78));
	}
	
	@Test
	public final void testNegativeTotal() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(-2);
		arr.add(0);
		arr.add(3);
		arr.add(-7);
		arr.add(1);
		arr.add(9);
		assertTrue(new assignment4().isTotalInList(arr, -9));
	}
	@Test
	public final void testEmptyList() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		assertFalse(new assignment4().isTotalInList(arr, 5));
	}
	@Test
	public final void testOneElementList() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		assertFalse(new assignment4().isTotalInList(arr, 5));
	}
	@Test
	public final void testZeroAsTotal() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(-3);
		arr.add(3);
		arr.add(1);
		assertTrue(new assignment4().isTotalInList(arr, 0));
	}
	
}
