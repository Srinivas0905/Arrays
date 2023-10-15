package com.jsp.p1;

public class Remove_Spaces {

	public static void main(String[] args) {
		String s="java is easy";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c != ' ')
				s1+=c;
		}
		System.out.println(s1);
	}

}
