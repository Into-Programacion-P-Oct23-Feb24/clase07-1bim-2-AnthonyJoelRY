/*
1
2
3
4
5
6
7
8
9
10
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        int contador = 1;
        int suma = 0;
        do {
            suma = suma + contador;
            contador++;
        } while (contador <= 10);
        System.out.printf("%d\n", suma);
    }

}
