interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

public class Result28 implements Exam, Classify {

    // Implementation of Exam interface
    @Override
    public boolean isPassed(int mark) {
        return mark >= 40; // pass if marks are 40 or more
    }

    // Implementation of Classify interface
    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Result28 r = new Result28();

        int mark = 55;
        double average = 62.5;

        // Using isPassed()
        if (r.isPassed(mark)) {
	    System.out.println("240390107046");
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }

        // Using getDivision()
        System.out.println("Division: " + r.getDivision(average));
    }
}