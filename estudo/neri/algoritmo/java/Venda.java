import javax.swing.JOptionPane;

public class Venda {
    public static void main(String args[]){
        float salario, venda, comissao;
        salario = 800;
        venda = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor da venda"));
        comissao = (15 * venda) /100;
        salario = salario + comissao;
        JOptionPane.showMessageDialog(null,"A comissao foi de: "+comissao);
        JOptionPane.showMessageDialog(null,"O salario total foi de: "+salario);
    }
}
