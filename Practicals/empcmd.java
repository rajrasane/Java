class empcmd {
    int id;
    String name, deptname;
    double salary;
    static int count = 0;

    empcmd() {
        this.id = 0;
        this.name = "";
        this.deptname = "";
        this.salary = 0.0;
    }

    empcmd(int id, String name, String deptname, double salary) {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        count++;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + deptname + ", Salary: " + salary);
        System.out.println("Object Created : " + count);
    }

    public static void main(String[] args) {
        empcmd e1 = new empcmd(1, "Raj", "HR", 50000);
        e1.display();

        empcmd e2 = new empcmd(2, "Om", "IT", 60000);
        e2.display();
    }
}

