public class Employee {
    //constructor overloading
    String name;
    int age;
    float salary;
    Employee() 
    {
        name="harshini";
        age=20;
        salary=0.0f;
    }
    Employee(String name,int age,float  salary) 
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    Employee(String name,float  salary)
    {
        this.name=name;
        this.salary=salary;
    } 
    void display()
    {
        System.out.println("Name : " + name + " , age : " + age + " , salary :" + salary);
    }
    public static void main(String[] args) {
        Employee c1=new Employee();
        Employee c2=new Employee("jahnavi" ,20,2000);
        Employee c3=new Employee("manasa" ,1000);
        c1.display();
        c2.display();
        c3.display();


    }
    


}
