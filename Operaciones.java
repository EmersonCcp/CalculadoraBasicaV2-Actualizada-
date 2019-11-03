package calculadorabasicav2;

import java.util.Scanner;

public abstract class Operaciones {

    Scanner in = new Scanner(System.in);
    private int c_numeros;//cantidad de numeros a operar
    private double acumulador = 0;//guarda el resultado de las operaciones

    public void setIn(Scanner in) {
        this.in = in;
}

    public void setC_numeros(int c_numeros) {
        this.c_numeros = c_numeros;
    }

    public void setAcumulador(double acumulador) {
        this.acumulador = acumulador;
    }

    public Scanner getIn() {
        return in;
    }

    public int getC_numeros() {
        return c_numeros;
    }

    public double getAcumulador() {
        return acumulador;
    }

    public void CantidadValores() {
        System.out.print("Ingrese la cantidad de numeros a operar: ");
        c_numeros = in.nextInt();

    }

    public abstract void Operacion();
}
