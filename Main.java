public class Main {

    public static void main(String[] args) {

        // Membuat objek dari masing-class class
        ArrayOperations array = new ArrayOperations();
        ArrayListOperations list = new ArrayListOperations();
        Comparison compare = new Comparison();

        // 1. traversal
        array.traversal(); 
        list.traversal();
        System.out.println(); 

        // 2. searching
        array.linearSearch(30);
        list.searchData(30);
        System.out.println(); 

        // 3. insert
        array.insert(25, 2); 
        list.addData(25, 2); 
        
        // 4. perbandingan
        System.out.println(); 
        compare.compareSearch();
    }
}