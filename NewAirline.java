import java.io.*;
import java.util.Arrays;

public class NewAirline{
  public static void main(String[] args) throws Exception {
    BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Ingrese número de asientos: ");
    int asientos = Integer.parseInt(tec.readLine());
    Pasajero[] pasajeros = new Pasajero[asientos];
    if ((asientos % 6 != 0) && (asientos < 48)){
      System.out.println("Error");
      return;
    }

    while (true){
      System.out.println();
      System.out.println("1. Reservaciones");
      System.out.println("2. Cancelaciones");
      System.out.println("3. Lista Viajeros");
      System.out.println("4. Asientos disponibles");
      System.out.println("5. Salir ");

      System.out.print("Ingrese su opción: ");
      int op = Integer.parseInt(tec.readLine());
      System.out.println();
      int ocupados = 0;

      switch(op){
        case 1:
          if(ocupados == asientos){
            System.out.println("No hay espacio");
            break;
          }
          desplegar(pasajeros);
          System.out.print("Ingrese asiento a reservar:");
          int asientoNuevo = Integer.parseInt(tec.readLine());
          Pasajero pasajeroNuevo = pasajeros[asientoNuevo - 1];
          if (pasajeroNuevo != null){
            System.out.println("Reservado");
            break;
          } else {

          System.out.print("Ingrese Nombre: ");
          String nombre = tec.readLine();
          System.out.print("Ingrese edad: ");
          int edad = Integer.parseInt(tec.readLine());
          
          Pasajero pNuevo = new Pasajero(nombre,edad);
          pasajeros[asientoNuevo -1] = pNuevo;
          System.out.printf("** RESERVADO ASIENTO %d para %s **\n", asientoNuevo, pNuevo);
          ocupados++;
          break;

          }

        case 2:
          System.out.println("Ingresa asiento a cancelar: ");
          int asientoEliminado = Integer.parseInt(tec.readLine());

          pasajeroNuevo = pasajeros[asientoEliminado - 1];
          if (pasajeroNuevo == null){
            System.out.println("**NO TIENE RESERVA**");
            break;
          } else {
            Pasajero pEliminado = pasajeros[asientoEliminado - 1];
            pasajeros[asientoEliminado - 1] = null;
            System.out.printf("** CANCELADO PASAJERO %s **\n", pEliminado);
            ocupados--;
            break;
          }
        
        case 3:
          for(int i = 0; i < pasajeros.length; i++){
            if(pasajeros[i] != null){
              Pasajero reservados = pasajeros[i];
              System.out.println(reservados);
            } 
          }
          break;

        case 4:
          System.out.println("Asientos DISPONIBLES");
          System.out.println("---------------------");
          desplegar(pasajeros);
          break;

        case 5:;
          int disponibles = asientos - ocupados;
          System.out.printf("Saliendo del Programa. DISPONIBLES %d  OCUPADOS %d", disponibles, ocupados);
          return;

          


      }


    }

      
      

    //System.out.println(Arrays.toString(asientosAvion));

    
  

    


    



  }








  public static void desplegar(Pasajero[] asientos) {
    for(int i = 0; i < asientos.length; i++){
      if((i % 6) == 0){
        System.out.println();
      }
      Pasajero p = asientos[i];
      if (p != null){
        continue;
      }

      System.out.print((i + 1) + " ");
    }
    System.out.println();
          
    
  }


}