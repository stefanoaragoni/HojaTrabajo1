import java.util.*;

public class Radio implements Interface{

  boolean estado = false;
  boolean emisora = false;
  float estacion = 87.9;

  float[] AM = {530, 540, 550, 560, 570, 580, 590, 600, 610, 620, 630, 640}; 
  float[] FM = {87.9,88.1,88.3,88.5,88.7,88.9,89.1,89.3,89.5,89.7,89.9, 90.1}; 


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
    }else{
      emisora = false;
    }
    return emisora;

  }

  public String guardar(int btn){
    String message = "";
    if(emisora == false){ //FM
      FM[btn] = estacion;

      String boton = String.valueOf(btn);
      String emisoraString = String.valueOf(emisora);

      message = "El boton "+boton+"ha guardado la emisora "+emisoraString+" FM.";


    }else{ //AM
      AM[btn] = estacion;

      String boton = String.valueOf(btn);
      String emisoraString = String.valueOf(emisora);

      message = "El boton "+boton+"ha guardado la emisora "+emisoraString+" AM.";

    }

  }

  public String seleccionar(int btn){


  }

  public double avanzar(){
    if (emisora == false){
      //estacion = 
    }


  }




}