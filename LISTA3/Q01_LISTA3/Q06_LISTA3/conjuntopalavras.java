package LISTA3.Q01_LISTA3.Q06_LISTA3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class conjuntopalavras {
    private Set<String> conjunto = new HashSet<>(Arrays.asList("Ola", "Lindo", "Garrafa","Teclado"));

    public boolean contemPalavra(String palavras) {
        String[] palavrasArray = palavras.split(" ");

        for (String palavra: palavrasArray) {
            if (!conjunto.contains(palavra)) {
                return false;
            }
        }
        return true;
    }
}
