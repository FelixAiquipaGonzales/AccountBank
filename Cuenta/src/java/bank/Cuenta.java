package smart.bank;

public class Cuenta {
    private String name;
    private double saldoInicial;
    //generamos el contructor para la clase cuenta
    public Cuenta(String name, double montoDeposito){
        this.name=name;
        if (montoDeposito> 00.00){
            saldoInicial= saldoInicial + montoDeposito;
        }

    }
    //generamos los getter and setter de name
    public void establecerNombre(String name) {
        this.name = name;
    }
    public String obtenerNombre(){
        return name;
    }

    //generaramos los getter and setter de SaldoInicial

    public void establecerSaldo(double saldoInicial){
        this.saldoInicial=saldoInicial;
    }

    public double obtenerSaldo(){
        return saldoInicial;
    }
}

















