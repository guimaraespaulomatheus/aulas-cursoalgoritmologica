import javax.swing.JOptionPane;

public class Triangulo {
    public static void main(String args[]){
        float li, ld, le;
        li = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento: "));
        ld = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento: "));
        le = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento: "));
        if ((li < (le + ld)) && (le < (ld + li)) && (ld < (li + le)))
            if ((le == ld) && (le == li))
                    JOptionPane.showMessageDialog(null,"Triangulo equilatero");
            else if ((li == ld) || (li == le) || (le == ld))
                    JOptionPane.showMessageDialog(null,"Triangulo isosceles");
            else
                    JOptionPane.showMessageDialog(null,"Triangulo escaleno");
        else
                JOptionPane.showMessageDialog(null,"Nao e um triangulo");
    }
}
