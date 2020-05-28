package JavaPrograms;

public class M1_Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j=1;
		for (i=1;i<=5;i++)
		{
			j=i*j;
			System.out.println(j);
			
		}
		System.out.println("Factorial value is:"+j);
	}
}


//}

/*
1*1=1
1*2=2
2*3=6
6*4=24
24*5=120
*/