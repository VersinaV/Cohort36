package lesson_53.exemple01;

public class Main {


  public static void main(String[] args) {
    Employee employee = Employee.getDefault();
    System.out.println(employee);
    employee = Employee.ofDefaultJob("Marie", Jobs.HR);
    System.out.println(employee);

  }
}
