package TUGAS;

public class TravelPlatform {
    Penginapan[] daftarPenginapan;
    int idx;

    // Constructor untuk menginisialisasi array daftarPenginapan
    TravelPlatform(int jumlahPenginapan) {
        daftarPenginapan = new Penginapan[jumlahPenginapan];
        idx = 0;
    }

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
                if (daftarPenginapan[j] != null && daftarPenginapan[j + 1] != null && 
                    daftarPenginapan[j].harga > daftarPenginapan[j + 1].harga) {
                    Penginapan temp = daftarPenginapan[j];
                    daftarPenginapan[j] = daftarPenginapan[j + 1];
                    daftarPenginapan[j + 1] = temp;
                }
            }
        }
    }
    
    // void bubbleSortByHarga() {
    //     for (int i = 0; i < daftarPenginapan.length - 1; i++) {
    //         for (int j = 0; j < daftarPenginapan.length - 1 - i; j++) {
    //             if (daftarPenginapan[j].harga > daftarPenginapan[j + 1].harga) {
    //                 Penginapan temp = daftarPenginapan[j];
    //                 daftarPenginapan[j] = daftarPenginapan[j + 1];
    //                 daftarPenginapan[j + 1] = temp;
    //             }
    //         }
    //     }
    // }

    // Method Selection Sort untuk mengurutkan berdasarkan rating
    void selectionSortByRating() {
        for (int i = 0; i < daftarPenginapan.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < daftarPenginapan.length; j++) {
                if (daftarPenginapan[j] != null && daftarPenginapan[idxMax] != null && 
                    daftarPenginapan[j].rating > daftarPenginapan[idxMax].rating) {
                    idxMax = j;
                }
            }
            if (daftarPenginapan[idxMax] != null) {
                Penginapan temp = daftarPenginapan[idxMax];
                daftarPenginapan[idxMax] = daftarPenginapan[i];
                daftarPenginapan[i] = temp;
            }
        }
    }
    
    // void selectionSortByRating() {
    //     for (int i = 0; i < daftarPenginapan.length - 1; i++) {
    //         int idxMax = i;
    //         for (int j = i + 1; j < daftarPenginapan.length; j++) {
    //             if (daftarPenginapan[j].rating > daftarPenginapan[idxMax].rating) {
    //                 idxMax = j;
    //             }
    //         }
    //         Penginapan temp = daftarPenginapan[idxMax];
    //         daftarPenginapan[idxMax] = daftarPenginapan[i];
    //         daftarPenginapan[i] = temp;
    //     }
    // }
}