package com.jsp.p1;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter any num");
		int n=scn.nextInt();
		int[][] a=spiral(n);
		for(int[] a1:a)
		{
			for(int a2:a1)
				System.out.print(a2+"\t");
			System.out.println();
		
		}

	}
	public static int[][] spiral(int n)
	{
		int[][]a=new int[n][n];
		char d='r';
		int r=0,c=-1;
		for(int i=1;i<=n*n;i++)
		{
			switch(d)
			{
			case 'r':c++;
					a[r][c]=i;
					if(c==n-1 || a[r][c+1]!=0)
						d='d';
					break;
			case 'd':r++;
					a[r][c]=i;
					if(r==n-1 || a[r+1][c]!=0)
						d='l';
					break;
			case 'l':c--;
					a[r][c]=i;
					if(c==0||a[r][c-1]!=0)
						d='u';
					break;
			case 'u':r--;
					a[r][c]=i;
					if(a[r-1][c]!=0)
						d='r';
			}
			
			
			
		}
		
		return a;
	}

}
