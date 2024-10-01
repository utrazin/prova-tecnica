// 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

public class FibonacciMetod {
    public static void main(String[] args) {
        int num = 2;
        textReturn(num);
        num = 4;
        textReturn(num);
    }

    public static void textReturn(int num) {
        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " nao pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        if (num == a || num == b) {
            return true;
        }
        int next = a + b;
        while (next <= num) {
            if (next == num) {
                return true;
            }
            a = b;
            b = next;
            next = a + b;
        }
        return false;
    }
}
