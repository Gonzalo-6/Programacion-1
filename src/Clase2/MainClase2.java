package Clase2;

public class MainClase2 {
    public static void main(String[] args){
        final double PI = 3.1416;//constante de tipo double
        final int EDAD_MAXIMA = 100; // constante de tipo entero
        System.out.println("EL valor de PI es: " + PI);
        System.out.println("La edad maxima permitida es: " + EDAD_MAXIMA);

        // Operaciones aritmeticas
        int a = 8, b = 3;
        System.out.println("Suma: " + (a+b));
        System.out.println("Resta: " +(a-b));
        System.out.println("Multiplcación: " + (a*b));
        System.out.println("División: " + (a/b));
        System.out.println("Módulo: " + (a%b));


        //Operadores relacionales
        int x = 10, y = 20;
        System.out.println("¿x es igual a y?"  + (x==y));
        System.out.println("¿x es diferente de y?" + (x!=y));
        System.out.println("¿x es mayor que y?" + (x>y));
        System.out.println("x es menos que y?" + (x<y));


        //Operadores lógicos
        boolean c = true, d = false;
        System.out.println("c AND d:" + (c&&d));
        System.out.println("c OR d:" + (c||d));
        System.out.println("NOt c:" + (!c));

        //Expresiones y evaluaciones
        int resultado = (10 + 5)*2/3;
        System.out.println("El resultado de la expresión es:" + resultado);

        //Ejercicios
        final double GRAVEDAD = 9.81; //Constante de tipo double
        System.out.println("LA constante de la gravedad es: " + GRAVEDAD);

        int f = 25, g = 7;
        System.out.println("La Suma es: " + (f+g));
        System.out.println("La mierda de la resta es: " + (g-f));
        System.out.println("Multiplicación: " + (f*g));
        System.out.println("División es: " + (f/g));
        System.out.println("EL resto es: " + (f%g));






    }
}

