package soal1;

public class ForEach {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3,};
        int jumlah = 0;
        for (int angka : ar) {
            jumlah += angka;
        }
        System.out.println("1+2+3=");
    }
}
