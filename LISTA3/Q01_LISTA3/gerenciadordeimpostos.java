package LISTA3.Q01_LISTA3;

public class gerenciadordeimpostos {
    private double totalImposto;
    private String namePerson;

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public gerenciadordeimpostos(String namePerson) {
        this.namePerson = namePerson;
    }

    public void adicionar(tributavel tributável) {
        this.totalImposto += tributável.getValorImposto();
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
