public class Mynumber{
	private int n;
	Mynumber(){
		n = 0;
	}
	Mynumber(int n){
		this.n = n;
	}
	boolean isPositive(){
		if(n>0){
			return true;
		}
		else{
			return false;
		}
	}
	boolean isNegative(){
		if(n<0){
			return true;
		}
		else{
			return false;
		}
	}
	boolean isZero(){
		if(n==0){
			return true;
		}
		else{
			return false;
		}
	}
	boolean isEven(){
		if(n%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	boolean isOdd(){
		if(n%2!=0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String arg[]){
		int a = Integer.parseInt(arg[0]);
		Mynumber obj = new Mynumber(a);
		System.out.println(a + " is positive => " + obj.isPositive());
		System.out.println(a + " is negative => " + obj.isNegative());
		System.out.println(a + " is zero => " + obj.isZero());
		System.out.println(a + " is even => " + obj.isEven());
		System.out.println(a + " is odd => " + obj.isOdd());
	}
	
}
