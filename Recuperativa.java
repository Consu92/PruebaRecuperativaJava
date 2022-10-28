
public class Recuperativa {
    public static void main (String [] arg ){

        Console console = System.console();


     
    
    }


/*Ejercicio #1


/*Ejercicio #2

/*Ejercicio #3

1.Inicio
2.Crear una función que me verifique que los valores ingresados sean correctos.
3. Definir mi arreglo el cual contiene solo valores positivos [1000, 500, 650, 8000]
 -Dentro de la funcion realizar condicionales
 -Si "valor ingresado" es mayor a 0 && "valor ingresado" es menor o igual a "8000" debe retornar el mensaje "ingresado con exito"
--Si "valor ingresado" no es mayor a 0 && "valor ingresado" no es menor o igual a "8000" debe retornar el mensaje "error"

//Ejercicio #4

/*Funcion valor maximo
1.Inicio 
2.Definir mi arreglo que es [200,5500,900,7000,500,300]
3.Crear una función que retorne valor máximo de mi arreglo (que es 7000)
    -Dentro de la función crear un condicional en donde el "valor maximo" es mayor que cero && "valor maximo" == 700 (True)
    -En caso de no realizarse que imprime "No es el valor máximo" (False)
4.Al llamar la función a consola la función retorna 700*/
    int[] intArray = {200,5500,900,7000,500,300};

    int maxNum = intArray[0];

    for (int x: intArray){
        if(x> maxNum)
        maxNum = x;
    }

    System.out.println("Valor más costoso = " + maxNum);
}
/* Funcion valor minimo
1.Inicio 
2.Definir mi arreglo que es [200,5500,900,7000,500,300]
3.Crear una función que retorne valor mínimo de mi arreglo (que es 200)
    -Dentro de la función crear un condicional en donde el "valor minimo" es mayor que cero && "valor minimo" == 200 (True)
    -En caso de no realizarse que imprime "No es el valor minimo" (False)
4.Al llamar la función a consola la función retorna 200*/*/
