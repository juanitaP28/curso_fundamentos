public class Vehiculo{
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano = 10; //cuantos vehículos se pueden crear
    public static int posAnadir = 0; //posición del arreglo para nuevas instancias
    
    public Vehiculo(){
        posAnadir = posAnadir + 1;
    }
    
    public Vehiculo(int mod, String mar, double valor){
        this(0, "", 0.0, "verde");
        posAnadir = posAnadir + 1;
    }
    
    public Vehiculo(int mod, String mar, double valor, String col){
        this.modelo = mod;
        this.marca = mar;
        this.valorComercial = valor;
        this.color = col;
        posAnadir = posAnadir + 1;
    }
    
    public int getModelo(){
        return modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public double getValorComercial(){
        return valorComercial;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setModelo(int m){
        this.modelo = m;
    }
    
    public void setMarca(String ma){
        this.marca = ma;
    }
    
    public void setValorComercial(double vc){
        this.valorComercial = vc;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    
    public String toString(){
        String info = this.getModelo() + " "+ this.getMarca() + " " + this.getValorComercial() + " " + this.getColor();
        return info;
    }
    
    public static String toStringVehiculos(){
        String info = "";
        for(int i = 0; i < vehiculos.length; i++){
            if(vehiculos[i] == null){
                break;
            }else{
                info += vehiculos[i].toString() + "\n";
            }
        }
        return info;
    }
    
    public static int cantidadVehiculos(){
        return posAnadir;
    }
    
    public static String verColor(){
      String info = "";
      for(int i = 0; i < vehiculos.length; i++){
      if(vehiculos[i] == null){
        break;}else{ 
       String Confirmacion = vehiculos[i].getColor(); 
       if(Confirmacion.equals("Verde")){
        info += vehiculos[i].toString() + "\n";
       }
       }
      }
      return info;
    }
    public static String verModelo(){
      String info = "";
      for(int i = 0; i < vehiculos.length; i++){
        if(vehiculos[i] == null){
          break;}else{ 
        int Confirmacion = vehiculos[i].getModelo(); 
       if(Confirmacion >= 2000 && Confirmacion <= 2021){
        info += vehiculos[i].toString() + "\n" ;
            }
          }
        }
      return info;
    }
  
}
