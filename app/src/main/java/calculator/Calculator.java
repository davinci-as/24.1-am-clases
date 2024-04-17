package calculator;

public class Calculator {
        public int sumar(int n1, int n2){
            int resultado;
            
            resultado = n1 + n2;

            return resultado;
        }
        public int multiplicar(int n1, int n2){
            int resultado;
            
            resultado = n1 * n2;
            return resultado;
        }

    public int restar(int primero, int segundo ) {
        return primero - segundo;
    }

    public float  dividir(int primero, int segundo) {
        if(segundo == 0) return -1;
        return primero / segundo;
    }

}
