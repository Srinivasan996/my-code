package srintraining;
//access super class member
public class SuperTest
{

    public static void main(String[] args)
    {
        SubClass subClassObj = new SubClass();
        subClassObj.printMethod();
    }
}
class Super
{
    String name = "Payilagam";
    public void printMethod()
    {
        System.out.println("Print in Superclass.");
    }
}
 
 class SubClass extends Super
{

    String Name = "Srini";

    // overrides printMethod in Superclass
    public void printMethod()
    {
        super.printMethod();
        System.out.println("name : " + name);
        System.out.println("super.name : " + super.name);
        System.out.println("Printed in Subclass");
    }

}





