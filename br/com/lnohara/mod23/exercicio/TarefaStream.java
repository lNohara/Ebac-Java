package br.com.lnohara.mod23.exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TarefaStream {

    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[5];

        System.out.println("Informe o primeiro nome, quando o nome for solicitado");
        System.out.println("Informe m ou f, quando sexo for solicitado");
        Scanner keyboard = new Scanner(System.in);

        List<Pessoa> p = new ArrayList<Pessoa>();

        for(int x=0; x<pessoa.length; ++x){
            pessoa[x] = new Pessoa();
        }

        for(int x=0; x<pessoa.length; x++){
            System.out.print("Nome #" + (x+1) + ": ");
            pessoa[x].setNome(keyboard.nextLine());

            System.out.print("m/f #" + (x+1) + ": ");
            pessoa[x].setSexo(keyboard.nextLine());

            p.add(pessoa[x]);
        }

        System.out.println(exibeCadastrados(p));
        System.out.println("****************************");

        System.out.println(exibeMulheresCollect(p));
        System.out.println("****************************");

        System.out.println(contantoAsMulheres(p));
        System.out.println("****************************");
    }

    public static String exibeCadastrados(List<Pessoa> p){
        System.out.println("Exibindo todas as pessoas cadastradas");
        System.out.println("Pessoas Cadastradas" + p);

        return p.toString();
    }

    public static List<Pessoa> exibeMulheresCollect(List<Pessoa> p){
        System.out.println("Utilizando filter, collect e forEach");
        return  p.stream()
                .filter(mulheres -> mulheres.getSexo()
                        .equalsIgnoreCase("f"))
                .collect(Collectors.toList());
    }

    public static int contantoAsMulheres(List<Pessoa> p){
        long count = p.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("f"))
                .count();
        System.out.println("Total de Mulheres: " + count);

        return (int) count;
    }
}