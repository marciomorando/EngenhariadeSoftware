/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taximetro;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import taxi.Taxi;

/**
 *
 * @author MarcioMorando
 */
public class testeTaximetro extends TestCase{
    public testeTaximetro(){
        
    }
    
    public void testeRegistrarKmRodados(){
       Taximetro meuTaximetro = new Taximetro();
       meuTaximetro.registrarKmRodados(5);
       assertEquals(5.0,meuTaximetro.getKmRodados());
    
    }
    
    /*public void testeCalcularFaturamentoDiario(){
         Taximetro meuTaximetro = new Taximetro();
         meuTaximetro.registrarKmRodados(5);
         meuTaximetro.registrarKmRodados(3);
         meuTaximetro.registrarKmRodados(25);
         assertEquals(45.0,meuTaximetro.CalcularFaturamentoDiario());
         
    }
    
    public void testeCalcularValorDeslocamento(){
        Taxi t = new Taxi();
        assertEquals(28.0,t.calcularValorDeslocamento(25));
    }
    
    
    public void testeTaxiCalcularFaturamentoDiario(){
        Taxi t = new Taxi();
        t.calcularValorDeslocamento(4);
        t.calcularValorDeslocamento(4);
        
        assertEquals(16.0,t.CalcularFatDiario());
        
    }
   
    
   /* public void testeCalculaValorTotal(){
        Taximetro t = new Taximetro();
        assertEquals(9.0,t.calcularValorTotal(),0);
    }*/
    
}
