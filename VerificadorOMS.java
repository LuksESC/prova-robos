public class VerificadorOMS {
  public static boolean verificarRobo(Robo robo) {
    if (robo != null) {
      if (robo instanceof RoboSaude) {
        return (((RoboSaude) robo).getsegueLeis());
      }
    }
    return false;
  }
}
