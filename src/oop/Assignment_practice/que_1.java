package oop.Assignment_practice;

public class que_1 {
    public static void main(String[] args) {
       Employee[] emp=new Employee[10];
       emp[0]=new Employee("e1", "manasvi", JobEnums.HOD, 130000);
        emp[1]=new Employee("e2", "priya", JobEnums.HOD, 120000);
        emp[2]=new Employee("e3", "mansi", JobEnums.Peon, 13000);
        emp[3]=new Employee("e4", "prinsi", JobEnums.Prof, 23000);
        emp[4]=new Employee("e5", "krushali", JobEnums.Principle, 25000);
        emp[5]=new Employee("e6", "sanjana", JobEnums.Peon, 15000);
        emp[6]=new Employee("e7", "tulsi", JobEnums.Principle, 100000);
        emp[7]=new Employee("e8", "isha", JobEnums.Peon, 18000);
        emp[8]=new Employee("e9", "brijesha", JobEnums.Prof, 70000);
        emp[9]=new Employee("e10", "vansh", JobEnums.HOD, 140000);
        Employee.Calculate(emp);
    }
}
class Employee{
    String empId;
    String name;
    JobEnums jobTitle;
    int salary;

    public Employee(String empId, String name, JobEnums jobTitle, int salary) {
        this.empId = empId;
        this.name=name;
        this.jobTitle = jobTitle;
        this.salary=salary;
    }

    public static void Calculate(Employee[] emp){
        int pAns=0;
        int PrAns=0;
        int hAns=0;
        int PriAns=0;
        for(int i=0; i< emp.length; i++){
            if(emp[i].jobTitle.equals(JobEnums.Peon)){
                pAns+=emp[i].salary;
            }else if(emp[i].jobTitle.equals(JobEnums.Prof)) {
                PrAns += emp[i].salary;
            }else if(emp[i].jobTitle.equals(JobEnums.HOD)) {
                hAns += emp[i].salary;
            }else if(emp[i].jobTitle.equals(JobEnums.Principle)) {
                PriAns += emp[i].salary;
            }
        }
        System.out.println("Peon Salary - " + pAns);
        System.out.println("Professor Salary - " + PrAns);
        System.out.println("HOD Salary - " + hAns);
        System.out.println("Principle Salary - " + PriAns);
    }
}
enum JobEnums{
    Peon, Prof, HOD, Principle
}