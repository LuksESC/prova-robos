public class Main {
  public static void main(String[] args) {
    RoboCirurgiao r1 = new RoboCirurgiao("Lucas", 5, false);

    r1.caminhar();
    r1.fazerCirurgia(4);
    r1.recarregar();
    r1.cuidarPessoa();

    RoboEnfermeiro r2 = new RoboEnfermeiro("jose", true);
    r2.caminhar();
    r2.recarregar();
    r2.setsegueLeis(false);
    r2.cuidarPessoa();

    RoboFilosofo r3 = new RoboFilosofo("putao");
    r3.caminhar();
    r3.recarregar();
    r3.filosofar();
  }

}
