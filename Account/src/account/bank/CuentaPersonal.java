package account.bank;

import java.util.Scanner;

public class CuentaPersonal {
    public static void main (String[] args){
        Cuenta SpaceX = new Cuenta("Elon Musk",15000000.00);
        Cuenta anyone = new Cuenta("Felix", -17);

        System.out.printf("El hombre mas rico es %s : $%.2f%n",SpaceX.obtenerNombre(),SpaceX.obternerSaldo());
        System.out.printf("El man que programo esto %s : $%.2f %n",anyone.obtenerNombre(),anyone.obternerSaldo());

        Scanner entrada = new Scanner(System.in);
        Scanner resta = new Scanner(System.in);

        System.out.printf("¿cuanto le gustaria depostitar? %n");
        double deposito1= entrada.nextDouble();
        System.out.printf("Espera se esta procesando su deposito ... %n El monto a depositar es $%.3f, será depositado a la cuenta %s %n" ,
                deposito1 , anyone.obtenerNombre());
        anyone.depositar(deposito1);


        double perdida = resta.nextDouble();
        System.out.printf("Tras la compra de twitter el empresario %s %n  Perdio : $%f %n ¡será el fin de SpaceX! %n" , SpaceX.obtenerNombre(),perdida);
        SpaceX.descuento(perdida);
        System.out.printf("Saldo actual de %s : $%.5f %n", SpaceX.obtenerNombre(),SpaceX.obternerSaldo());
        if(SpaceX.obternerSaldo()<00.00){
            System.out.printf("Las  empresas de  %s esta en bancarrota con una deuda de $%.3f %n", SpaceX.obtenerNombre(),SpaceX.obternerSaldo());
        }

        //MOSTRAR MI SALDO
        System.out.printf("El nuevo Hombre mas Rico del mundo Mr. %s : $%.5f %n",
                anyone.obtenerNombre(), anyone.obternerSaldo());





    }
}
