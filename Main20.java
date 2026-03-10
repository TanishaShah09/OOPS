import java.util.Scanner;

class Password {

    boolean isValidPassword(String password) {
        return false;   // Default implementation
    }
}

class CheckPassword extends Password {

    @Override
    boolean isValidPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isLetterOrDigit(ch)) {

                if (Character.isDigit(ch)) {
                    digitCount++;
                }

            } else {
                return false;
            }
        }

        return digitCount >= 2;
    }
}

class Main20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	System.out.println("240390107046");
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        Password obj = new CheckPassword();   // Polymorphism

        if (obj.isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}