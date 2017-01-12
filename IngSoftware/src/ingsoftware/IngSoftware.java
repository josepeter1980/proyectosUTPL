package ingsoftware;
import java.util.*;
public class IngSoftware {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int x;
      int i;
      int suma=0;
      double promedio;
      System.out.println ("Digite la cantidad de numeros a promediar");
      x=Integer.parseInt(in.next());
      for (i=0; i<x; i++){
          System.out.println ("Digite un numero");
          suma=suma +Integer.parseInt(in.next());
                  
      }
      promedio = suma/x;
      System.out.println ("El promedio de la suma de los numeros es: "+ promedio);
      
      
    }
    
}
