import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num;
        Scanner n = new Scanner(System.in);
        num = n.nextInt();
        int ans =fibo(num);
        System.out.println(ans);
    }
    static int fibo(int num){
        if(num <= 1){
            return num;
        }
        return (fibo(num-1) + fibo(num-2));
    }
}
