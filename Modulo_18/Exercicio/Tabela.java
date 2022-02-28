package Modulo_18.Exercicio;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface Tabela {
    String value();
}
