package fms;

public class Coffee {
  public void make() {
    final int prop1 = SimpleSingleton.INSTANCE.getProp1();
    final int jvmStatic = JavaSimpleSingleton.getJvmStatic();
    final int jvmField = JavaSimpleSingleton.jvmField;
  }
}
