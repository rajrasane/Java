class areaofrect{
	double length;
	double breadth;
	void accept(double l,double b){
		length = l;
		breadth = b;
	}
	double area(){
		return length * breadth;
	}
	
	public static void main(String arg[]){
		areaofrect ar = new areaofrect();
		ar.accept(4.3,5.4);
		double a = ar.area();
		System.out.println("Area of rectangle is = " + a);
	}
}
