package oop.Assignment_practice;

public class que_2 {
    public static void main(String[] args) {
        SalarySlip[]s1= new SalarySlip[36];
        s1[0]=new SalarySlip(1001, "manasvi", 50000, 1);
        s1[1]=new SalarySlip(1002, "prinsi", 4000, 1);
        s1[2]=new SalarySlip(1003, "priya", 15000, 1);
        s1[3]=new SalarySlip(1004, "tulsi", 10000, 1);
        s1[4]=new SalarySlip(1005, "krushali", 25000, 1);
        s1[5]=new SalarySlip(1006, "sanjana", 5000, 1);

        s1[6]=new SalarySlip(1001, "manasvi", 21000, 2);
        s1[7]=new SalarySlip(1002, "prinsi", 4000, 2);
        s1[8]=new SalarySlip(1003, "priya", 16000, 2);
        s1[9]=new SalarySlip(1004, "tulsi", 15000, 2);
        s1[10]=new SalarySlip(1005, "krushali", 25000, 2);
        s1[11]=new SalarySlip(1006, "sanjana", 6000, 2);

        s1[12]=new SalarySlip(1001, "manasvi", 19000, 3);
        s1[13]=new SalarySlip(1002, "prinsi", 4000, 3);
        s1[14]=new SalarySlip(1003, "priya", 10000, 3);
        s1[15]=new SalarySlip(1004, "tulsi", 11000, 3);
        s1[16]=new SalarySlip(1005, "krushali", 26000, 3);
        s1[17]=new SalarySlip(1006, "sanjana", 15000, 3);

        s1[18]=new SalarySlip(1001, "manasvi", 60000, 4);
        s1[19]=new SalarySlip(1002, "prinsi", 4000, 4);
        s1[20]=new SalarySlip(1003, "priya", 25000, 4);
        s1[21]=new SalarySlip(1004, "tulsi", 44000, 4);
        s1[22]=new SalarySlip(1005, "krushali", 35000, 4);
        s1[23]=new SalarySlip(1006, "sanjana", 15000, 4);

        s1[24]=new SalarySlip(1001, "manasvi", 50000, 5);
        s1[25]=new SalarySlip(1002, "prinsi", 15000, 5);
        s1[26]=new SalarySlip(1003, "priya", 10000, 5);
        s1[27]=new SalarySlip(1004, "tulsi", 11000, 5);
        s1[28]=new SalarySlip(1005, "krushali", 5000, 5);
        s1[29]=new SalarySlip(1006, "sanjana", 25000, 5);

        s1[30]=new SalarySlip(1001, "manasvi", 80000, 6);
        s1[31]=new SalarySlip(1002, "prinsi", 20000, 6);
        s1[32]=new SalarySlip(1003, "priya", 35000, 6);
        s1[33]=new SalarySlip(1004, "tulsi", 10000, 6);
        s1[34]=new SalarySlip(1005, "krushali", 25000, 6);
        s1[35]=new SalarySlip(1006, "sanjana", 5000, 6);
        SalarySlip.topHighestSalary(s1);
    }
}
class SalarySlip{
    int empId;
    String name;
    int Salary;
    int Month;

    public SalarySlip(int empId, String name, int Salary, int Month) {
        this.empId = empId;
        this.name=name;
        this.Salary=Salary;
        this.Month=Month;
    }
   static void topHighestSalary(SalarySlip[]s1){
        for(int i=1; i<=6; i++){
            int maxSalary=0;
            int maxId=0;
            int maxSalary2=0;
            int maxId2=0;
            for(int j=0; j< s1.length; j++){
                SalarySlip sl=s1[j];
                if(sl.Month==i){
                    if(sl.Salary>maxSalary){
                        maxSalary2=maxSalary;
                        maxId2=maxId;
                        maxSalary= sl.Salary;
                        maxId= sl.empId;
                    }else if(sl.Salary > maxSalary2){
                        maxSalary2= sl.Salary;
                        maxId2=sl.empId;
                    }
                }
            }
            System.out.println(i + " -> " + maxId + " , " + maxId2);
        }
    }
}