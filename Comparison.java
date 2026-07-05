public class Comparison {

    // banding waktu pencarian pada Array dan ArrayList
    public void compareSearch() {

        ArrayOperations array = new ArrayOperations();
        ArrayListOperations arrayList = new ArrayListOperations();

        // ukur waktu pencarian pada Array
        long startArray = System.nanoTime();
        array.linearSearch(30);
        long endArray = System.nanoTime();

        // ukur waktu pencarian pada ArrayList
        long startArrayList = System.nanoTime();
        arrayList.searchData(30);
        long endArrayList = System.nanoTime();
        
        
        double waktuArrayMs = (endArray - startArray) / 1000000.0;
        double waktuArrayListMs = (endArrayList - startArrayList) / 1000000.0;
        
        System.out.println();
        System.out.println("Waktu eksekusi pencarian pada Array      : " + waktuArrayMs + " ms");
        System.out.println("Waktu eksekusi pencarian pada ArrayList  : " + + waktuArrayListMs + " ms");
        
    }

}