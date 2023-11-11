import javax.swing.JOptionPane;

public class InssSalariolb {
    public static void main(String args[]){
        float salario_bruto, inss, salario_liquido;
        String nome;
        nome = JOptionPane.showInputDialog("Digite o seu nome");
        salario_bruto = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salario"));
        inss = salario_bruto * 9 /100;
        salario_liquido = salario_bruto - inss;
        JOptionPane.showMessageDialog(null,"\n Nome: = "+nome
        +"\n Seu salario bruto foi de: = "+salario_bruto
        +"\n O valor descontado do inss foi de: = "+inss
        +"\n Seu salario liquido foi de: = "+salario_liquido);
    }

}
