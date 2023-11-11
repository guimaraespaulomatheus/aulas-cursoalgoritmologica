import javax.swing.JOptionPane;

public class Ops {
    public static void main(String args[]){
        float num1, num2, soma, multiplicacao, subtracao, divisao;
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 1"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero 2"));
        
        soma = num1 + num2;
        multiplicacao = num1 * num2;
        subtracao = num1 - num2;
        divisao = num1 / num2;
        JOptionPane.showMessageDialog(null,"A soma = "+soma);
        JOptionPane.showMessageDialog(null,"A multiplicacao = "+multiplicacao);
        JOptionPane.showMessageDialog(null,"A subtracao = "+subtracao);
        JOptionPane.showMessageDialog(null,"A divisao = "+divisao);
}
}