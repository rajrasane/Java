class areaofrect{
	int length;
	int breadth;
	int area(int l,int b){
		length = l;
		breadth = b;
		return length * breadth;
	}
	public static void main(String arg[]){
		areaofrect ar = new areaofrect();
		int a = ar.area(4,5);
		System.out.println("Area of rectangle is = " + a);
	}
}
