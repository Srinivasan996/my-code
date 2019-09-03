package srintraining;

import java.util.Scanner;

public class FirstLetterCaps {

	public static void main(String[] args) {
		System.out.println("enter the string");
	      Scanner scan=new Scanner(System.in);
	      String ipString = scan.nextLine();
	      char[] ch = ipString.toCharArray();
	      String result = " ";
	 
	      for (int i = 0; i < ch.length; i++)
	      {
	 
	         //condition to allow 1st letter and 1st letter after space to capitalize
	         if (i==0||ch[i-1]==' ') 
	         {
	    
	            // 97-122 ASCII number of lower case which needs be converted to upper case
	            if (ch[i]>=97&&ch[i]<=122)
	            {
	               result = result+(char)(ch[i]-32);
	            }
	 
	            else
	               result = result+ch[i];
	         }
	 
	         //if other than first letter is capital then it should be converted to lower case
	         else if (ch[i]>=65&&ch[i]<=90)
	         {
	            result = result+(char)(ch[i]+32);
	         }
	 
	         else
	            result = result+ch[i];
	      }
	 
	      System.out.println(result);
	   }
	
	//Auto-generated method stub

	}


