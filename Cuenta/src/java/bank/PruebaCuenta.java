package smart.bank;

public class PruebaCuenta {
 public static void main (String[] args){
     Cuenta SpaceX = new Cuenta("Elon",140000.00);
     Cuenta anyone = new Cuenta("Juean", -18.00);

     System.out.printf("EL HOMBRE MAS RICO ES : %s %n  %.2f", SpaceX.obtenerNombre(),SpaceX.obtenerSaldo());

 }
}
