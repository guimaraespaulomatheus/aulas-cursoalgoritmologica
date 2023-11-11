import javax.swing.JOptionPane;

class Saldo{
    public static void main(String args[]){
        float valor_saldo, cheque_entrou;
        valor_saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu saldo: "));
        cheque_entrou = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do cheque: "));
        if (cheque_entrou <= valor_saldo)
        {
            valor_saldo = valor_saldo - cheque_entrou;
            JOptionPane.showMessageDialog(null,"O saldo atualizado ficou de: "+valor_saldo);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"\n Atencao saldo insuficiente para realizar a transacao: ");
            JOptionPane.showMessageDialog(null,"\n Transacao negada devido a limite baixo: "+valor_saldo);
        }
    }
}

