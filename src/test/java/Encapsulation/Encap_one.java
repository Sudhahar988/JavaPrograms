package Encapsulation;

public class Encap_one 
{
private int SSN;
private String empName;
private int age;

public void setEmpAge(int newAge)
{
	age=newAge;
	System.out.println(age);
}
public int getEmpAge()
{
	return age;
	
}
public void setEmpSSN(int newSSN)
{
	SSN=newSSN;
	System.out.println(SSN);
}
public int getSSN()
{
	return SSN;
	
}
public void setEmpName(String newName)
{
	empName=newName;
	System.out.println(empName);
}
public String getEmpName()
{
	return empName;
}
}
