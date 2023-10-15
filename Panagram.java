package com.jsp.p1;

public class Panagram {

	public static void main(String[] args) {
		String s1="listent";
		String s2="silente";
		if(check(s1,s2))
			System.out.println("panagram");
		else System.out.println("not panagram");

	}
	public static boolean check(String s1,String s2)
	{	
		while(s1.length()==s2.length())
		{
			char c=s1.charAt(0);
			s1=s1.replace(c+"","");
			s2=s1.replace(c+"","");
			if(s1.length()==0 && s2.length()==0)
				return true;
		}
		return false;
	}

}
