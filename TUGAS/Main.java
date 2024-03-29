package TUGAS;

public class Main {
    public static void main(String[] args) {
        TravelPlatform platform = new TravelPlatform();
        // Tambahkan penginapan ke platform
        // platform.tambah(new Penginapan("Nama Penginapan", harga, rating));
        // Urutkan dan tampilkan hasilnya
        platform.bubbleSortByHarga();
        platform.selectionSortByRating();
    }
}
