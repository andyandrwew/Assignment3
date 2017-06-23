package Stutter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stutter
{
	List<String> list;
	StringBuilder st = new StringBuilder();
	
	
	public Stutter(List<String> list)
	{
		this.list = list;
	}
	
	public String getCopies(int copies)
	{
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			String a = it.next();
			
			for (int count = copies; count > 0; count--)
			{
				st.append(a + " ");
			}
		}
		
		return (st.toString());
	}
	
	public static void main(String args[])
	{
		List<String> array = new ArrayList();
		array.add("how");
		array.add("are");
		array.add("you");
		Stutter stutter = new Stutter(array);
		
		System.out.println(stutter.getCopies(3));
	}
}
