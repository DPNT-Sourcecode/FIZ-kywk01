package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        int odd = (number % 2 != 0) ? 1 : 0;
        if (odd == 1) {
            if ((number % 3 == 0 || String.valueOf(number).contains("3")) && (number % 5 == 0 || String.valueOf(number).contains("5"))) {
                if ((number % 3 == 0 && String.valueOf(number).contains("3")) && (number % 5 == 0 && String.valueOf(number).contains("5"))) {
                    return "fizz buzz fake deluxe";
                } else {
                    return "fizz buzz";
                }
            } else if (number % 3 == 0 || String.valueOf(number).contains("3")) {
                if (number % 3 == 0 && String.valueOf(number).contains("3")) {
                    return "fizz fake deluxe";
                } else {
                    return "fizz";
                }
            } else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
                if (number % 5 == 0 && String.valueOf(number).contains("5")) {
                    return "buzz fake deluxe";
                } else {
                    return "buzz";
                }
            } else {
                return String.valueOf(number);
            }
        } else {
            if ((number % 3 == 0 || String.valueOf(number).contains("3")) && (number % 5 == 0 || String.valueOf(number).contains("5"))) {
                if ((number % 3 == 0 && String.valueOf(number).contains("3")) && (number % 5 == 0 && String.valueOf(number).contains("5"))) {
                    return "fizz buzz deluxe";
                } else {
                    return "fizz buzz";
                }
            } else if (number % 3 == 0 || String.valueOf(number).contains("3")) {
                if (number % 3 == 0 && String.valueOf(number).contains("3")) {
                    return "fizz deluxe";
                } else {
                    return "fizz";
                }
            } else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
                if (number % 5 == 0 && String.valueOf(number).contains("5")) {
                    return "buzz deluxe";
                } else {
                    return "buzz";
                }
            } else {
                return String.valueOf(number);
            }
        }
    }

}
