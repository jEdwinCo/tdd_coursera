import java.util.ArrayList;
import java.util.List;

public class CamelCaseSplit {
    private List<String> lista_palabras;
    
    public CamelCaseSplit() {
        // TODO Auto-generated constructor stub
        lista_palabras = new ArrayList<String>();
    }

    public List<String> converterCamelCase(String string) {
        // TODO Auto-generated method stub
        lista_palabras.add(string);
        return lista_palabras;
    }

}
