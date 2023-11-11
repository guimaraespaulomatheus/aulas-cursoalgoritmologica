import javax.swing.JOptionPane;

public class MaiorMenor {
    public static void main(String args[]){
        int n1, n2, n3;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de n2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de n3: "));

        if ((n1 >= n2) & (n1 >= n3))
        {
            JOptionPane.showMessageDialog(null,"\n O valor de n1 é maior. "+n1);
        if (n2 <= n3)
            JOptionPane.showMessageDialog(null,"\n O valor de n2 é menor. "+n2);
        else
            JOptionPane.showMessageDialog(null,"\n O valor de n3 é menor. "+n3);
        }
        if ((n2 >= n1) & (n2 >= n3)){
            JOptionPane.showMessageDialog(null,"\n O valor de n2 é maior. "+n2);
        if (n1 <= n3)
            JOptionPane.showMessageDialog(null,"\n O valor de n1 é menor. "+n1);
        else
            JOptionPane.showMessageDialog(null,"\n O valor de n3 é menor. "+n3);
        }
        if ((n3 >= n2) & (n3 >= n1)){
            JOptionPane.showMessageDialog(null,"\n O valor de n3 é maior. "+n3);
        if (n2 <= n1)
            JOptionPane.showMessageDialog(null,"\n O valor de n2 é menor. "+n2);
        else
            JOptionPane.showMessageDialog(null,"\n O valor de n1 é menor. "+n1);
        }
    }   
}   

