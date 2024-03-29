package minggu5;


public class DaftarMahasiswaBerprestasi19{
    mahasiswa listMHs[] = new mahasiswa[5];
    int idx;

    void tambah(mahasiswa m){
        if (idx<listMHs.length) {
            listMHs[idx] = m;
            idx++;
        } else System.out.println("Gagal menambah mahasiswa, daftar penuh");
    }

    void tampil(){
        for (mahasiswa m : listMHs) {
            m.tampil();
        }
        System.out.println("=================================================");
    }
    
    void bubblesort(){
        for (int i = 0; i < listMHs.length-1; i++) {
            for (int j = 1; j < listMHs.length-i; j++) {
                if (listMHs[j].ipk > listMHs[j-1].ipk) {
                    mahasiswa tmp = listMHs[j];
                    listMHs[j] = listMHs[j-1];
                    listMHs[j-1] = tmp;
                }
            }
        }
        System.out.println("=================================================");
    }
    
    //setelah ini tuliskan method selectionSort()
    void selectionSort(){
        for(int i=0; i<listMHs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMHs.length; j++){
                if(listMHs[j].ipk < listMHs[idxMin].ipk){
                    idxMin = j;
                }
            }
            //swap
            mahasiswa tmp = listMHs[idxMin];
            listMHs[idxMin] = listMHs[i];
            listMHs[i] = tmp;
        }
        System.out.println("=================================================");
    }

    void insertionSort() {
        for (int i = 1; i < listMHs.length; i++) {
            mahasiswa temp = listMHs[i];
            int j = i;
            while (j > 0 && listMHs[j - 1].ipk > temp.ipk) {
                listMHs[j] = listMHs[j - 1];
                j--;
            }
            listMHs[j] = temp;
        }
        System.out.println("=================================================");
    }
    

    // void bubblesort(){
    //     for (int i = 0; i < listMHs.length-1; i++) {
    //         for (int j = 0; j < listMHs.length-1; j++) {
    //             if (listMHs[j].ipk > listMHs[j-1].ipk) {
    //                 mahasiswa tmp = listMHs[j];
    //                 listMHs[j] = listMHs[j-1];
    //                 listMHs[j-1] = tmp;
                    
    //             }
    //         }
    //     }
    //     System.out.println("=================================================");
    // }
    
    // boolean cari(String nama){
    //     for (int i=0;i<idx;i++)  
    //         if (nama.equalsIgnoreCase(listMHs[i].getNama())) return true;  
    //     return false;  
    // } 
    

    }
