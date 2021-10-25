public class Sensor
{
private String tipo;
private double valor;
public static Sensor[] sensores = new Sensor[8];
public static int tamano = 8;// cuantos sensores se pueden crear
public static int posAnadir = 0;



public Sensor(){
    posAnadir = posAnadir + 1;
}
public Sensor(String t, double v){
    this.tipo = t;
    this.valor = v;
    posAnadir = posAnadir + 1;
}
public String getTipo(){
    return this.tipo;
}
public double getValor(){
    return this.valor;
}
public void setTipo(String t){
    this.tipo = t;
}
public void setValor(double v){
    this.valor = v;
}
public String toString(){
    String info = this.getTipo() + " "+ this.getValor();
    return info;
}
public static String toStringSensores(){
    String info = "";
    for(int i = 0; i < sensores.length; i++){
        if(sensores[i] == null){ break;}else{ 
            info += sensores[i].toString() + "\n";
        }
    }
    return info;
}

public static int cantidadSensores(){
    return posAnadir;
}

public static String verTipo(){
  String info = "";
  for(int i = 0; i < sensores.length; i++){
    if(sensores[i] == null){
      break;
    }else{ 
   String Confirmacion = sensores[i].getTipo(); 
   if(Confirmacion.equals("temperatura")){
    info += sensores[i].toString() + "\n";
   }
  }
 }
  return info;
}


public static Sensor[] OrganizarPorValor(){
 int tamaño = 0;
 for(int i = 0; i < sensores.length; i++){
   if(sensores[i] == null){ 
     break;
      }else{ 
       String Confirmacion = sensores[i].getTipo();
         if(Confirmacion.equals("temperatura")){
           tamaño += 1; 
          }
        }
      }
       
  Sensor[] SensorPorTipo = new Sensor[tamaño];
  for(int i = 0; i < sensores.length; i++){
   if(sensores[i] == null){ 
     break;
      }else{ 
       String Confirmacion = sensores[i].getTipo();
         if(Confirmacion.equals("temperatura")){
           SensorPorTipo[i] = sensores[i];
           }else{
             break;
           }
          }
        }
      
        Sensor temp;
        int n = tamaño;
        for (int i = 1; i < n-1; i++){ 
            for (int j = 0; j < n-i; j++){ 
                if (SensorPorTipo[j].getValor() > SensorPorTipo[j+1].getValor())
                {
                    temp = SensorPorTipo[j];
                    SensorPorTipo[j] = SensorPorTipo[j+1];
                    SensorPorTipo[j+1] = temp;
                }
                }
               } 
                return SensorPorTipo;
   }
}
