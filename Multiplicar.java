
package calculadorabasicav2;


public class Multiplicar extends Operaciones{
    private  double acu=1;
    @Override
    public void Operacion(){
        CantidadValores();
        int Vec[] = new int[getC_numeros()];
        for (int i = 0; i < getC_numeros(); i++) {
            System.out.print(""+(i+1)+". Ingrese un numero: ");
            Vec[i] = in.nextInt();
            acu = acu * Vec[i];
        }
        System.out.println("El resultado de la multiplicacion es: " + acu);
        System.out.println("-------------------------------------------");
    }
}
