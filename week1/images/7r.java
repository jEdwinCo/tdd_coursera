import java.util.ArrayList;
import java.util.List;

public class CamelCaseSplit {
    private List<String> lista_palabras;
    
    public CamelCaseSplit() {
        lista_palabras = new ArrayList<String>();
    }

    public List<String> converterCamelCase(String string) {
        int last_position = string.length();
        for(int position=(string.length()-1); position>=0; position--) {
            char c = string.charAt(position);
            
            if(this.isUpperCase(c) || position == 0 ){
                lista_palabras.add(this.splitUntil(string, position, last_position));
                last_position = position;
            }
        }
        return lista_palabras;
    }
    
    private Boolean isUpperCase(char c){
        String string = Character.toString(c);
        return(string == string.toUpperCase());
    }

    private String splitUntil(String string, int position, int last_position) {
        String stringSplit = string.substring(position, last_position).toLowerCase();
        return stringSplit;
    }

}
