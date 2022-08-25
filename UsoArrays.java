import java.util.Arrays;
import java.util.Random;
import java.io.*;


public class UsoArrays{
  public static void main (String[] args)throws Exception{

    BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));

    if (args.length == 2) {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      if ((a > 15) && (b > 15) && (a != b)){
        int[] arrayA = new int[a];
        int[] arrayB = new int[b];
        System.out.println("Arreglo1: "+ Arrays.toString(arrayA));
        System.out.println("Arreglo2: "+ Arrays.toString(arrayB));
      
        System.out.println();

        if (arrayA.length > arrayB.length){
          //ARREGLO A MAS GRANDE
          for(int i = 0; i < arrayA.length ; i++){
            Random r = new Random();
            int rGrande = r.nextInt(45) + 15;
            arrayA[i] = rGrande;
          }
          System.out.println("Arreglo Grande: " + Arrays.toString(arrayA));
          //ARREGLO B MAS PEQUEÑO
          for(int s = 0; s < arrayB.length; s++){
            Random r2 = new Random();
            int rB = r2.nextInt(20) + 1;
            arrayB[s] = rB;
          }
          System.out.println("Arreglo Pequeño: " + Arrays.toString(arrayB));

          //ARREGLO PEQUEÑO CREADO POR USUARIO
          System.out.println();
          System.out.printf("CREAREMOS UN ARRAY DE %d POSICIONES\n",arrayB.length);
          int repetidor = 0;
          int[] creadoB = new int[arrayB.length];
          while (arrayB.length > repetidor){
            System.out.printf("Ingrese numero en posicion #%s: ", repetidor);
            int ingreso = Integer.parseInt(tec.readLine());
            creadoB[repetidor] = ingreso;
            repetidor++;
          }

          System.out.println();
          System.out.println("Arreglo Creado por Usuario");
          System.out.println(Arrays.toString(creadoB));

          System.out.println();
          Arrays.sort(arrayB);
          System.out.println("Arreglo Pequeño Ordenado: " + Arrays.toString(arrayB));


          





        } else {
          //ARREGLO B MAS GRANDE
          for (int i = 0; i < arrayB.length; i++){
            Random r = new Random();
            int rGrande = r.nextInt(45) + 15;
            arrayB[i] = rGrande;
          }
          System.out.println("Arreglo Grande: " + Arrays.toString(arrayB));
          //ARREGLO A MAS PEQUEÑO
          for(int s = 0; s < arrayA.length; s++){
            Random r2 = new Random();
            int rB = r2.nextInt(20) + 1;
            arrayA[s] = rB;
          }
          System.out.println("Arreglo Pequeño: " + Arrays.toString(arrayA));

          System.out.println();
          //ARREGLO PEQUEÑO CREADO POR USUARIO
          System.out.printf("CREAREMOS UN ARRAY DE %d POSICIONES\n",arrayA.length);
          int repetidor = 0;
          int[] creadoA = new int[arrayA.length];
          while (arrayA.length > repetidor){
            System.out.printf("Ingrese numero en posicion #%s: ", repetidor);
            int ingreso = Integer.parseInt(tec.readLine());
            creadoA[repetidor] = ingreso;
            repetidor++;
          }

          System.out.println();
          System.out.println("Arreglo Creado por Usuario");
          System.out.println(Arrays.toString(creadoA));

          System.out.println();
          Arrays.sort(arrayA);
          System.out.println("Arreglo Pequeño Ordenado: " + Arrays.toString(arrayA));

          

          
        }




      } else {
        System.out.println("Error: Valores Invalidos");
      }
    }




  }
}