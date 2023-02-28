
public class OperacionesTemp {
    
    private double valor1,resultado1;
    private int temperatura1, temperatura2;

    public double getTemperatura() {
        return valor1;
    }

    public void setTemperatura(double temperatura) {
        this.valor1 = temperatura;
    }

    public double getResultado1() {
        return resultado1;
    }

    public void setResultado1(double resultado1) {
        this.resultado1 = resultado1;
    }

    public int getTemperatura1() {
        return temperatura1;
    }

    public void setTemperatura1(int temperatura1) {
        this.temperatura1 = temperatura1;
    }

    public int getTemperatura2() {
        return temperatura2;
    }

    public void setTemperatura2(int temperatura2) {
        this.temperatura2 = temperatura2;
    }



    
    //constructor
        public OperacionesTemp() {
    }
        
        
        //operaciones
    public double convertir2(){
        
        
        //CELCIUS           =   0
        //FAHRENHEIT        =   1
        //KELVIN            =   2
        
        
        //CELCIUS
        if (temperatura1 == 0 && temperatura2 == 0){ ///CELCIUS A CELCIUS
            resultado1 = valor1 ;}
        
         if (temperatura1 == 0 && temperatura2 == 1){ //CELCIUS A FAHRENHEIT
            resultado1 = 1.8 * valor1  + 32 ;}
         
         if (temperatura1 == 0 && temperatura2 == 2){ //CELCIUS A KELVIN
            resultado1 = valor1  + 273.15 ;}
         
         //FAHRENHEIT
         
         
         if (temperatura1 == 1 && temperatura2 == 0){ ///FAHRENHEIT A CELCIUS
            resultado1 = valor1 - 17.78;}
        
         if (temperatura1 == 1 && temperatura2 == 1){ //FAHRENHEIT A FAHRENHEIT
            resultado1 = valor1 ;}
         
         if (temperatura1 == 1 && temperatura2 == 2){ //FAHRENHEIT A KELVIN
            resultado1 = (valor1 + 459.67) * 5/9  ;}
         
         //KELVIN
         
         if (temperatura1 == 2 && temperatura2 == 0){ ///KELVIN A CELCIUS
            resultado1 = valor1 -273.15;}
        
         if (temperatura1 == 2 && temperatura2 == 1){ //KELVIN A FAHRENHEIT
            resultado1 = valor1 * 9/5 - 459.67 ;}
         
         if (temperatura1 == 2 && temperatura2 == 2){ //KELVIN A KELVIN
            resultado1 = valor1;}
         
         
        
        
        return resultado1;
    }
    
        
    
        
        
        
    
    }
