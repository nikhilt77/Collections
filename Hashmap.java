import java.util.*;

public class Hashmap {
    public static void main(String args[]){
        HashMap<String,Integer> M=new HashMap<>(20,0.9f);
        HashMap<String,Integer> map=new HashMap<>();
        HashMap<String,Integer> M1=new HashMap<>(map);
        M.put("Maths",90);
        M.put("Science",80);
        M.put("English",70);
        M.put("Hindi",60);
        System.out.println(M);
    }
}
