package service;

import model.Mahasiswa;
import java.util.ArrayList;

public class MahasiswaService implements UserService<Mahasiswa> {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    @Override
    public void tambahUser(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    @Override
    public void tampilkanSemua() {
        for (Mahasiswa m : daftarMahasiswa) {
            m.displayInfo();
        }
    }
}
