public class MataKuliahMain07 {
    public static void main(String[] args) {

        MataKuliah07 mk1 = new MataKuliah07();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        System.out.println();

        MataKuliah07 mk2 = new MataKuliah07(
                "IF102",
                "Pemrograman Berorientasi Objek",
                3,
                6
        );

        mk2.tampilInformasi();
        mk2.tambahJam(2);
        mk2.kurangiJam(10);
    }
}
