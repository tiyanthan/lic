package ex;

import java.util.ArrayList;
import java.util.List;

public class duplicate {

	public static void main(String[] args) {
		List<Integer> list1 =new ArrayList<>();
	
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(4);
		list1.add(3);
		list1.add(5);
		list1.add(7);
		list1.add(5);

		
		for(int j=0;j<list1.size();j++)
		{
			for(int i=j;i<list1.size()-1;i++)
			{
				if(list1.get(j)==list1.get(i+1))
				{
					list1.remove(i+1);
				}
			}
		}
		System.out.println(list1);
		
		int arr[]= {1,2,3,3,4,5};
		int arr1[]=new int[arr.length];
		
		for(int j=0;j<arr.length;j++)
		{
			for(int i=j;i<arr.length-1;i++)
			{
				if(arr[j]!=arr[i+1])
				{
					arr1[i]=arr[i];
				}

			}
		}
		for(int i=0;i<arr.length;i++)
		{
			{
				//System.out.println(arr[i]);
			}
		}
		
		
		
	}

}
