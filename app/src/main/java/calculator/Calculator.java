package calculator;

public class Calculator {
    //TODO: feat: agregar metodo de suma de dos enteros

    //TODO: feat: agregar metodo de multiplicacion de dos enteros

    public int restar(int primero, int segundo ) {
        return primero - segundo;
    }

    public float  dividir(int primero, int segundo) {
        if(segundo == 0) return -1;
        return primero / segundo;
    }
}
