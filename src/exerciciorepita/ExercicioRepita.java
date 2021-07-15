package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author JANE
 */
public class ExercicioRepita {

    public static void main(String[] args) {

        //   JOptionPane.showMessageDialog(null,"Olá Mundo","Boas Vindas",JOptionPane.INFORMATION_MESSAGE); mostrar na tela
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>informe um número: <br><em>(valor zero interrompe)</em></html>"));
            //JOptionPane.showInputDialog(null,"voce digitou o valor" + n); mostra o numero q foi digitado na tela
            s += n;

        } while (n != 0);
        JOptionPane.showInputDialog(null, "<html> Resultado final: <hr>" + "<br> Somatorio vale " + s + "</html>");
    }
}
