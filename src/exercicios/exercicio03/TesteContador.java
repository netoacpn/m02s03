package exercicios.exercicio03;

public class TesteContador {
  public static void main(String[] args) {
    String frase = "Esta frase deve possuir seis sapatos.";
    int contador = Contador.contarPalavras(frase);
    System.out.println(contador);
  }
}
