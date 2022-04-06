package Array.FullArray;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
	int insertNum=6;
	public static Array objArr= new Array();
	//default constructor test
	@Test
	public void DefaultConstructorTest() {
		
		Assert.assertEquals(100, objArr.returnLengthArr());
	}
	//insertion exception when position given is less than 0
	@Test(expected = IllegalArgumentException.class)
	public void InsertExceptionThrowTestLTZero()
	{
		objArr.insert(4, -1);
	}
	//insertion exception when position given is greater than 99
	@Test(expected = IllegalArgumentException.class)
	public void InsertExceptionThrowTestGTMax()
	{
		objArr.insert(4, 100);
	}
	//insertion success when all parameters are correct
	@Test
	public void InsertSuccessTest()
	{
		objArr.insert(insertNum, 6);
		Assert.assertEquals(objArr.array[6], insertNum);
	}
	
	//deletion test when position given is less than 0
	@Test(expected = IllegalArgumentException.class)
	public void DeletionExceptionThrowTestLTZero()
	{
		objArr.delete(-1);
	}
	//deletion test when position given is greater than 99
	@Test(expected = IllegalArgumentException.class)
	public void DeletionExceptionThrowTestGTMax()
	{
		objArr.delete(100);
	}
	//deletion success
	@Test
	public void DeletionSuccessTest()
	{
		int indexToDelete=24;
		int numToCompare=objArr.array[indexToDelete+1];
		objArr.delete(indexToDelete);
		Assert.assertEquals(numToCompare, objArr.array[indexToDelete]);
	}
	
	//linear search method success
	@Test
	public void LinearSearchSuccess()
	{
		objArr.insert(420, 69);
		Assert.assertEquals(true,objArr.linearSearch(420));
	}
	
	//linear search method failure
	@Test
	public void LinearSearchFailure()
	{
		Assert.assertEquals(false,objArr.linearSearch(69));
	}
	
	//bubble sort failure
	@Test
	public void BubbleSortFailureTest()
	{
		Assert.assertEquals(false, objArr.isSorted());
	}
	
	//bubble sort test
	@Test
	public void BubbleSortSuccessTest()
	{
		objArr.bubbleSort();
		Assert.assertEquals(true, objArr.isSorted());
	}
	
		

}
