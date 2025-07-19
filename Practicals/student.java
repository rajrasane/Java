class student{
	String name;
	String surname;
	String year;
	int rollno;
	double percentage;
	student(String n,String sn,String y,int rn,double per){
		name = n;
		surname = sn;
		year = y;
		rollno = rn;
		percentage = per;

	}
	void display(){
		System.out.println("Student info : " + name + "\t" + surname + "\t" + year +  "\t" + rollno + "\t" + percentage);
	}
	public static void main(String arg[]){
		student s1 = new student("Raj","Rasane","TY",18,93.04);
		s1.display();
		student s[] = new student[5];

		s[0] = new student("Om","Kanawade","TY",19,90.09);
		s[1] = new student("Om","Varpe","FY",14,93.09);
		s[2] = new student("Onkar","Dongare","TY",12,80.09);
		s[3] = new student("Aditya","Navale","TY",29,99.07);
		s[4] = new student("Ojas","Shete","SY",9,79.19);
		
		for(int i=0;i<5;i++){
			s[i].display();
		}
	}
}
