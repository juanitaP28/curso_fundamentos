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
            info = sensores[i].toString();
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
       if(Confirmacion.equals("Temperatura")){
        info += sensores[i].toString() + "\n";
       }
    }
    }
      return info;
    }
    
    public static String[] ordenarValor(){
        String[] temperatura = Sensor.verTipo();
        int temp;
        int n = temperatura.length;
        for(int i = 1; i < n; i++){
        for(int i=0; i < n-i; i++){
            temp = temperatura[i];
            temperatura[i] = temperatura[i+1];
            temperatura[i+1] = temp;
        }
        for(int i= 0; i < n; i++){
            System.out.println(temperatura[i]);
        }
        
        }
    }
}
