public class RoboEnfermeiro extends RoboSaude {

  public RoboEnfermeiro(String nome, boolean segueLeis) { // construtor
    this.nome = nome;
    this.setsegueLeis(segueLeis);
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String no) {
    this.nome = no;
  }

  public boolean administrarMedicamento(int quantidade) {
    if (quantidade > 0) {
      for (int i = 0; i < quantidade; i++) {
        System.out.println("O robo enfermeiro " + this.getNome() + " esta administrando o medicamento " + i);
      }
      return true;
    }
    return false;
  }

  @Override
  public void recarregar() {
    System.out.println(" O robo enfermeiro " + this.getNome() + " esta descansando");
  }

  @Override
  public void caminhar() {
    System.out.println("O robo enfermeiro " + this.getNome() + " esta caminhando");
  }

  @Override
  public void cuidarPessoa() {
    if (this.getsegueLeis()) {
      System.out.println("O robo enfermeiro " + this.getNome() + " esta cuidando dos enfermos...");
    } else {
      System.out.println("O robo enfermeiro " + this.getNome() + " nao segue as leis da OMS");
    }
  }
}
