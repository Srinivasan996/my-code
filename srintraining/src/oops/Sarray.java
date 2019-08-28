package oops;

public class Sarray {
	public static void main(String[] args)
	{     //one dim array
		String[] names=new String[] {"cprogram","c++program","javaprogram"};
		System.out.println("elements are one dimnesion array");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]+ " ");
		}
		//2 dim array
		System.out.println("2dinmenssion array");
		String dim2[][]=new String[][] {{"10","muthu"	},{"8","ram"},{"10","siva"}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(dim2[i][j]+ " ");
			}
			System.out.println();
		}
		//square string
		System.out.println("square the string array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				dim2[i][j] = dim2[i][j]*dim2[i][j];
				System.out.println(dim2[i][j]+ "  ");
				
			}
		}
		
	}
}
