package oops;

public class ByPassValue {
	
	public static void main(String[]args)
	{	
	int x=3;
	changeIt(x);
	
     System.out.println("in side main method:   " +x);
     
	}

	
	public static void changeIt(int x)
    {
        x = 50;
        System.out.println("x value inside changeIt method : " + x);
        return;
    }

}
