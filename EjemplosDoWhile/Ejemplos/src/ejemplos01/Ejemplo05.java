/*
Este codigo, usa tres variables para guardar la informacion de la multiplicacion
de numeros anteriores que al ciclo limitados por la variable potencia 
que dicta el numero de veces que se repite el ciclo.
Osea elevar a una potencia a un numero dado.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        // 2. numero, i[0, n]
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
        numero = 3;
        // 8. potencia <-- 3
        potencia = 2;
        // 9. resultado <-- 1
        resultado = 1;

        int contador = 1;

        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
