import javax.swing.JOptionPane;

public class Tabuada {
    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        JOptionPane.showMessageDialog(null,"2 x "+n+" = "+(n*2)+"\n3 x "+n+" = "+(n*3)+ "\n4 x "+n+" = "+(n*4)+ "\n5 x "+n+" = "+(n*5)+ "\n6 x "+n+" = "+(n*6)+ "\n7 x "+n+" = "+(n*7)+ "\n8 x "+n+" = "+(n*8)+ "\n9 x "+n+" = "+(n*9));
    }
}
