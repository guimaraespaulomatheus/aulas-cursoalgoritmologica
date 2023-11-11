import javax.swing.JOptionPane;

public class SoftwareVs {
    public static void main(String args[]){
        float salario, qtd_softw_vend, salario_total;
        qtd_softw_vend = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a quantidade de softwares vendidos:"));
        qtd_softw_vend = qtd_softw_vend * 50;
        salario = 500;
        salario_total = salario + qtd_softw_vend;
        JOptionPane.showMessageDialog(null,"O salario total foi de: "+salario_total);

    }
}
