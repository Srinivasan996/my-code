package oops;

class Employee
{

    private String name;
    private int age;

    Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

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
 
public class EmployeeDemoTest {

	public static void main(String[] args) {
		Employee davidEmployee = new Employee("David", 25);
        System.out.println("Name get: " + davidEmployee.getName());
        System.out.println("Age  : " + davidEmployee.getAge());
        System.out.println("-------------------------------");
        Employee johnEmployee = new Employee("John", 45);
        System.out.println("Name : " + johnEmployee.getName());
        System.out.println("Age  : " + johnEmployee.getAge());

		// TODO Auto-generated method stub

	}

}
