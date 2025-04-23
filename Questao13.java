public class Questao13 {
    public static int potencia(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * potencia(x, n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(potencia(2, 4)); 
    }
}
