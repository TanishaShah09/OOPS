class University {

    static int totalStudents;
    static String universityName;

    static {
        universityName = "Gujarat Technological University";
	totalStudents = 0;
	System.out.println("240390107046");
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
    }

    University() {
     	totalStudents++;
	   System.out.println("Constructor Executed");
    }

   // static void getTotalStudents() {
      //  System.out.println("Total Students: " + totalStudents);
   // }

	static int getTotalStudents(){
		return totalStudents;
	}

    public static void main(String[] args) {

        System.out.println("Main Method Started");

        University u1 = new University();
	University u2 = new University();
	University u3 = new University();	
	University u4 = new University();

        //getTotalStudents();

	System.out.println("Total Students Created: " + University.getTotalStudents());
        System.out.println("University Name: " + universityName);
    }
}