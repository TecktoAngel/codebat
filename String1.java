package CodingBat;

public class String1 {

    /*
    helloName
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /*
    makeAbba
    Given two strings, a and b, return the result of putting them together in the order abba, e.g.
    "Hi" and "Bye" returns "HiByeByeHi".
    */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /*
    makeTags
    The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
    the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings,
    create the HTML string with tags around the word, e.g. "<i>Yay</i>".
    */
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /*
    makeOutWord
    Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle
    of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i
    and going up to but not including index j.
    */
    public String makeOutWord(String out, String word) {
        return (out.substring(0, 2) + word + out.substring(2, 4));
    }

    /*
    extraEnd
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.
    */
    public String extraEnd(String str) {
        int counterOfReps = 3;
        String res = "";
        for (int i = 0; i < counterOfReps; i++) {
            res += str.substring(str.length() - 2);
        }
        return res;
    }

    /*
    firstTwo
    Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    If the string is shorter than length 2, return whatever there is, so "X" yields "X", and
    the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
    */
    public String firstTwo(String str) {

        if (str.length() < 2) {
            return str;
        }
        return (str.substring(0, 2));
    }

    /*
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    */
    public String firstHalf(String str) {
        String res = str.substring(0, str.length() / 2);

        return res;
    }

    /*
    withoutEnd
    Given a string, return a version without the first and last char, so "Hello" yields "ell".
    The string length will be at least 2.
    */
    public String withoutEnd(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(1, str.length() - 1);
    }

    /*
    Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and
    the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
    */
    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    /*
    Given 2 strings, return their concatenation, except omit the first char of each.
    The strings will be at least length 1.
    */
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    /*
    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    The string length will be at least 2.
    */
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    /*
    right2
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    The string length will be at least 2.
    */
    public String right2(String str) {
        int lastTwo = str.length()-2;
        return str.substring(lastTwo) + str.substring(0, lastTwo);
    }


}