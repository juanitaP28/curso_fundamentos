public class Principal{
  import java.util.*;
public class Principal{
  public static void MostrarMenu(){
    Scanner sc = new Scanner(System.in);
    boolean inicio = true;
    while(inicio){
      System.out.println("------------------------------------------------------");    
      System.out.println("ingrese un numero.");
      System.out.println("[0], se cierra.");
      System.out.println("[1], se crea una nueva instancia vehículo.");
      System.out.println("[2],  info. de todos los vehículos almacenados.");
      System.out.println("[3],  cantidad de vehículos almacenados.");
      System.out.println("[4],  info. de todos los vehículos verdes.");
      System.out.println("[5],  info. de todos los vehículos de modelos entre 2000 y 2021.");
      System.out.println("[6],  se crea una nueva instancia sensor.");
      System.out.println("[7],  info. de todos los sensores almacenados.");
      System.out.println("[8],  cantidad de sensores almacenados.");
      System.out.println("[9],  info. de todos los sensores tipo temperatura.");
      System.out.println("[666], sensores tipo temperatura, ordenados por valor.");
      System.out.println("------------------------------------------------------");
      int numPedir = sc.nextInt();
     switch(numPedir){
       case 0:
        inicio = false;
        break;
       case 1:
        if(Vehiculo.posAnadir >= 10){
         System.out.println("Error: Base llena");
         break;
        }else{
         System.out.println("Crear un nuevo Vehiculo:");
         System.out.println("Ingrese el Modelo:");
         int modelo = sc.nextInt();
         System.out.println("Ingrese Marca:");
         String marca = sc.next();
         System.out.println("Ingrese el valor Comercial:");
         double valorComercial = sc.nextDouble();
         System.out.println("Ingrese Color:");
         String Color = sc.next().toLowerCase();
         Vehiculo.vehiculos[Vehiculo.posAnadir] = new Vehiculo(modelo, marca, valorComercial, Color);
         }
          break;
         case 2:
         System.out.println("Informacion de todos los vehiculos:");
         System.out.println(Vehiculo.toStringVehiculos());
          break;
         case 3:
         System.out.print("Vehiculos Almacenados:" + " ");
         System.out.println(Vehiculo.posAnadir);
          break;
         case 4:
         System.out.println("Informacion de Vehiculos de Color Verde:"); 
         System.out.println(Vehiculo.verColor());
          break;
         case 5:
         System.out.println("Informacion de vehiculos por Modelo:");
         System.out.println(Vehiculo.verModelo());
          break;
         case 6:
         if(Sensor.posAnadir >= 8){
         System.out.println("Error: Base llena");
         break;
         }else{
         System.out.println("Crear nuevo Sensor:");
         System.out.println("Ingrese Tipo:");
         String tipo = sc.next().toLowerCase();
         System.out.println("Ingrese Valor:");
         double valor = sc.nextDouble();
         Sensor.sensores[Sensor.posAnadir] = new Sensor(tipo, valor);
          }
          break;
         case 7:
         System.out.println("Informacion de los Sensores:");
         System.out.println(Sensor.toStringSensores());
          break;
         case 8: 
         System.out.println("Cantidad de sensores almacenados:");
         System.out.println(Sensor.posAnadir);
          break;
         case 9:
         System.out.println("Informacion de sensores tipo: Temperatura");
         System.out.println(Sensor.verTipo());
         break;
         case 666:
         System.out.println("Informacion de sensores tipo: Temperatura. Organizados por: Valor");
         for(int i = 0; i < Sensor.OrganizarPorValor().length; i++){ 
         System.out.println(Sensor.OrganizarPorValor()[i]);
         }
         break;
          default:
          System.out.println("Error: opcion no disponible");
          break;

       }
    }
  }
  public static void main(String[] args){
   Principal.MostrarMenu();
  
  }
}

}
