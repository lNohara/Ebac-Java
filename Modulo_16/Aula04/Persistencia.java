package Modulo_16.Aula04;

import java.io.File;

public interface Persistencia {
    void gravar(File file);
    File ler(String id);
}
