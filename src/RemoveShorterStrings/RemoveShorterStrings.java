package RemoveShorterStrings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveShorterStrings
{
	
	StringBuilder sb = new StringBuilder();
	List<String> list = new ArrayList<String>();
	
	public RemoveShorterStrings(List<String> list)
	{
		// TODO Auto-generated constructor stub
		this.list = list;
		remove();
	}
	
	public void remove()
	{
		for(int i = 1; i <= list.size()-2; i += 2) 
		{
			if(list.get(i).length() <= list.get(i-1).length())
			{
				list.remove(i);
			}
			else
			{
				list.remove(i-1);
			}
		}
		return;
	}
	
	public String toString()
	{
		
		for(String i : list)
		{
			sb.append(i + ", ");
		}
		
		return sb.toString();
	
	}
	
	
	public static void main(String args[])
	{
		List<String> list = new ArrayList<>();
		
		list.add("four");
		list.add("score");
		list.add("and");
		list.add("seven");
		list.add("years");
		list.add("ago");
		list.add("our");
		
		RemoveShorterStrings r = new RemoveShorterStrings(list);
		
		r.remove();
		
		System.out.println(r.toString());
	}

}
