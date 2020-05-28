package Encapsulation;

public class A5_EncapsTest 
{
    public static void main(String args[]){
        A4_Encapsulation obj = new A4_Encapsulation();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSSN(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
   } 

}
