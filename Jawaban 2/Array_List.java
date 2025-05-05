import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("Aldi");
        daftarNama.add("Budi");
        daftarNama.add("Citra");

        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}
