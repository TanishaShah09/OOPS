class College {

    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {

        String studentName;
        String course;

        void acceptDetails(String studentName, String course) {
            this.studentName = studentName;
            this.course = course;
        }

        void displayDetails() {
	    System.out.println("240390107046");	
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {

        College c = new College("Saffrony Institue of Technology College");
        College.Admission a = c.new Admission();

        a.acceptDetails("Tanisha", "CE");
        a.displayDetails();
    }
}