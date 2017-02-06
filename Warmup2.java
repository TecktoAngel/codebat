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

    /*
    countXX
    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    */
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }

    /*
    doubleX
    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    */
    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    /*
    stringBits
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    */
    public String stringBits(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i+=2) {
            res += str.charAt(i);
        }
        return res;
    }

    /*
    stringSplosion
    Given a non-empty string like "Code" return a string like "CCoCodCode".
    */
    public String stringSplosion(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            res += str.substring(0 , i + 1);
        }
        return res;
    }

    /*
    last2
    Given a string, return the count of the number of times that a substring length 2 appears in the string and also
    as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
    */
    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        String last = str.substring(str.length() - 2);
        String first = "";
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            first = str.substring(i, i + 2);
            if (first.equals(last)) {
                count++;
            }
        }
        return count;
    }

    /*
    arrayCount9
    Given an array of ints, return the number of 9's in the array.
    */
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    /*
    arrayFront9
    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length
    may be less than 4.
    */
    public boolean arrayFront9(int[] nums) {
        int firstFour = nums.length;
        if (firstFour > 4) {
            firstFour = 4;
        }

        for (int i = 0; i < firstFour; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    /*
    array123
    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    */
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
                return true;
            }
        }
        return false;
    }

    /*
    stringMatch
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in
    both strings.
    */
    public int stringMatch(String a, String b) {
        int len = a.length() <= b.length() ? a.length() : b.length();
        len--;
        int count = 0;
        for(int i = 0; i < len; i++)
        {
            if(a.substring(i, i+2).equals(b.substring(i, i+2)))
                count++;
        }
        return count;
    }

    /*
    Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.
    */
    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result += str.charAt(i);
            }
        }
        return result;
    }



}
