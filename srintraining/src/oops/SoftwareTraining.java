package oops;
public class SoftwareTraining {
	String name="Payilagam"; // Instance variable
    String course="Java";
	public static void main(String[] args) 
	{
		   SoftwareTraining st=new SoftwareTraining(); 
		   SoftwareTraining stt= new SoftwareTraining();
		   System.out.println("1st Time memory location: "+st);
		    System.out.println("2nd Time memory location: "+stt); 
		   System.out.println(st.name); 
		   System.out.println(st.course);  
		   System.out.println(stt.name);
		   System.out.println(stt.course); 
		   
	} }
	
