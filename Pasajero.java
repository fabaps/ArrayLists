public class Pasajero {

  //Campos
  private String nombre;
  private int edad;

  //Constructor
  public Pasajero(String nombre,int edad){
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre(){
    return this.nombre;
  }

  public int getEdad(){
    return this.edad;
  }

  @Override
  public String toString(){
    return String.format("%s - %d", this.nombre, this.edad);
  }
}