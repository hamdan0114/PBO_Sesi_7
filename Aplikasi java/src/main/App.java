package main;

import model.Mahasiswa;
import model.Dosen;
import service.MahasiswaService;

public class App {
    public static void main(String[] args) {
        MahasiswaService service = new MahasiswaService();

        Mahasiswa m1 = new Mahasiswa("Hamdan ", "20230040293 ", "Informatika");
        Mahasiswa m2 = new Mahasiswa("Raka   ", "20230040399 ", "Sistem Informasi");

        service.tambahUser(m1);
        service.tambahUser(m2);

        System.out.println("=== Daftar Mahasiswa ===");
        service.tampilkanSemua();

        Dosen d1 = new Dosen("pak yulhan ", "1980123", "PBO");
        System.out.println("\n=== Data Dosen ===");
        d1.displayInfo();
    }
}
