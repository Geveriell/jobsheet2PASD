public class DosenMain07 {
    public static void main(String[] args) {

        Dosen07 dsn1 = new Dosen07();
        dsn1.idDosen = "DSN001";
        dsn1.nama = "Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2018;
        dsn1.bidangKeahlian = "Basis Data";

        dsn1.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.ubahKeahlian("Pemrograman");
        dsn1.tampilInformasi();

        System.out.println();

        Dosen07 dsn2 = new Dosen07(
                "DSN002",
                "Siti Aminah",
                true,
                2020,
                "Jaringan Komputer"
        );

        dsn2.tampilInformasi();
        dsn2.setStatusAktif(false);
        dsn2.tampilInformasi();
    }
}
