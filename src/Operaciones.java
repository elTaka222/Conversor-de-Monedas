
public class Operaciones {
    
    private double valor, resultado;
    private int divisa1, divisa2;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(int divisa1) {
        this.divisa1 = divisa1;
    }

    public int getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }
    
    //constructor

    public Operaciones() {
        
    }
    
    //operaciones
    
    public double convertir(){
        
       // valores son = a # desiganado por el programa
       // DOLAR                =   0
       // EURO                 =   1
       // LIBRAS ESTERLINAS    =   2
       // YEN JAPONES          =   3
       // WON SUL-COREANO      =   4
       // PESO MEXICANO        =   5

        
        if (divisa1 == 0 && divisa2 == 1){ // USA A EURO
            resultado = valor * 0.94;}
        
        else if(divisa1 == 0 && divisa2 == 2){ //USA A libras Esterlinas
            resultado = valor * 0.84;}
        
        else if(divisa1 == 0 && divisa2 == 3){ //USA A YEN JAPONES
            resultado = valor * 133.48;}
        
        else if(divisa1 == 0 && divisa2 == 4){ //USA A WON SUL-COREANO
            resultado = valor * 1314.80;}
        
        else if(divisa1 == 0 && divisa2 == 5){ //USA A PESOS MX
            resultado = valor * 18.39;}
        
        else if(divisa1 == 0 && divisa2 == 0){ //USA A USA
            resultado = valor;}
        
        //INICIA EURO
        
        else if(divisa1 == 1 && divisa2 == 0){ //EURO A USA
            resultado = valor * 1.06;}
        
        else if(divisa1 == 1 && divisa2 == 1){ //EURO A EURO
            resultado = valor;}
        
        else if(divisa1 == 1 && divisa2 == 2){ //ERO A LIBRA
            resultado = valor * 0.88;}
        
        else if(divisa1 == 1 && divisa2 == 3){ //EURO A YEN JAPONES
            resultado = valor * 144.46;}
        
        else if(divisa1 == 1 && divisa2 == 4){ //EURO A WON SUL-COREANO
            resultado = valor * 1390.07;}
        
        else if(divisa1 == 1 && divisa2 == 5){ //EURO A PESOS MX
            resultado = valor * 19.40;}
        
        //INICIA LIBRA
        
        else if(divisa1 == 2 && divisa2 == 0){ //LIBRA A USA
            resultado = valor * 1.19;}
        
        if (divisa1 == 2 && divisa2 == 1){ //LIBRA A EURO
            resultado = valor * 1.13;}
        
        else if(divisa1 == 2 && divisa2 == 2){ //LIBRA A LIBRA
            resultado = valor;}
        
        else if(divisa1 == 2 && divisa2 == 3){ //LIBRA A YEN JAPONES
            resultado = valor * 163.05;}
        
        else if(divisa1 == 2 && divisa2 == 4){ //LIBRA A WON SUL-COREANO
            resultado = valor * 1570.72;}
        
        else if(divisa1 == 2 && divisa2 == 5){ //LIBRA A PESOS MX
            resultado = valor * 21.96;}
        
        //INICIA YEN JAPONES 
        
        else if(divisa1 == 3 && divisa2 == 0){ //YEN A USA
            resultado = valor * 0.0073;}
        
        if (divisa1 == 3 && divisa2 == 1){ //YEN A EURO
            resultado = valor * 0.0069;}
        
        else if(divisa1 == 3 && divisa2 == 2){ //YEN A LIBRAS
            resultado = valor * 0.0061;}
        
        else if(divisa1 == 3 && divisa2 == 3){ //YEN A YEN
            resultado = valor;}
        
        else if(divisa1 == 3 && divisa2 == 4){ //YEN A WON SUL-COREANO
            resultado = valor * 9.63;}
        
        else if(divisa1 == 3 && divisa2 == 5){ //YEN A PESOS MX
            resultado = valor * 0.13;}
        
        //WON SUL-COREANO
        
        else if(divisa1 == 4 && divisa2 == 0){ //WON A USA
            resultado = valor * 0.00076;}
        
        if (divisa1 == 4 && divisa2 == 1){ //WON A EURO
            resultado = valor * 0.00072;}
        
        else if(divisa1 == 4 && divisa2 == 2){ //WON A LIBRAS
            resultado = valor * 0.00064;}
        
        else if(divisa1 == 4 && divisa2 == 3){ //WON A YEN JAPONES
            resultado = valor * 0.10;}
        
        else if(divisa1 == 4 && divisa2 == 4){ //WON A WON SUL-COREANO
            resultado = valor;}
        
        else if(divisa1 == 4 && divisa2 == 5){ //WON A PESOS MX
            resultado = valor * 0.014;}
        
        
        //COMIENZA PESOS MX
        
        else if(divisa1 == 5 && divisa2 == 0){ //PESOS MX A USA
            resultado = valor * 0.054;}
        
        if (divisa1 == 5 && divisa2 == 1){ //PESOS MX A EURO
            resultado = valor * 0.051;}
        
        else if(divisa1 == 5 && divisa2 == 2){ //PESOS MX A LIBRAS
            resultado = valor * 0.046;}
        
        else if(divisa1 == 5 && divisa2 == 3){ //PESOS MX A YEN JAPONES
            resultado = valor * 7.42;}
        
        else if(divisa1 == 5 && divisa2 == 4){ //PESOS MX A WON SUL-COREANO
            resultado = valor * 71.51;}
        
        else if(divisa1 == 5 && divisa2 == 5){ //PESOS MX A PESOS MX
            resultado = valor;}
        
        
        
        return resultado;
    }
    
}
