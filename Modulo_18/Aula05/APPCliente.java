package Modulo_18.Aula05;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class APPCliente {

    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o código do cliente",
                "", JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consultarCliente(opcao);
         } catch (ClienteNaoEncontrado2Exception e){
            e.printStackTrace();
            JOptionPane.showInputDialog(null, e.getMessage(), "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
/*        try {
            ClienteService.consultarCliente(opcao);
        } catch (ClienteNaoEncontradoException e){
            System.out.println(e.getStackTrace().toString());
            JOptionPane.showInputDialog(null, e.getMessage(), "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }*/

    }


}
