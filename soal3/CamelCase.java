package soal3;

public class CamelCase {
    public static int hitungKataCamelCase(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String kata = "satuDuaTiga";
        System.out.println(hitungKataCamelCase(kata));
    }
}
