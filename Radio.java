import java.util.*;

/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre Radio.java 
*@Lenguaje Java
*@since 19/01/21
*/

//A esta clase no se le agrego javadoc a los métodos ya que fueron implementados a traves de la interfaz Interface.  

public class Radio implements Interface{
  /**
  *Estado del radio si esta encedido o apagado
  */
  private boolean estado = false;
   /**
  *Estado del radio si esta en emisora AM o FM
  */
  private boolean emisora = false;
   /**
  *Frecuencia actual de la radio.
  */
  private double estacion = 87.9;

  /**
  *Frecuencias guardades de la emisora AM, hay 12 espacios por 12 botones.
  */
  double[] AM = {530, 540, 550, 560, 570, 580, 590, 600, 610, 620, 630, 640}; 
  /**
  *Frecuencias guardades de la emisora FM, hay 12 espacios por 12 botones.
  */
  double[] FM = {87.9,88.1,88.3,88.5,88.7,88.9,89.1,89.3,89.5,89.7,89.9, 90.1}; 


  public boolean encenderApagar(){
    if(estado == false){
      estado = true;
    }else{
      estado = false;
    }
    return estado;
  }

  public boolean amFm(){
    if(emisora == false){
      emisora = true;
      estacion = 530;
    }else{
      emisora = false;
      estacion = 87.9;
    }
    return emisora;

  }

  public String guardar(int btn){
    String message = "";
    if(emisora == false){ //FM
      FM[btn-1] = estacion;

      String boton = String.valueOf(btn);
      String emisoraString = String.valueOf(estacion);

      message = "El boton "+boton+"ha guardado la emisora "+emisoraString+" FM.";


    }else{ //AM
      AM[btn-1] = estacion;

      String boton = String.valueOf(btn);
      String emisoraString = String.valueOf(estacion);

      message = "El boton "+boton+" ha guardado la emisora "+emisoraString+" AM.";

    }
    return message;

  }

  public String seleccionar(int btn){
    String message = "";
    if (emisora == false){
      estacion = FM[btn-1];

      message = "Ha seleccionado el boton " + String.valueOf(btn) + " con la emisora " + String.valueOf(estacion) + " FM."; 
    }else{
      estacion = AM[btn-1];

      message = "Ha seleccionado el boton " + String.valueOf(btn) + " con la emisora " + String.valueOf(estacion) + " AM."; 

    }
  
    return message;

  }

  public double avanzar(){
    if (emisora == false){
      estacion = (estacion * 10 + 2)/10;
      if (estacion > 107.9){
        estacion = 87.9;
      }
    } else{
      estacion += 10;
      if (estacion > 1610){
        estacion = 530;
      }
    }
    return estacion;
  }




}