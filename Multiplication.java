package com.jsp.p1;

public class Multiplication {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{2,3,4},{3,4,5}};
		int[][] b= {{1,2,3},{2,3,4},{3,4,5}};
		int[][]c=multiply(a,b);
		for(int[] a1:c)
		{
			for(int a2:a1)
				System.out.print(a2+"\t");
			System.out.println();
			System.out.println();
		}
	}
	public static int[][] multiply(int[][] a,int[][] b)
	{
		int size=a.length;
		int[][] c=new int[size][size];
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				int sum=0;
				for(int k=0;k<size;k++) 	sum+=a[i][k]*b[k][j];
				c[i][j]=sum;
			}
		}
		return c;
	}
}
