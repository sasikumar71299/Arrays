package arraylearning;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array obj = new Array();
		obj.non_repeatedelement();
		obj.first_repeatedelement();

	}

	private void first_repeatedelement() {
		// TODO Auto-generated method stub
		char[]name= {'v','i','v','e','k'};
		char first = name[0];
		boolean repeated = false;
		int i=1;
		while(i<name.length)
		{
			if(first==name[i])
			{
				repeated=true;
				break;
			}
			i++;
		}
		first = name[i-1];
		repeated= false;
		while(i<name.length)
		{
			if(first==name[i])
			{
				repeated=true;
				break;
			}
			i++;
		}
		
		
		if(repeated==false)
		{
			System.out.println("FIRST NON-REPEATED ELEMENT IS"+ "  "+first);
		
		}
		}
	

	private void non_repeatedelement() {
		// TODO Auto-generated method stub
		char[]name= {'a','a','u','n'};
		char first = name[0];
		int i=1;
		//for(i=1;i<name.length;i++)
		while(i<name.length)
		{
			if(first  !=name[i])
			{
				
			//}
			//else
			//{
				//System.out.println("repeated");
				//break;
			}
			i++;
			
		}
	
	
	System.out.println(i);
	

	if(i==name.length)
	{
		System.out.println("FIRST NON REPEATED NUMBER IS"+"     " +first);
	}

}
}
