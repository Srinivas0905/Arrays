package com.jsp.p1;

public class Alphabetical_order {

	public static void main(String[] args) {
		String s="xnppxnnpxa";
		int smallest=0;
		char c='a';
		
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			int count=0;
			
			for(int j=i+1;j<s.length();j++)
			{
				char ch2=s.charAt(j);
				if(ch1==ch2)	count++;
			}
			if(count>smallest)
				{
					c=ch1;
					smallest=count;
				}
			else if(c>ch1 && count==smallest) c=ch1;
		}
		System.out.println(c);

	}
	

}
