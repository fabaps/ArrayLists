public class Jugadores {

  String jugador1;

  public Jugadores(String jugador1){
    this.jugador1 = jugador1;
  }

  public String getJugador1(){
    return this.jugador1;
  }



  @Override
  public String toString(){
    return String.format("%s", this.jugador1);
  }



  
}
