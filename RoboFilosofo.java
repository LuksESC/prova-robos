public class RoboFilosofo extends Robo {
  public RoboFilosofo(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String no) {
    this.nome = no;
  }

  public void recarregar() {
    System.out.println("O robo filoso " + this.getNome() + " esta descansando.");
  }

  public void caminhar() {
    System.out.println("O robo filoso " + this.getNome() + " esta caminhando.");
  }

  public void filosofar() {
    System.out.println("O robo filoso " + this.getNome() + " esta falando com muita eloquencia...");
  }
}
