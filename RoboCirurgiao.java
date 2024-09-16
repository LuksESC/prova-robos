public class RoboCirurgiao extends RoboSaude {
  private int nivel;

  public RoboCirurgiao(String no, int ni, boolean segue) {
    this.nome = no;
    this.nivel = ni;
    this.setsegueLeis(segue);
  }

  public boolean fazerCirurgia(int nivel) {
    if (getNivel() >= nivel) {
      System.out.println("O robo cirurgiao " + this.getNome() + " esta fazendo a cirurgia de nivel " + nivel);
      return true;
    } else {
      System.out.printf("O robo cirurgiao " + this.getNome() + "nao conseguiu fazer a cirurgia de nivel " + nivel);
    }
    return false;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String no) {
    this.nome = no;
  }

  public int getNivel() {
    return this.nivel;
  }

  public void setNivel(int num) {
    this.nivel = num;
  }

  @Override
  public void cuidarPessoa() {
    if (getsegueLeis()) {
      System.out.println("O robo cirurgiao " + getNome() + " esta cuidando da pessoa...");
    } else {
      System.out.println("O robo cirurgiao" + getNome() + " nao segue as leis da OMS");
    }
  }

  @Override
  public void recarregar() {
    System.out.println("O robo " + this.getNome() + " esta dormindo");
  }

  @Override
  public void caminhar() {
    System.out.println(" O robo " + this.getNome() + " esta caminhando");
  }

}
