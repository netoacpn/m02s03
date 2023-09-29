package exercicios.exercicio01;

public class TesteAumento {
  public static void main(String[] args) {

    Funcionario funcionario1 = new Funcionario(12345678901L, "Neto Pereira", 4000F);

    Funcionario funcionario2 = new Funcionario();
    funcionario2.setCpf(12345678901L);
    funcionario2.setNomeCompleto("Antonio Carlos");
    funcionario2.setSalario(3000F);

    funcionario1.promover(10F);
    System.out.println(funcionario1.getSalario());

    funcionario2.promover(10F);
    System.out.println(funcionario2.getSalario());


  }
}
