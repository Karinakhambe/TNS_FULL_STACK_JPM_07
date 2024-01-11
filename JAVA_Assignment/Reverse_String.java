package Data_structures_and_algorithms.JAVA_Assignment;

public class Reverse_String {

    public static void main(String[] args) {

        String str = "Reverse", nstr = "";
        char ch;

        System.out.println("Original string: Reverse");

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed string: " + nstr);
    }
}
