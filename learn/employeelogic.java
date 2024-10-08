package learn;

/**
 * employeelogic
 */
public class employeelogic {

    int id;
    String Name;
    String dept;

    employeelogic(int id,String Name, String dept){
        this.id=id;
        this.Name=Name;
        this.dept=dept;
    }

    void printdetails(int id){
        System.out.println("Id is: "+id);
    }
    void printdetails(int id,String Name){
        System.out.println("ID is: "+id+"Name is: "+Name);
    }
}