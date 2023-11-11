import javax.swing.JOptionPane;

public class Prestacao {
public static void main(String args[]){
    float prest, valor_prest, taxa, dias_atraso;
    valor_prest = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da prestacao: "));
    taxa = Float.parseFloat(JOptionPane.showInputDialog("Informe a taxa de juros: "));
    dias_atraso = Float.parseFloat(JOptionPane.showInputDialog("Informe os dias em atraso: "));
    prest = valor_prest + (valor_prest * (taxa /100) * dias_atraso);
    JOptionPane.showMessageDialog(null,"O valor corrigido da prestacao ficou de: = "+prest);
}    
}
