import java.util.ArrayList;
import java.util.List;

public class CamelCaseSplit {
    private List<String> lista_palabras;
    
    public CamelCaseSplit() {
        lista_palabras = new ArrayList<String>();
    }

    public List<String> converterCamelCase(String string) {
        for(int position=(string.length()-1); position>=0; position--) {
            char c = string.charAt(position);
            if(this.isUpperCase(c)){
                lista_palabras.add(this.splitUntil(string, position));
            }
        }
        if(lista_palabras.size() == 0){
            lista_palabras.add(string);
        }
        return lista_palabras;
    }
    
    private Boolean isUpperCase(char c){
        String string = Character.toString(c);
        return(string == string.toUpperCase());
    }

    private String splitUntil(String string, int position) {
        String stringSplit = string.substring(position).toLowerCase();
        return stringSplit;
    }

}
