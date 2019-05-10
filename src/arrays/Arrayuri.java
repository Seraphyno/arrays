package arrays;

import java.util.Arrays;

/*
 * Array-urile sunt containere care contin un numar fix de date de acelasi tip
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 */
public class Arrayuri {
  
  public static void main(String[] args) {
    int[] unArrayDeInt;
    int unAltArrayDeInt[]; /*declararea se poate face si asa, dar forma este descurajata
            deoarece 'array' defineste un tip si ar trebui sa stea langa declararea tipului de date */
    
    //alocam memorie pentru 10 elemente
    unArrayDeInt = new int[10];
    
    //initializam pe rand cele 10 elemente. IMPORTANT: indexarea (numararea) se face de la 0
    unArrayDeInt[0] = 100;
    unArrayDeInt[1] = 200;
    unArrayDeInt[2] = 300;
    unArrayDeInt[3] = 400;
    unArrayDeInt[4] = 500;
    unArrayDeInt[5] = 600;
    unArrayDeInt[6] = 700;
    unArrayDeInt[7] = 800;
    unArrayDeInt[8] = 900;
    unArrayDeInt[9] = 1000;
    
    //afisam valorile din array
    for (int i = 0; i < unArrayDeInt.length; i++) {
      System.out.println("Valoarea de pe pozitia " + i + ": " + unArrayDeInt[i]);
    }
  
    System.out.println("=======================================");
    
    /*
     * Alta metoda de initializare, permisa doar langa declarare
     * Observatie: daca nu declaram dimensiunea maxima, aceasta va fi determinata de nr de elemente
     */
    int[] someArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
  
    System.out.println("MATRICE == ARRAY MULTIDIMENSIONAL");
    //spunem despre arrayuri ca sunt multidimensionale cand declaram un array de arrayuri
    int[][] matrice = {
                        {1, 2, 3}, //fiecare element al arrayului e un array de int
                        {4, 5, 6},
                        {7, 8, 9}
                      };
    
    for (int i = 0; i < matrice.length; i++) {
      for (int j = 0; j < matrice[i].length; j++) {
        System.out.println("Element la pozitia [" + i + "][" + j + "]: " + matrice[i][j]);
      }
    }
  
    System.out.println("=======================================");
    
    /*operatii pe arrayuri*/
    //verificare egalitate - tb sa contina aceleasi elemente, in aceeasi ordine, avand acelasi tip de date
  
    System.out.println("Arrayuri egale cu Object.equals(): " + someArray.equals(unArrayDeInt)); //intoarce fals deoarece verifica identitatea (instante
    // egale, similaar cu ==)
    System.out.println("Arrayuri egale cu Arrays.equals(): " + Arrays.equals(unArrayDeInt, someArray)); //intoarce true deoarece .equals este suprascris sa
    // verifice egalitatea la nivel de elemente. Sursa: https://stackoverflow.com/questions/8777257/equals-vs-arrays-equals-in-java
  
    System.out.println("=======================================");
    
    // Sortare
    
    int[] nesortat = {10,100,1,34,2,67};
  
    System.out.println("Nesortat: ");
    printArray(nesortat);
    
    Arrays.sort(nesortat);
    System.out.println("Sortat: ");
    printArray(nesortat);
    System.out.println("=======================================");
    
    
  }
  
  static void printArray(int[] array) {
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.print("\n");
  }
  
  
}
