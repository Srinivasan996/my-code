package oops;
//square elements in two dim arry
public class SampleArray {

	public static void main(String[] args) {
		int square [][] = {{1,2,3},{4,5,6}};
		System.out.println("your origanal matrix: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(square[i][j] + "  ");
			}
			
			 System.out.println();	
		}
		System.out.println("matrix after changes: ");
		 for(int i=0;i<2;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 square[i][j] = square [i][j]*square[i][j];
				 
				 System.out.print(square[i][j]+ "  ");
				 
			 }
			 System.out.println( );
		 }
		 /*System.out.println("matrix after changes: ");
		 for(int i=0;i<2;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 System.out.print(square[i][j] + " ");
				 
			 }
			 System.out.println();
		 }*/
		 
	}

}
