package com.wipro.test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestSort {
	int[] arr = {9,6,4,3,2,12};
	DailyTasks dailyTasks = new DailyTasks();
	
	@Test
	public void testSortValue() {
		System.out.println("Inside test sort");
		int[] output = {2,3,4,6,9,12};
		assertArrayEquals(output,dailyTasks.sortValues(arr));
	}
}
