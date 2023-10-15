package com.jsp.p1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueEle_Array {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size");
		int len=scn.nextInt();
		List<Integer> s=new ArrayList<Integer>();
		System.out.println("enter array elements");
		for(int i=0;i<len;i++)
			s.add(scn.nextInt());	
		
		for(int i=0;i<s.size();i++)
			for(int j=i+1;j<s.size();j++) 
				if(s.get(i)==s.get(j)) s.remove(j);
		
		for(int i=0;i<s.size();i++)
			System.out.println(s.get(i));
		
		System.out.println(s.size());
	}

}
