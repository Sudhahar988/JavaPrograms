package JavaPrograms;

public class N8_Count {

	public static int j=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			String Str="Ramesh";		
			int i=1;
			while(Str.substring(j, i)!=null){
				j+=1;
				i+=1;
			}
				
		}
		catch(Exception e){
			
			System.out.println("The length is : "+j);
		}
		
	}

}
