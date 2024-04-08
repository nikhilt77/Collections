public class Predicate1{

    public static void main(String[] args) {
        String str = "Hello";
        java.util.function.Function<String, Integer> fun = s -> s.length();
        int len = fun.apply(str);
        System.out.println(len);
    }
}
