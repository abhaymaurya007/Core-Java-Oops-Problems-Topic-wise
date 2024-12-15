package Prob10.abhay.oops;

public class EmployeeTester{
    public static void main (String []args){
       Developer d1=new Developer("aashish",111,15000,5000);
       System.out.println(d1.calculateSalary()); 
       Manager m1=new Manager("aashish",111,15000,4000,6000);
       System.out.println(m1.calculateSalary());
    }
}