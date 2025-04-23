public class Questao14 {
    public static boolean ePrimo(int n, int divisor) {
        if (n <= 2) return (n == 2);
        if (n % divisor == 0) return false;
        if (divisor * divisor > n) return true;
        return ePrimo(n, divisor + 1);
    }

    public static void main(String[] args) {
        int numero = 17;
        System.out.println(ePrimo(numero, 2)); 
    }
}
