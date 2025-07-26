class studcmd {
    String name;
    int rollno;
    double percentage;

    studcmd(String name, int rollno, double percentage) {
        this.name = name;
        this.rollno = rollno;
        this.percentage = percentage;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollno + ", Percentage: " + percentage);
    }

    static void sortStudent(studcmd[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].percentage < students[j + 1].percentage) {
                    studcmd temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int n = args.length / 3;
        studcmd[] students = new studcmd[n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            String name = args[index++];
            int rollno = Integer.parseInt(args[index++]);
            double percentage = Double.parseDouble(args[index++]);

            students[i] = new studcmd(name, rollno, percentage);
        }

        sortStudent(students);

        System.out.println("\nSorted Student Records:");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}

