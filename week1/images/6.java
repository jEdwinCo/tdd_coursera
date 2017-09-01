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

}
