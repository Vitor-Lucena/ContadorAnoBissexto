import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String inputString = JOptionPane.showInputDialog("Digite algum ano");
        double ano = Double.parseDouble(inputString);
        double bissexto = ano *100/100;

        if (ano % 4!=0) {
            System.out.printf(bissexto + " É um ano comum!");
        }
        else if  (ano % 100!=0 ) {
            System.out.printf(bissexto + " É um ano bissexto!");
        }
        else if  (ano % 400!=0 ) {
            System.out.printf(bissexto + " É um ano comum!");
        }
        else {
            System.out.printf(bissexto + " É um ano bissexto!");
        }
    }
}