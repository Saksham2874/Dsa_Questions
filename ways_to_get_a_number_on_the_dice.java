import java.lang.reflect.Array;
import java.util.ArrayList;

public class ways_to_get_a_number_on_the_dice {
    public static void main(String[] args) {
        System.out.println("Basic combinations");
        number_dice("",5);
        System.out.println("Combinations in a list");
        System.out.println(number_dice_list("",5));
        System.out.println("Count of combinations");
        System.out.println(number_dice_count("",5));
    }
    static void number_dice(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            number_dice(p+i,target-i);

        }
    }
    static ArrayList<String> number_dice_list(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target ; i++) {
            list.addAll(number_dice_list(p+i,target-i));

        }
        return list;
    }
    static int number_dice_count(String p , int target){
        if(target == 0){
            return 1;
        }
        int count = 0;
        for (int i = 1; i <=6 && i<=target ; i++) {
            count = count + number_dice_count(p+i,target-i);

        }
        return count;
    }
}
