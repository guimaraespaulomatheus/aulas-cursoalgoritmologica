import javax.swing.JOptionPane;

public class Consorcio {
    public static void main(String args[]){
        float total_prest, qtd_prest_pagas, valor_prest, total_prest_pagas, saldo_devedor;
        total_prest = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de prestacoes: "));
        qtd_prest_pagas = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de parcelas pagas: "));
        valor_prest = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da parcela: "));
        total_prest_pagas = valor_prest * qtd_prest_pagas;
        saldo_devedor = valor_prest * (total_prest - qtd_prest_pagas);
        JOptionPane.showMessageDialog(null,"\n O total de prestacoes foi de: = "+total_prest
        +"\n Foram pagas: = "+qtd_prest_pagas+"\n O valor da prestacao e de: = "+valor_prest
        +"\n O total de prestacoes pagas foi de: = "+total_prest_pagas+"\n O saldo devedor ficou de: = "+saldo_devedor);
    }
}
