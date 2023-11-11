import javax.swing.JOptionPane;

public class Cheque {
    public static void main(String args[]){
        float saldo, entrada_cheque, saldo_final;
        saldo = 500;
        entrada_cheque = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor do cheque:"));
        saldo_final = saldo - entrada_cheque;
        JOptionPane.showMessageDialog(null,"Informe o saldo final"+saldo_final);
    }
}
