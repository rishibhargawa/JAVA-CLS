package Empl;

public class Employee {
    String name1;
    int id;
    int age;
    String dept;

    Employee(String name,int id,int age,String dept){
        name1 = name;
        this.id=id;
        this.age=age;
        this.dept=dept;
    }

    @Override
    public String toString(){
        return (name1 + " " + id + " " + age + " " + dept);
    }
}
