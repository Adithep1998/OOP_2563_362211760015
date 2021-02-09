package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {
        //use default constructor
        Employee emp1 = new Employee();



        //use assign constructor
        Employee emp2 = new Employee("Adithep Chuklin",22,"Student",3000);

        emp1.displayData();
        System.out.println();
        emp2.displayData();

        //assign data to emp1
        emp1.setName("Piyapong Senanut");
        emp1.setAge(37);
        emp1.setPosition("Dean");
        emp1.setSalary(50000);

        emp1.displayData();
        System.out.println("Emp name : "+emp1.getName());










    }//main
}//class
