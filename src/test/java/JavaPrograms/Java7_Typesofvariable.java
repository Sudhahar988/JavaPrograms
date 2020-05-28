package JavaPrograms;

public class Java7_Typesofvariable {
	public int star;
	//private String Str="TEST";
	public static String Str;  //
	
	public void pupAge(){
		int age = 2;        //declared in local variable
		age = age + 7;  
		System.out.println("Local variable value :"+" Puppy age is : " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java7_Typesofvariable test = new Java7_Typesofvariable();
		test.pupAge();   //local variable used for with in method we called the method name only. 

//		Str="Sudhahar";  //  Directly declared in static variable 
		System.out.println("Static variable value : "+Str);
		
	}

}
