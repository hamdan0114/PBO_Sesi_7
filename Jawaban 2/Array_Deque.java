import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<String> antrean = new ArrayDeque<>();

        antrean.add("Andi");
        antrean.add("Budi");
        antrean.add("Cici");

        System.out.println("Antrian pertama: " + antrean.poll());
        System.out.println("Antrian sekarang: " + antrean);
    }
}
