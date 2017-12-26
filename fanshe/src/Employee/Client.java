package Employee;

public class Client {
    public static  void main(String args[])
    {
        Employee employee = new Employee();
        Class test =employee.getClass();

       System.out.println("classname:"+test.getName());
    }
}
