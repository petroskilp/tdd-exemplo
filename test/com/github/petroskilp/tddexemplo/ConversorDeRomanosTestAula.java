package com.github.eliasnogueira.tddexemplo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Esta classe é uma classe de exemplo para o entendimento sobre TDD - Test Driven Development
 * Este projeto foi utilizado em uma palestra no Campus Party 2013
 * 
 * Este exemplo foi retirado do livro "TDD - Test Driven Development. Teste e Design no Mundo Real"
 * do autor Mauricio Aniche pela editora Casa do Codigo (http://casadocodigo.com.br)
 * 
 * @author Elias Nogueira <http://about.me/eliasnogueira>
 *
 */
public class ConversorDeRomanosTestAula {

    @Test
    public void converterOSimboloI() {
       ConversorDeRomanos6 conversor = new ConversorDeRomanos6();
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

    @Test
    public void converterOSimboloV() {
       ConversorDeRomanos6 conversor = new ConversorDeRomanos6();
       int resultadoObtido = conversor.converte("V");
       
       assertEquals(5, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloC() {
       ConversorDeRomanos6 conversor = new ConversorDeRomanos6();
       int resultadoObtido = conversor.converte("C");
       
       assertEquals(100, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloII() {
       ConversorDeRomanos6 conversor = new ConversorDeRomanos6();
       int resultadoObtido = conversor.converte("II");
       
       assertEquals(2, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloIV() {
       ConversorDeRomanos6 conversor = new ConversorDeRomanos6();
       int resultadoObtido = conversor.converte("IV");
       
       assertEquals(6, resultadoObtido);
    }
}
