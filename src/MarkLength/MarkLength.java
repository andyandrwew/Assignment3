package MarkLength;

import java.util.ArrayList;
import java.util.List;

public class MarkLength
{
	List<String> list = null;
	StringBuilder sb = new StringBuilder();
	
	public MarkLength(List<String> list)
	{
		// TODO Auto-generated constructor stub
		this.list = list;
		System.out.println(doIt());
	}
	
	public String doIt()
	{
		for(String a : list)
		{
			if(a.length() == 4)
			{
				sb.append("**** " + a + " ");
			}
			else
			{
				sb.append(a + " ");
			}
		}
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		List<String> list = new ArrayList<>();		
		list.add("this");
		list.add("is");
		list.add("lots");
		list.add("of");
		list.add("fun");
		list.add("for");
		list.add("java");
		list.add("coders");
		
		MarkLength ml = new MarkLength(list);

	}

}
