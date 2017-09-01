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
        assertEquals(lista.get(0), "nome");
    }
}