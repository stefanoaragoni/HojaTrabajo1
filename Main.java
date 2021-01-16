
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean estado = false;
    Scanner scan = new Scanner(System.in);
    int loop = 1;

    Radio radio = new Radio();

    while(loop == 1){

      System.out.println("-Simulacion de Carro-\nQue desea hacer?");
      System.out.println("1.Encender el radio \n2.Cambiar de AM a FM a AM \n3.Avanzar en el dial de las emisoras. \n4.Guardar emisora \n5.Seleccionar emisora de un boton \n6.Apagar el radio"); 

      System.out.println("Por favor ingrese el numero de la accion a realizar");

      int opcion = 0;
      while(opcion == 0){
        try{
          opcion = scan.nextInt();
        }catch(Exception e){
          System.out.println("Por favor ingresa un numero correcto.\n\n\n"); 
          scan.next();
          continue;
        }
        
      }

      switch(opcion){
        case 1:
          if(estado == true){
            System.out.println("El radio ya esta encendido.\n\n\n"); 
          }else{
            estado = radio.encenderApagar();
            System.out.println("Se ha encendido el radio.\n\n\n");
          }
          break;
        case 2:
          if(estado == true){
            boolean tipo = radio.amFm();
            if(tipo == false){
              System.out.println("Ahora estas escuchando una emisora FM.\n\n\n"); 
            }else{
              System.out.println("Ahora estas escuchando una emisora AM.\n\n\n"); 
            }
            
          }else{
            System.out.println("El radio esta apagado. No se puede completar esta accion.\n\n\n"); 
          }
          break;
        case 3:
          if(estado == true){
            double estacion = radio.avanzar();
            System.out.println("Ahora estas escuchando: " + estacion+"\n\n\n");
          }else{
            System.out.println("El radio esta apagado. No se puede completar esta accion.\n\n\n");
          }

          break;
        case 4:

          break;
        case 5:

          break;
        case 6:
          if(estado == true){
            estado = radio.encenderApagar();
            System.out.println("Se ha apagado el radio.\n\n\n");
          }else{
            System.out.println("El radio ya esta apagado.\n\n\n"); 
          }
          break;
      }

    }

  }
}