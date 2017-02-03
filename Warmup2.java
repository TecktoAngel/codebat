package CodingBat;

public class Warmup2 {

    /*
    stringTimes
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    */
    public String stringTimes(String str, int n) {
        String temp = "";
        for (int i = 0; i < n; i++) {
            temp += str;
        }
        return temp;
    }

    /*
    frontTimes
    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever
    is there if the string is less than length 3. Return n copies of the front;
    */
    public String frontTimes(String str, int n) {
        String firstThreeLetters = "";

        if (str.length() >= 3) {
            firstThreeLetters = str.substring(0, 3);
        } else {
            firstThreeLetters = str;
        }

        String temp = "";

        for (int i = 0; i < n; i++) {
            temp += firstThreeLetters;
        }
        return temp;
    }



}
