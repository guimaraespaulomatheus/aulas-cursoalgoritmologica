import javax.swing.JOptionPane;

class Avaliacao{
    public static void main(String args[]){
        float prova1, prova2, prova3, media;
        prova1 = Float.parseFloat(JOptionPane.showInputDialog(null,"\n Digite o valor da prova 1: "));
        prova2 = Float.parseFloat(JOptionPane.showInputDialog(null,"\n Digite o valor da prova 2: "));
        prova3 = Float.parseFloat(JOptionPane.showInputDialog(null,"\n Digite o valor da prova 3: "));
        
        prova1 = prova1 * 2 /10;
        prova2 = prova2 * 3 /10;
        prova3 = prova3 * 5 /10;
        media = (prova1 + prova2 + prova3);
        JOptionPane.showMessageDialog(null,"\n O valor da media final foi " + media);

}
}