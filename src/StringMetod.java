// 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

public class StringMetod {
    public static void main(String[] args) {
        String word = "Abelha";
        numA(word);
        word = "Tela";
        numA(word);

    }
    public static void numA(String word) {
        int counter = 0;
        for (int i = 0; i != word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar == 'a' || currentChar == 'A') {
                counter++;
            }
        }
        System.out.println("A palavra " + word + " tem " + counter + " letra(s) A.");
    }
}