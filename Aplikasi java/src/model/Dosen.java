package model;

public class Dosen extends Person {
    private String matkul;

    public Dosen(String name, String id, String matkul) {
        super(name, id);
        this.matkul = matkul;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dosen: " + name + " | NIP: " + id + " | Mengajar: " + matkul);
    }
}
