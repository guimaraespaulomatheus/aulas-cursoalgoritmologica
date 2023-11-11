import javax.swing.JOptionPane;

class Desconto{
    public static void main(String args[]){
        float valor_compra, valor_desconto, valor_pagar;
        int desconto;
        String nome;

        nome = JOptionPane.showInputDialog("O nome do cliente é: ");
        valor_compra = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da compra: "));

        if (valor_compra <= 200)
            desconto = 10;
        else if (valor_compra <= 500)
            desconto = 15;
        else
            desconto = 20;
        
        valor_desconto = (valor_compra * desconto) /100;
        valor_pagar = valor_compra - valor_desconto;

        JOptionPane.showMessageDialog(null,"\n O nome do cliente é: "+nome);
        JOptionPane.showMessageDialog(null,"\n O valor da compra foi de: "+valor_compra);
        JOptionPane.showMessageDialog(null,"\n O percentual de desconto foi de: "+desconto);
        JOptionPane.showMessageDialog(null,"\n O valor do desconto ficou de: "+valor_desconto);
        JOptionPane.showMessageDialog(null,"\n O valor total a pagar ficou de: "+valor_pagar);
    }
}