package JavaPrograms;

public class M8_Crosspramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		System.out.println("**************************");
		for(i=0;i<=5;i++){
			for(j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}

		
		for(i=5;i>0;i--){
			for(j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		

		for(i=5;i>0;i--){
			for(j=0;j<i;j++){
				System.out.print("1");
			}
			System.out.println("");
		}
		for(i=0;i<=5;i++){
			for(j=0;j<i;j++){
				System.out.print(j+1);
			}System.out.println("");
		}
	}

}
