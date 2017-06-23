package Reverse3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reverse3
{

	List<Integer> list = null;
	StringBuilder sb = new StringBuilder();
	
	public Reverse3(List<Integer> list)
	{
		// TODO Auto-generated constructor stub
		this.list = list;
	}
	
	public List<Integer> getSorted()
	{
		List<Integer> list2 = new ArrayList<>();
		
		int cycles = (list.size()/3) * 3;
		int extra = list.size() - cycles;
		
		for(int i = 2; i <= cycles; i += 3)
		{			
			for (int j = 0; j <= 2; j++)
			{
				list2.add(list.get(i - j ));
			}
			
		}
		
		for (int h = cycles; h < list.size(); h++)
		{
			list2.add(list.get(h));
		}
		
		return list2;
	}
	
	public String toString()
	{
		for(Iterator iterator = list.iterator(); iterator.hasNext();)
		{
			sb.append(iterator.next() + " ");
		}
		
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(8);
		list.add(19);
		list.add(42);
		list.add(7);
		list.add(26);
		list.add(19);
		list.add(-8);
		
		System.out.println(new Reverse3(list).getSorted());
	}

}
