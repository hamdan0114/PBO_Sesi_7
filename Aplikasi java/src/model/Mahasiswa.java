package model;

public class Mahasiswa extends Person {
    private String jurusan;

    public Mahasiswa(String name, String id, String jurusan) {
        super(name, id);
        this.jurusan = jurusan;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mahasiswa: " + name + " | NIM: " + id + " | Jurusan: " + jurusan);
    }

    public String getJurusan() {
        return jurusan;
    }
}
