public class A {
  private Integer A1;
  private float A2;

  public Integer GetA1() {
    return A1;
  }

  public float GetA2() {
    return A2;
  }

  public Integer SetA1() {
    A1 = 0;
    return A1;
  }

  public float SetA2() {
    A2 = 0;
    return A2;
  }

  public void MA1() {
    System.out.println("MA1");
  }

  public void MA2() {
    System.out.println("MA2");
  }

  public void MA3() {
    System.out.println("Alteracao a classe A partir do clone");
  }

  public int getSoma(int a, int b) {
    return a + b;
  }
}