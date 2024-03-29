package minggu5;
/**
 * mahasiswa
 */
public class mahasiswa {

    String nama;
    int thnmasukaja, umur;
    double ipk;

    mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnmasukaja = t;
        umur = u;
        ipk = i;
        
    }

    void tampil(){
        System.out.println("nama =="+ nama);
        System.out.println("Tahun masuk aza  ==  "+ thnmasukaja);
        System.out.println("umur =="+ umur);
        System.out.println("ipk =="+ ipk);
        System.out.println("============================================");
        // System.out.println("nama =="+ nama);
    }

}