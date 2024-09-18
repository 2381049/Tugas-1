package soal2;

public class NestedFor {
    public static void prinStairs(int n){
        for (int n = 1; n <= 10; n++ ) {
            String spaces = " ".repeat(n - i);
            String hashes = "#".repeat(i);
            System.out.println(spaces + hashes);
        }
    }

    public static void main(String[] args) {
        prinStairs(4);
    }
}
