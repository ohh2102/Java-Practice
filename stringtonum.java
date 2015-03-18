public class stringtonum {
	public static void main(String args[]){
		float x=Float.parseFloat(args[0]);
		float  y=Float.parseFloat(args[1]);
		float z=x+y;
		int c=(int) z;
		float sum=c+z;
		System.out.println(z);
		System.out.println(c);
		System.out.println(sum);
		
	}
	
	
}