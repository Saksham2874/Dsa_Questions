import java.util.ArrayList;

public class subseq_with_ASCII_values {
    public static void main(String[] args) {
        System.out.println(subseq_ASCII("","abc"));
    }
    static ArrayList<String> subseq_ASCII(String p ,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = subseq_ASCII(p+ch,up.substring(1));
        ArrayList<String> second = subseq_ASCII(p,up.substring(1));
        ArrayList<String> third = subseq_ASCII(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }
}
