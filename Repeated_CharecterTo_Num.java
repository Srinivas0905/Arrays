package com.jsp.p1;

public class Repeated_CharecterTo_Num {

	public static void main(String[] args) {
		String s="hello world";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int count=1;
			
			for(int j=i;j<s.length();j++)
			{
				char c1=s.charAt(j);
				if(c==c1) 
				{  
					count++;
					System.out.println(c1+" "+j);
					s=s.replace(c+"",1+"");
					s=s.replace(c1+"",count+"");
				
				}
			}
		}
		System.out.println(s);

	}

}
