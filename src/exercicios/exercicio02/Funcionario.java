package exercicios.exercicio02;

public class Funcionario {
  private String nome;
  private Float salario;

  public Funcionario(String nome) {
    this.nome = nome;
  }

  public Funcionario(String nome, Float salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public void aumentar(Float aumento){
    this.salario += aumento;
  }

  public void aumentar(Float valor, Float comissao){
    this.salario += valor + comissao;
  }
}
