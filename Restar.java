package calculadorabasicav2;

public class Restar extends Operaciones {

    private double acu = 0;
    int sw=0;
    @Override
    public void Operacion() {
        CantidadValores();
        int Vec[] = new int[getC_numeros()];
        for (int i = 0; i < getC_numeros(); i++) {
            System.out.print("" + (i + 1) + ". Ingrese un numero: ");
            Vec[i] = in.nextInt();
            if(acu==0){
                acu = Vec[i] - acu;
            System.out.println(acu);
            }else{
                sw=1;
                acu=acu-Vec[i];
                System.out.println(acu);
            }
            
                    
        }
        System.out.println("El resultado de la resta es: " + acu);
        System.out.println("-------------------------------------------");
    }

}
