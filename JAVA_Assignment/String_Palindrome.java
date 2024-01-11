package Data_structures_and_algorithms.JAVA_Assignment;
public class String_Palindrome {

    static boolean ispalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "abba";
        str = str.toLowerCase();
        if (ispalindrome(str))
            System.out.print("Yes");
        else
            System.out.println("No");

    }
}
