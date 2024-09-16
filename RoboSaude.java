public abstract class RoboSaude extends Robo {
  private boolean segueLeis;

  public abstract void cuidarPessoa();

  public boolean getsegueLeis() {
    return this.segueLeis;
  }

  public void setsegueLeis(boolean segue) {
    this.segueLeis = segue;
  }

}
