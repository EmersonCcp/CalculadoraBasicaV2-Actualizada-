package calculadorabasicav2;

public class Dividir extends Operaciones {

    private double acu = 1;

    @Override
    public void Operacion() {
        CantidadValores();
        int Vec[] = new int[getC_numeros()];
        for (int i = 0; i < getC_numeros(); i++) {
            System.out.print("" + (i + 1) + ". Ingrese un numero: ");
            Vec[i] = in.nextInt();
            if(acu==1){
              acu =  Vec[i]/acu;  
            }else{
                acu=acu/Vec[i];
            }
            
        }
        System.out.println("El resultado de la resta es: " + acu);
        System.out.println("-------------------------------------------");
    }
}
