public class SSC {
  private Robo[] robosFabricados;
  private Robo[] robosNaoSeguem;

  public SSC() {
    this.robosFabricados = new Robo[1000];
    this.robosNaoSeguem = new Robo[1000];
  }

  public boolean fabricarCirurgiao(String no, int ni, boolean segue) {
    for (int i = 0; i < robosFabricados.length; i++) {
      if (robosFabricados[i] == null) {
        robosFabricados[i] = new RoboCirurgiao(no, ni, segue);
        return true;
      }
    }
    return false;
  }

  public boolean fabricarEnfermeiro(String nome, boolean segueLeis) {
    for (int i = 0; i < robosFabricados.length; i++) {
      if (robosFabricados[i] == null) {
        robosFabricados[i] = new RoboEnfermeiro(nome, segueLeis);
        return true;
      }
    }
    return false;
  }

  public boolean fabricarFilosofo(String nome) {
    for (int i = 0; i < robosFabricados.length; i++) {
      if (robosFabricados[i] == null) {
        robosFabricados[i] = new RoboFilosofo(nome);
        return true;
      }
    }
    return false;
  }

  public void mostrarRobosFabricados() {
    System.out.println("Robos fabricados pela SSC:");
    for (Robo roboFabricado : robosFabricados) {
      if (roboFabricado != null) {
        System.out.println(roboFabricado);
      }
    }
  }

  public void mostrarRobosQueNaoSeguem() {
    int j = 0;

    System.out.println("Robos fabricados pela SSC que nao seguem as leis: ");
    for (Robo robo : robosFabricados) {
      if (robosFabricados != null) {
        if (!VerificadorOMS.verificarRobo(robo)) {
          robosNaoSeguem[j++] = robo;
        }
      }
    }

    for (int k = 0; k < j; k++) {
      System.out.println(robosNaoSeguem[k]);
    }
  }
}
