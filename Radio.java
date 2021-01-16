import java.util.*;

public class Radio implements Interface{

  boolean estado = false;
  boolean emisora = false;
  double estacion = 87.9;

  double[] AM = {530, 540, 550, 560, 570, 580, 590, 600, 610, 620, 630, 640}; 
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
      String emisoraString = String.valueOf(emisora);

      message = "El boton "+boton+"ha guardado la emisora "+emisoraString+" FM.";


    }else{ //AM
      AM[btn-1] = estacion;

      String boton = String.valueOf(btn);
      String emisoraString = String.valueOf(emisora);

      message = "El boton "+boton+"ha guardado la emisora "+emisoraString+" AM.";

    }
    return message;

  }

  public String seleccionar(int btn){
    String message = "";
    if (emisora == false){
      estacion = FM[btn-1];

      message = "Ha seleccioned el boton " + String.valueOf(btn) + " con la emisora " + String.valueOf(estacion) + " FM."; 
    }else{
      estacion = AM[btn-1];

      message = "Ha seleccioned el boton " + String.valueOf(btn) + " con la emisora " + String.valueOf(estacion) + " AM."; 

    }
  
    return message;

  }

  public double avanzar(){
    if (emisora == false){
      estacion += 0.2;
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