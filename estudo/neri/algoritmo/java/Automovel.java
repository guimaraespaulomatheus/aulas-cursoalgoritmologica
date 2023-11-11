import javax.swing.JOptionPane;

public class Automovel {
    public static void main(String args[]) {
        float custo_fabrica, perc_revendedor, impostos, preco_final;
        custo_fabrica = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do custo de fabrica"));
        perc_revendedor = (25 * custo_fabrica) / 100;
        impostos = (45 * custo_fabrica) / 100;
        preco_final = custo_fabrica + perc_revendedor + impostos;
        JOptionPane.showMessageDialog(null, "O custo de fabrica " + custo_fabrica);
        JOptionPane.showMessageDialog(null, "O percentual do revendedor " + perc_revendedor);
        JOptionPane.showMessageDialog(null, "Os impostos " + impostos);
        JOptionPane.showMessageDialog(null, "O preco final " + preco_final);
    }
}
