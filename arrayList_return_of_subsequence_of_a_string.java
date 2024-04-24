import java.util.ArrayList;

public class arrayList_return_of_subsequence_of_a_string {
    public static void main(String[] args) {
        ArrayList<String> ans = subSeq("", "abc");
        System.out.println(ans);
    }
    static ArrayList<String> subSeq(String p ,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p+ch,up.substring(1));
        ArrayList<String> right = subSeq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
