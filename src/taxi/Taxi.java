package taxi;


import taximetro.Taximetro;
import javax.swing.JOptionPane;

public class Taxi {
  
    private Taximetro taximetro;

    public Taxi() {
        taximetro = new Taximetro();
    }

    public void iniciarDeslocamento(){        
        taximetro.zerarTaximetro();        
    }

    public boolean valorPermitido(double km){
        if(km > 0)
            return true;
        else
            return false;
    }
    
    public double calcularValorDeslocamento(double km){
        if (this.valorPermitido(km)){
            taximetro.registrarKmRodados(km);
            return taximetro.calcularValorTotal();
        }
        else{
            return 0;
        }    
    }

    public static void main(String args[]){
        Taxi tx = new Taxi();

        tx.iniciarDeslocamento();
        
        JOptionPane.showMessageDialog(null, "Corrida 1");
        double kmRodados = Double.parseDouble(JOptionPane.showInputDialog("Digite o nro de Km rodados: "));
        double valorPgto1 = tx.calcularValorDeslocamento(kmRodados);
        JOptionPane.showMessageDialog(null, "O valor total é: "+valorPgto1);
        
        
        JOptionPane.showMessageDialog(null, "Corrida 2");
        kmRodados = Double.parseDouble(JOptionPane.showInputDialog("Digite o nro de Km rodados: "));
        double valorPgto2 = tx.calcularValorDeslocamento(kmRodados);
        JOptionPane.showMessageDialog(null, "O valor total é: "+valorPgto2);
        
        
        
        JOptionPane.showMessageDialog(null, "Fim do dia...");
        JOptionPane.showMessageDialog(null, "O faturamento diário é:" + (valorPgto1+valorPgto2));
        
        
    }
}