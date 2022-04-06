package Array.ArrayInsert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
//package Array.ArrayInsert.*;

import org.junit.Assert;
import org.junit.Test;


public class ArrayInsertionTest {
	public static ArrayInsertion object2;
	int [] arr1= new int[2];
	int [] arr2= new int[2];
	int [] arr3= {2,5};
	int [] arr4= {3,5};
	@Test
	public void SuccessfulArrayInsertion()
	{
		arr2[0]=6;
		Assert.assertArrayEquals(arr2, object2.insert(arr1, 6, 0));
	}
	
	
	@Test
	public void UnsuccessfulArrayInsertion()
	{
		object2.insert(arr1, 5, 1);
		arr2[1]=5;
		Assert.assertArrayEquals(arr3, object2.insert(arr1, 2, 0));
	}
}
