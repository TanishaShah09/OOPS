interface Classify {
    String getDivision(double average);
}

class Result27 implements Classify {

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
        Result27 r = new Result27();
	System.out.println("240390107046");
        System.out.println(r.getDivision(65));
    }
}