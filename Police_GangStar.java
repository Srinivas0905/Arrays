package com.jsp.p1;
import java.util.Arrays;
import java.util.Scanner;

public class Police_GangStar {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the p and g");
		String s=scn.next();
		char[] c=s.toCharArray();
		System.out.println(Arrays.toString(c));
		int count=0,count1=0;
		for(int i=0;i<c.length;i++)
		{
			char ch=c[i];
			if(ch=='p')
				count++;
			else if(ch=='g')
				count1++;
		}
		if(count<count1)
			System.out.println(count);
		else
			System.out.println(count1);
			
		

	}

}
