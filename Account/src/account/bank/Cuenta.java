package account.bank;

public class Cuenta {
    private String name;
    private double saldoInicial;

    //Procedere a crear un constructor
    public Cuenta(String name, double saldoInicial){
        this.name=name;

        if (saldoInicial>00.00){
            this.saldoInicial=saldoInicial;
        }
    }
    //generamos los getter and setter de name
    public void establecerNombre(String name){
        this.name=name;
    }
    public String obtenerNombre(){
        return name;
    }

    //generamos lso getter and setter de Saldo Incial

    public void depositar(double montoDeposito){
        if(montoDeposito>00.00){
            saldoInicial = saldoInicial + montoDeposito;
        }
    }
    public void descuento(double montoDeposito){
        if(montoDeposito> 00.00){
            saldoInicial = saldoInicial - montoDeposito;
        }

    }

    public double obternerSaldo(){
        return saldoInicial;
    }
}
