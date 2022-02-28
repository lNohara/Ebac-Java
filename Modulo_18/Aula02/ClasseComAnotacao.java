package Modulo_18.Aula02;

@PrimeraAnotacao(value = "Valor da Classe", bairros = "Mooca", numeroCasa = 10, noaObrigatorio = 2.5)
public class ClasseComAnotacao {

    @PrimeraAnotacao(value = "Valor da propriedade", bairros = {"Vila Olimpia", "Moema"}, numeroCasa = 30)
    private String nome;
}
