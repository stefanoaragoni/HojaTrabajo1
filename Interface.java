/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre Interface.java 
*@Lenguaje Java
*@since 19/01/21
*/

public interface Interface{
  //interface que predetermina los metodos de radio
  /**
  *Este metedo es para poder encender y apagar la radio
  *
  *@return el booleano que indique que sea encendido y apagod.
  *
  */
  public boolean encenderApagar();
  /**
  *Este metedo es para cambiar la emisora de la radio
  *
  *@return el booleano que indique que sea AM (verdaero) y FM (falso).
  *
  */
  public boolean amFm();

  /**
  * Basado en el boton que presione el usuario, se salva una nueva emision de radio en dicho boton.
  *
  *@param Un int que representa uno de los doce botones de la radio.
  *@return Devuelve el String que explica que fue lo que hizo, que se salvo y en donde lo hizo.
  *
  */
  public String guardar(int btn);
  /**
  * Basado en el boton que presione el usuario, devuelva la frecuencia de radio en el boton respectivo en dicho boton.
  *
  *@param Un int que representa uno de los doce botones de la radio.
  *@return Devuelve el String que explica que fue lo que hizo, que se selecciono un cierto boton y trajo su respectiva emisora..
  *
  */
  public String seleccionar(int btn);
  /**
  * Avanza la emisora para adelante, por 0.2 en radio FM y por 10 en radio AM.
  *
  *@return La freceuncia de dicha emisora.
  *
  */
  public double avanzar();

}