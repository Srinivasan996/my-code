package demostring;
public class SampleString {
	public static void main(String[] args ) 
	{
		String s= "srinivasan";
/*     int l;
       l=s.length(); //This method is used to get the number of character of any string.
	    System.out.println("string length:" +l);     */
		
/*     char c;
		c=s.charAt(0);//This method is used to get the character at a given index value.
		System.out.println("character:" +c);   */
		
/*		String concat;
		concat=s.concat(" Good programmer");//This method is used to combined two string.
		System.out.println("Concat String: " +concat);  */
		
/*    	String capps;
	    capps= s.toUpperCase();
	    System.out.println("Upper case Letter: " +capps);     */
		
/*		String small;
		small=s.toLowerCase();
		System.out.println("lower case Letter:  " +small);      */
		
    	String s1="SriniVasan";
		String s2="saranya";
		//System.out.println("compare string:  " + s1.equals(s)); //case sensitive method,
		//System.out.println("compare string:  "+ s2.equals(s1));   
		
		//System.out.println("compare string:  "+s1.equalsIgnoreCase(s));// case insensitive method,
		//System.out.println("compare string:  "+s1.equalsIgnoreCase(s2));
		
		int i;
		//i=s1.compareTo(s);
		i=s1.compareToIgnoreCase(s);
		if(i==0)
		{
			System.out.println("comapre string is:  "+"string is same");
		}
		else
		{
			System.out.println("compare string is :  "+"string is not same");
		}
		
	
	

	
	}
}
