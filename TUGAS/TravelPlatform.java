package TUGAS;

public class TravelPlatform {
    Penginapan[] daftarPenginapan;
    int idx;

    // Method untuk menambah penginapan ke daftar
    void tambah(Penginapan p) {
        if (idx < daftarPenginapan.length) {
            daftarPenginapan[idx] = p;
            idx++;
        } else {
            System.out.println("Daftar penginapan sudah penuh");
        }
    }

    // Method Bubble Sort untuk mengurutkan berdasarkan harga
    void bubbleSortByHarga() {
        for (int i = 0; i < daftarPenginapan.length - 1; i++) {
            for (int j = 0; j < daftarPenginapan.length - 1 - i; j++) {
                if (daftarPenginapan[j].harga > daftarPenginapan[j + 1].harga) {
                    Penginapan temp = daftarPenginapan[j];
                    daftarPenginapan[j] = daftarPenginapan[j + 1];
                    daftarPenginapan[j + 1] = temp;
                }
            }
        }
    }

    // Method Selection Sort untuk mengurutkan berdasarkan rating
    void selectionSortByRating() {
        for (int i = 0; i < daftarPenginapan.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < daftarPenginapan.length; j++) {
                if (daftarPenginapan[j].rating > daftarPenginapan[idxMax].rating) {
                    idxMax = j;
                }
            }
            Penginapan temp = daftarPenginapan[idxMax];
            daftarPenginapan[idxMax] = daftarPenginapan[i];
            daftarPenginapan[i] = temp;
        }
    }
}
