package com.jsp.p1;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		int[] a= {2,3,4,5,67,10};
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			a[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(a));
		

	}

}
