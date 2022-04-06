package Array.ArrayDeletion;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Assert;

import Array.ArrayDeletion.*;
import org.junit.Test;



public class ArrayDeletionTest {
	public static ArrayDeletion object = new ArrayDeletion();
	int [] arr = {1,2,3,4,5};
	int [] arr2= {1,3,4,5,-1};
	@Test(expected = IllegalArgumentException.class)
	public void IndexToDeleteLTZero()
	{
		object.delete(arr, -1);
	}
	
	@Test(expected = IllegalArgumentException.class)
    public void IndexToDeleteLargerThanArray()               
    {                                               
    	object.delete(arr, 6);                     
    }
	@Test
	public void SuccessfulDeletionOfData()
   {                                
    	Assert.assertArrayEquals(arr2, object.delete(arr, 1));      
   }                                
}