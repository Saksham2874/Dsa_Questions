import java.util.Scanner;

public class accept_integer_and_convert_into_days_months_and_years {
    public static void main(String[] args) {
        int num;
        Scanner n = new Scanner(System.in);
        num = n.nextInt();
        int y=0,m=0;
        if(num>365){
            y = num/365;
            num = num%365;
        }
        if(num>30){
            m = num/30;
            num = num%30;
        }
        System.out.println("The years will be " + y);
        System.out.println("The months will be " + m);
        System.out.println("The days will be " + num);

    }
}
