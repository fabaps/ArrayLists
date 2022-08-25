import java.io.*;
import java.util.Random;
import java.util.Arrays;

public class Totito {
  public static void main(String[] args) throws Exception{
     
    BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Ingrese nombre de jugador 1: ");
    String jugador1 = tec.readLine();
    System.out.print("Ingrese nombre de jugador 2: ");
    String jugador2 = tec.readLine();
    
    Jugadores[] tablero = new Jugadores[9];
    Jugadores j1 = new Jugadores("X");
    Jugadores j2 = new Jugadores("O");

    Random random = new Random();
    int r1 = random.nextInt(1) + 1 ;
    if(r1 == 1){
      System.out.println();
      System.out.printf("%s Empieza con X\n", jugador1);
      desplegar(tablero);
      
      System.out.println();
      System.out.printf("Movida de jugador %s [1-9]: ", jugador1);
      String movida = tec.readLine();


    } else if(r1 == 2){
      System.out.printf("%s Empieza con O\n", jugador1);
    } else if(r1 == 3){
      System.out.printf("%s Empieza con X\n", jugador2);
    } else if (r1 == 4){
      System.out.printf("%s Empieza con O\n", jugador2);
    }

    System.out.println();

    
  
  

    

  }

  public static void desplegar(Jugadores[] size) {
    for(int i = 0; i < size.length ; i++){
      if((i % 3) == 0){
        System.out.println();
      }
      Jugadores j = size[i];
      if (j != null){
        continue;
      } 

      System.out.print("|"+(i + 1) + "|");
    }
    System.out.println();
            
      
  } 
}