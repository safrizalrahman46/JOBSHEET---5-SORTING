package minggu5;
import java.util.Scanner;

public class main19 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi19 list = new DaftarMahasiswaBerprestasi19();
        mahasiswa m1 = new mahasiswa("Nusa", 2017, 25, 3);
        mahasiswa m2 = new mahasiswa("Rara", 2012, 19, 4);
        mahasiswa m3 = new mahasiswa("Dompu", 2018, 19, 3.5);
        mahasiswa m4 = new mahasiswa("Abdul", 2017, 23, 2);
        mahasiswa m5 = new mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasisiwa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasisiwa setelah sorting desc berdasarkan ipk");
        list.bubblesort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah insertion sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();


    }    
}
