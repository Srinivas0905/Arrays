package com.jsp.p1;

public class Pascal {

	public static void main(String[] args) {
		int[][] a=new int[5][];
		int space=5;
		a=pascal(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<=space;j++) System.out.print(" ");
			for(int j=0;j<a[i].length;j++) System.out.print(a[i][j]+" ");
			System.out.println();
			space--;
		}

	}
	public static int[][] pascal(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0 || j==i)
					a[i][j]=1;
				else
					a[i][j]=a[i-1][j]+a[i-1][j-1];
			}
		}
		
		return a;
	}

}
