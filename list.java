package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list1=new ArrayList<Integer>();
		List <Integer> list2=new ArrayList<Integer>();
		List<Integer> list3=new ArrayList<>();
		Scanner scan =new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<5;i++)
		{
			int x=scan.nextInt();
			arr[i]=x;	
		}
		
		for(int i=0;i<5;i++)
		{
			if (arr[i]>=0)
			{
				list1.add(arr[i]);
			}
			else
			{
				list2.add(arr[i]);
			}
		}
		
		list3.addAll(list1);
		list3.addAll(list2);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}

}
