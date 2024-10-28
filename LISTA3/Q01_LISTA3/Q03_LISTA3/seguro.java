package LISTA3.Q01_LISTA3.Q03_LISTA3;

public class seguro implements tributavel {

    public double Taxa = 42.0;

    @Override
    public double calculaTributos() {
        return Taxa;
    }
}
