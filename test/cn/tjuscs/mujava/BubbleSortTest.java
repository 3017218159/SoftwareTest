package cn.tjuscs.mujava;

import static org.junit.Assert.*;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void testBubbleSort() {
		int arr[] = new int[]{1,3,2,5,2};
		int result[] = new int[] {1,2,2,3,5};
		BubbleSort.BubbleSort(arr);
		assertArrayEquals(result, arr);
	}
	
	@Test
	public void testBubbleSort2() {
		int arr[] = new int[]{2,1,2,2,3};
		int result[] = new int[] {1,2,2,2,3};
		BubbleSort.BubbleSort(arr);
		assertArrayEquals(result, arr);
	}
	
	@Test
	public void testBubbleSort3() {
		int arr[] = new int[]{1,2,2,5,2};
		int result[] = new int[] {1,2,2,2,5};
		BubbleSort.BubbleSort(arr);
		assertArrayEquals(result, arr);
	}
	
	@Test
	public void testBubbleSort4() {
		int arr[] = new int[]{1};
		int result[] = new int[] {1};
		BubbleSort.BubbleSort(arr);
		assertArrayEquals(result, arr);
	}
	
	@Test
	public void testBubbleSort5() {
		int arr[] = new int[]{2,2,2,1,2,13};
		int result[] = new int[] {1,2,2,2,2,13};
		BubbleSort.BubbleSort(arr);
		assertArrayEquals(result, arr);
	}
}
