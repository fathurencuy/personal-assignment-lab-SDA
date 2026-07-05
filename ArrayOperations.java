import java.util.Arrays;
        
public class ArrayOperations {
    
    private int[] numbers = {10, 20, 30, 40, 50};
    
    //1.  Method Traversal
    public void traversal() {
        System.out.print("Array Traversal: " + Arrays.toString(numbers));
        
     
        System.out.println();
       
    }
    
    
    //2. Method Linear Search
    public void linearSearch(int nilai) {
        
        boolean ditemukan = false;
        
        //pencarian satu per satu dalam elemen array
        for(int i=0; i < numbers.length; i++) {
            
            //mengecek nilai yg sesuai dengan dicari
            if(numbers[i] == nilai) {
               ditemukan = true;
               System.out.println("Pencarian " + nilai + " dalam Array: ditemukan di indeks " + i);
               break;
            }
        }
            if(!ditemukan) {
                System.out.println("nilai tersebut tidak ditemukan");
            }
    }
    
    //3. Method Binary Search
    public void binarySearch(int nilai) {
    
    
    int kiri = 0;
    int kanan = numbers.length - 1;
    
    // Proses pencarian selama batas kiri tidak melewati batas kanan
    while (kiri <= kanan) {

        int tengah = (kiri + kanan) / 2;
        
        //jika nilai lebih ditemukan
        if (numbers[tengah] == nilai) {

            System.out.println("Pencarian " + nilai + "dalam Array (Binary): ditemukan di indeks " + tengah);
            return;
            
        //jika  nilai lebih kecil dari elemen tengah maka cari  di bagian kiri
        } else if (nilai < numbers[tengah]) {

            kanan = tengah - 1;

        } else {

            kiri = tengah + 1;

        }
    }
    System.out.println("Elemen tidak ditemukan.");
    }
    
    
    //4. Method Insert
    public void insert(int nilai, int posisi) {
        
        // untuk menambah nanti array baru
        int[] baru = new int[numbers.length+1];
        
        System.arraycopy(numbers, 0, baru, 0, posisi);
        
        
        baru[posisi] = nilai;
        
        //salin elemen setelah ditambahkan
       System.arraycopy(numbers, posisi, baru, posisi + 1, numbers.length - posisi);
        
        //ganti array lama dengan yang baru
        numbers = baru;
        
        System.out.println("Array setelah penyisipan elemen " + nilai + ": " + Arrays.toString(numbers));
        
    }
    
    //5. Method Delete
    public void delete(int nilai) {
        int index = -1;
        
       //cari posisi yang ingin dihapus
       for (int i = 0; i <numbers.length; i++) {
           if(numbers[i] == nilai) {
               index = i;
               break;
           }
       }
       
       if(index == -1) {
           System.out.println("data tidak ditemukan");
           return;
       }
       
       // Membuat array baru dengan ukuran lebih kecil
       int[] baru = new int[numbers.length - 1];

       // Copy elemen sebelum index yang dihapus
       System.arraycopy(numbers, 0, baru, 0, index);
       
       // Copy elemen setelah index yang dihapus
       System.arraycopy(numbers, index + 1, baru, index, numbers.length - index - 1);
       
       //ganti array dengan yg baru
       numbers = baru;
       
       System.out.println("Array setelah penghapusan elemen " + nilai + ": " + Arrays.toString(numbers));
       
       
        
    }


}
