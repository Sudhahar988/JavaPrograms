package JavaPrograms;

public class O7_Accessmodifier {
	
	public void publicmodifier()
	{
		System.out.println("Use public modifier");
		System.out.println("Hi Sudhahar");
	}
	private void privatemodifier()
	{
		System.out.println("Use private modifier");
	}
	protected  void protoctedmodifier()
	{
		System.out.println("Use protected modifier");
	}
	void defaultmodifier()
	{
		System.out.println("Use defaultmodifier");
	}



	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
		
		O7_Accessmodifier acc=new O7_Accessmodifier();
		acc.publicmodifier();
		acc.privatemodifier();
		acc.protoctedmodifier();
		acc.defaultmodifier();
	}

}
