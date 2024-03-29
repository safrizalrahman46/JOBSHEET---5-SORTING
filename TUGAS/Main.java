package TUGAS;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi platform dengan jumlah maksimum penginapan
        TravelPlatform platform = new TravelPlatform(10); // misalnya, array dari 10 elemen

        // Tambahkan penginapan ke platform
        platform.tambah(new Penginapan("Penginapan A", 100, 4));
        platform.tambah(new Penginapan("Penginapan B", 80, 3));
        platform.tambah(new Penginapan("Penginapan C", 120, 5));

              // Output sebelum pengurutan
              System.out.println("Sebelum diurutkan:");
              for (Penginapan p : platform.daftarPenginapan) {
                  if (p != null) {
                      System.out.println("Nama: " + p.nama + ", Harga: " + p.harga + ", Rating: " + p.rating);
                  }
                 
              }
              System.out.println("===============================================================");
        // Urutkan dan tampilkan hasilnya
        platform.bubbleSortByHarga();
        platform.selectionSortByRating();
        
        // Tampilkan hasil setelah diurutkan
        System.out.println("Sebelum diurutkan:");
        for (Penginapan p : platform.daftarPenginapan) {
            if (p != null) {
                System.out.println("Nama: " + p.nama + ", Harga: " + p.harga + ", Rating: " + p.rating);
            }
           
        }
        System.out.println("===============================================================");
    }
}
// public class Main {
//     public static void main(String[] args) {
//         TravelPlatform platform = new TravelPlatform(10);
//         // Tambahkan penginapan ke platform
//         // platform.tambah(new Penginapan("Nama Penginapan", harga, rating));
//         // Urutkan dan tampilkan hasilnya
//         platform.bubbleSortByHarga();
//         platform.selectionSortByRating();
//     }
// }
