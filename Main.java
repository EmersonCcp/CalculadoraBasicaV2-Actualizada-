package calculadorabasicav2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seleccion = 0, sw = 0, opcion = 0;

        do {
            while (opcion < 1 || opcion > 2) {//para que el pelotudo o pelotuda no ingrese un valor distinto
                System.out.println("Desea realizar alguna operacion?\n1. Si   2. No");
                opcion = in.nextInt();
            }
            if (opcion == 1) {
                while (seleccion < 1 || seleccion > 5) {//para que el pelotudo o pelotuda no ingrese un valor distinto X2
                    System.out.println("Operaciones: ");
                    System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
                    seleccion = in.nextInt();
                    switch(seleccion){
                        case 1:
                            Operaciones suma=new Sumar();
                            suma.Operacion();
                            break;
                        case 2:
                            Operaciones resta=new Restar();
                            resta.Operacion();
                            break;
                        case 3:
                            Operaciones multiplicar=new Multiplicar();
                            multiplicar.Operacion();
                            break;
                        case 4:
                            Operaciones dividir=new Dividir();
                            dividir.Operacion();
                            break;
                        case 5:
                            sw=1;//para salir del programa
                            break;
                        default:
                            System.out.println("Opcion Invalida\n--------------");//por si el pelotudo o pelotuda ingresa un valor distino
                            break;
                    }
                    
                    
                }

            } else{
                break;
            }
            opcion=0;
            seleccion=0;
        } while (sw != 1);
    }

}
