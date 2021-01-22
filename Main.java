/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre Main.java 
*@Lenguaje Java
*@since 19/01/21
*/

import java.util.Scanner;

class Main {
  /**
  *El método principal, donde se realiza la simulacion de nuestra radio con todos lo que se pidio.
  */
  public static void main(String[] args) {
    //declaracion de propiedades
    boolean estado = false;
    Scanner scan = new Scanner(System.in);
    int loop = 1;

    Radio radio = new Radio();

    //inicio de sistema
    while(loop == 1){

      //menu principal
      System.out.println("-Simulacion de Radio-\nQue desea hacer?");
      System.out.println("1.Encender el radio \n2.Cambiar de AM a FM a AM \n3.Avanzar en el dial de las emisoras. \n4.Guardar emisora \n5.Seleccionar emisora de un boton \n6.Apagar el radio"); 

      System.out.println("Por favor ingrese el numero de la accion a realizar");

      //pide la accion a realizar
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

      //switch del menu
      switch(opcion){
        //encender radio
        case 1:
          if(estado == true){
            System.out.println("El radio ya esta encendido.\n\n\n"); 
          }else{
            estado = radio.encenderApagar();
            System.out.println("Se ha encendido el radio.\n\n\n");
          }
          break;
        //cambiar de am a fm y vice versa
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
        //avanzar la emisora
        case 3:
          if(estado == true){
            double estacion = radio.avanzar();
            System.out.println("Ahora estas escuchando: " + estacion+"\n\n\n");
          }else{
            System.out.println("El radio esta apagado. No se puede completar esta accion.\n\n\n");
          }

          break;
        //guardar emisora en boton
        case 4:
          if(estado == true){
            int boton = 0;
            int loopTemp = 0;
            while(loopTemp == 0){
              System.out.println("\nEn que boton desea guardar la emisora actual? (1-12)");
              try{
                boton = scan.nextInt();
                if(boton > 0 && boton < 13){
                  loopTemp = 1;
                }else{
                  loopTemp = 0;
                }
              }catch(Exception e){
              System.out.println("Por favor ingresa un numero correcto.\n\n\n"); 
              scan.next();
              continue;
              }
            }

            System.out.println("\n"+radio.guardar(boton) + "\n\n\n");

          }else{
            System.out.println("El radio esta apagado. No se puede completar esta accion.\n\n\n");
          }
          break;
        //acceder a emisora mediante boton
        case 5:
          if(estado == true){
            int botonTemporal = 0;
            int loopTemp = 0;

            while(loopTemp == 0){
               System.out.println("\nEn que boton se encuentra la emisora que desea? (1-12)");
              try{
                botonTemporal = scan.nextInt();
                if(botonTemporal > 0 && botonTemporal < 13){
                  loopTemp = 1;
                }else{
                  loopTemp = 0;
                }
              }catch(Exception e){
                System.out.println("Por favor ingresa un numero correcto.\n\n\n"); 
                scan.next();
                continue;
              } 
        
            }
            
            System.out.println("\n"+radio.seleccionar(botonTemporal)+"\n\n\n");
            
          }else{
            System.out.println("El radio esta apagado. No se puede completar esta accion.\n\n\n");
          }
          break;
        //apagar radio
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