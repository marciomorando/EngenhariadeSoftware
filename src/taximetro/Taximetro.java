package taximetro;


public class Taximetro {
    private static double VALOR_MINIMO = 4.00; //Valor mínimo a ser cobrado
    private static double TAXA_POR_KM_RODADO = 1.00; //R$ 1,00 valor por km rodado/deslocado
    private double kmRodados;//registra a quantidade de km rodados pelo taxímetro/passageiro
    private double valorTotalDeslocamento; // valor total do deslocamento
 
    public Taximetro(){
      
    }

    public void zerarTaximetro(){
        this.valorTotalDeslocamento = VALOR_MINIMO;
    }

    public double calcularValorTotal(){
       
       return (this.kmRodados * TAXA_POR_KM_RODADO) + VALOR_MINIMO;
    }

    public void registrarKmRodados(double kmRodados){
        this.kmRodados = kmRodados;
        this.valorTotalDeslocamento += this.calcularValorTotal();
    }
    
    public double getKmRodados(){
        return(this.kmRodados);
    }
    
    public double CalcularFaturamentoDiario(){
        return valorTotalDeslocamento;
    }
    
   
}