package oops;
class Student
{

    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

}

public class ByPassValue2 {
	public static void main(String[] args)
    {

        Student stuObject = new Student();
          stuObject.setName("srini");
          stuObject.setAge(24);
          
          
        System.out.println("Before calling changeIt method ");

        System.out.println("Name : " + stuObject.getName());
        System.out.println("Age : " + stuObject.getAge());

        System.out.println("-------------------------- ");

        changeIt(stuObject);

        System.out.println("After calling changeIt method ");

        System.out.println("Name : " + stuObject.getName());
        System.out.println("Age : " + stuObject.getAge());

    }

    /*
     * Passing Reference Data Type Arguments :
     * 
     * Reference data type parameters, such as objects, are also passed into
     * methods by value. This means that when the method returns, the passed-in
     * reference still references the same object as before. However, the values
     * of the object's fields can be changed in the method, if they have the
     * proper access level.
     */

    public static void changeIt(Student stuObject)
    {
        stuObject.setName("Sawyer");
        stuObject.setAge(29);
    }


}
