package RangeBetweenZeros;

import java.util.*;

public class RangeByZeros
{
	List<Integer> list;
	Iterator it;

	public RangeByZeros(List<Integer> listOfIntegers)
	{
		// TODO Auto-generated constructor stub
		
		list = listOfIntegers;
	}
	
	public int getFarthestRangeByZero()
	{
		int largestPosition = -1;
		
		for(Iterator<Integer> it = list.iterator(); it.hasNext();)
		{
			int a = it.next();
			
			if (a == 0)
			{
				largestPosition = a;
			}
		}
		
		
		return largestPosition;
	}
	
	public int getClosestRangeByZero()
	{
		int closest = -1;
		
		for(int a = list.size(); a > 0; a--)
		{
			if(a == 0)
			{
				closest = a;
			}
			
		}
		
		return closest;
		
		
	}
	
	
	public int getRangeByZero()
	{
		return (getFarthestRangeByZero() - getClosestRangeByZero());
	}
	
	
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList();
		
		list.add(7);
		list.add(2);
		list.add(0);
		list.add(0);
		list.add(4);
		list.add(0);
		list.add(9);
		list.add(0);
		list.add(6);
		list.add(4);
		list.add(8);
		
		RangeByZeros range = new RangeByZeros(list);
		System.out.println("Range is: " + range.getRangeByZero());



	}

}
