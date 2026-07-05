import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    // Membuat ArrayList untuk menyimpan data
    private ArrayList<Integer> numbers = new ArrayList<>();

    // Constructor 
    public ArrayListOperations() {

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

    }

    // 1. Method untuk menampilkan seluruh isi ArrayList
    public void traversal() {

        System.out.println("ArrayList Traversal : " + numbers);

    }

    // 2. Method untuk menambahkan data ke ArrayList
    public void addData(int nilai, int indeks) {

        numbers.add(nilai);

        System.out.println("ArrayList setelah penyisipan elemen " + nilai + ":" + numbers);

    }

    //3.  Method untuk menghapus data dari ArrayList
    public void removeData(int nilai) {

        if (numbers.remove(Integer.valueOf(nilai))) {

            System.out.println("Data " + nilai + " berhasil dihapus.");

        } else {

            System.out.println("Data tidak ditemukan.");

        }

    }

    //4.  Method untuk mencari data pada ArrayList
    public void searchData(int nilai) {

        int index = numbers.indexOf(nilai);

        if (index != -1) {

            System.out.println("Pencarian " + nilai + " dalam ArrayList: ditemukan di indeks " + index);

        } else {

            System.out.println("Data tidak ditemukan.");

        }

    }

    // 5. Method untuk mengurutkan data
    public void sortData() {

        Collections.sort(numbers);

        System.out.println("Data berhasil diurutkan: " +numbers);

    }

}