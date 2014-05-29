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
    
    public void testeCalculaDeslocamento(){
       Taxi meuTaximetro = new Taxi();
       assertEquals(9.0,meuTaximetro.calcularValorDeslocamento(5),0);
    
    }
    
    public void testeCalculaValorTotal(){
        Taximetro t = new Taximetro();
        assertEquals(9.0,t.calcularValorTotal(),0);
    }
    
}
