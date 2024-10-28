package LISTA2.Q01_LISTA2.Q06_LISTA2;

public class pessoa {
    private String namePerson;
    private pessoa mae;
    private pessoa pai;

    public pessoa(String namePerson, pessoa mae, pessoa pai) {
        this.namePerson = namePerson;
        this.mae = mae;
        this.pai = pai;
    }

    public pessoa(String namePerson) {
        this.namePerson = namePerson;
        this.mae = null;
        this.pai = null;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public pessoa getPai() {
        return pai;
    }

    public pessoa getMae() {
        return mae;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        pessoa outraPessoa = (pessoa) obj;
        return this.namePerson.equals(outraPessoa.namePerson) &&
                ((this.mae == null && outraPessoa.mae == null) ||
                        (this.mae != null && this.mae.equals(outraPessoa.mae)));
    }
}
