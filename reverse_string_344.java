import java.util.Scanner;
public class reverse_string_344 {
    public static void main(String[] args) {
        char arr[] = new char[]{'s', 'a', 'k'};
        System.out.println(arr);
        reverseString(arr);
        System.out.println(arr);
    }
     static void reverseString(char[] s) {

        int l = 0;
        int r = s.length - 1;
        while(l<r){
            char temp = s[l];
            s[l++] = s[r];
            s[r--] = temp ;
        }

    }
}
