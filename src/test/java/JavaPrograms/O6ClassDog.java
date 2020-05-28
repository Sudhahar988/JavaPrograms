package JavaPrograms;

public class O6ClassDog {
//	int a;
	
	
	public O6ClassDog(){
		System.out.println("Im a constructor");	
	}
	
	public void behaviour(){
		System.out.println("Dog barks");
	}
	
	public void states(){
		System.out.println("black in color");
	}
	
	public static void main(String[] args){
		
		O6ClassDog behav=new O6ClassDog();
		behav.behaviour();
		O6ClassDog Stat=new O6ClassDog();
		Stat.states();
	}

}
