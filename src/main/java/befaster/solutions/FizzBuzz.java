package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        if ((number % 3 == 0 || String.valueOf(number).contains("3")) && (number % 5 == 0 || String.valueOf(number).contains("5"))) {
            if (check(number) == true) {
                return "fizz buzz deluxe";

            } else {
                return "fizz buzz";
            }
        } else if (number % 3 == 0 || String.valueOf(number).contains("3")) {
            return "fizz";
        } else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
            return "buzz";
        } else if (check(number) == true) {
            return "deluxe";
        } else {
            return String.valueOf(number);
        }

    }

    public static boolean check(int number) {
        int c1, c2;
        boolean equal = true;
        c1 = number % 10;
        while (number != 0) {
            number = number / 10;
            c2 = number % 10;
            if (c1 != c2) {
                equal = false;
                break;
            };
            if (equal == true) {
                return true;
            } else {
                return false;
            }

        }
    }
}
