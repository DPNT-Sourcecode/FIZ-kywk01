package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        int odd = (number % 2 != 0) ? 1 : 0;
        if (odd == 1) {
            if ((number % 3 == 0 || String.valueOf(number).contains("3")) && (number % 5 == 0 || String.valueOf(number).contains("5"))) {
                if (check(number) == true) {
                    return "fizz buzz fake deluxe";
                } else {
                    return "fizz buzz";
                }
            } else if (number % 3 == 0 || String.valueOf(number).contains("3")) {
                if (check(number) == true && (number / 10 != 0)) {
                    return "fizz fake deluxe";
                } else {
                    return "fizz";
                }
            } else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
                if (check(number) == true && (number / 10 != 0)) {
                    return "buzz fake deluxe";
                } else {
                    return "buzz";
                }
            } else if (check(number) == true && (number / 10 != 0)) {
                return "fake deluxe";
            } else {
                return String.valueOf(number);
            }
        } else {
            if ((number % 3 == 0 || String.valueOf(number).contains("3")) && (number % 5 == 0 || String.valueOf(number).contains("5"))) {
                if (check(number) == true) {
                    return "fizz buzz deluxe";
                } else {
                    return "fizz buzz";
                }
            } else if (number % 3 == 0 || String.valueOf(number).contains("3")) {
                if (check(number) == true && (number / 10 != 0)) {
                    return "fizz deluxe";
                } else {
                    return "fizz";
                }
            } else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
                if (check(number) == true && (number / 10 != 0)) {
                    return "buzz deluxe";
                } else {
                    return "buzz";
                }
            } else if (check(number) == true && (number / 10 != 0)) {
                return "deluxe";
            } else {
                return String.valueOf(number);
            }
        }
    }

    public static boolean check(int number) {
        int c1, c2;
        boolean equal = true;
        c1 = number % 10;
        while (number != 0) {
            c2 = number % 10;
            number = number / 10;
            if (c1 != c2) {
                equal = false;
                break;
            };
        }
        return equal;
    }

}
