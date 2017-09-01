import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TesteCamelCase {

    @Test
    public void test() {
        CamelCaseSplit cc_split = new CamelCaseSplit();
    }
    
    @Test
    public void testeUmaPalabra() {
        CamelCaseSplit cc_split = new CamelCaseSplit();
        List<String> lista; 
        lista = cc_split.converterCamelCase("nome");
        assertEquals(1,lista.size());
        assertEquals("nome", lista.get(0));
    }
    
    @Test
    public void testeUmaPalabraMaisculo() {
        CamelCaseSplit cc_split = new CamelCaseSplit();
        List<String> lista;
        lista = cc_split.converterCamelCase("Nome");
        assertEquals(1,lista.size());
        assertEquals("nome", lista.get(0));
    }
    
    @Test
    public void testeDoisPalabra() {
        CamelCaseSplit cc_split = new CamelCaseSplit();
        List<String> lista; 
        lista = cc_split.converterCamelCase("nomeComposto");
        assertEquals(2,lista.size());
        assertEquals("nome", lista.get(1));
        assertEquals("composto", lista.get(0));
    }
    
    @Test
    public void testeDoisPalabraMaiusculo() {
        CamelCaseSplit cc_split = new CamelCaseSplit();
        List<String> lista;
        lista = cc_split.converterCamelCase("NomeComposto");
        assertEquals(2,lista.size());
        assertEquals("nome", lista.get(1));
        assertEquals("composto", lista.get(0));
    }
    
    @Test
    public void testeTudoMaiusculo() {
        CamelCaseSplit cc_split = new CamelCaseSplit();
        List<String> lista; 
        lista = cc_split.converterCamelCase("CPF");
        assertEquals(1,lista.size());
        assertEquals("CPF", lista.get(0));
    }
    
    @Test
    public void testeDoisPalabraUmMaiusculo() {
        CamelCaseSplit cc_split = new CamelCaseSplit();
        List<String> lista;
        lista = cc_split.converterCamelCase("numeroCPF");
        assertEquals(2,lista.size());
        assertEquals("numero", lista.get(1));
        assertEquals("CPF", lista.get(0));
    }
    
    @Test
    public void testeTresPalabras() {
        CamelCaseSplit cc_split = new CamelCaseSplit();
        List<String> lista;
        lista = cc_split.converterCamelCase("numeroCPFContribuinte");
        assertEquals(3,lista.size());
        assertEquals("numero", lista.get(2));
        assertEquals("CPF", lista.get(1));
        assertEquals("contribuinte", lista.get(0));
    }

}
