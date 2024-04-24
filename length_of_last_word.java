public class length_of_last_word {
    public static void main(String[] args) {
        System.out.println(Len_last(" My name is Saksham    "));
    }
    static int Len_last(String s){
        s = s.trim();
        int length = 0;
        for(int i = s.length() -1;i>=0;i--){
            if(s.charAt(i) != ' '){
                length++;
            }
            else if(length > 0){
                break;
            }
        }
        return length;
    }
}
