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
            if( this.isStartOfWord(string, position) || position == 0 ){
                lista_palabras.add(this.splitUntil(string, position, last_position));
                last_position = position;
            }
        }
        return lista_palabras;
    }
    
    private boolean isStartOfWord(String string, int position) {
        boolean result=false;
        char c = string.charAt(position);
        char c_before;
        
        if(position > 0) {
            c_before = string.charAt(position-1);
        }
        else {
            c_before = 0;
        }
        
        if( isUpperCase(c) && !isUpperCase(c_before)){
            result = true;
        }
        return result;
    }
    
    private boolean isUpperCase(char c){
        String string = Character.toString(c);
        return(string == string.toUpperCase());
    }

    private String splitUntil(String string, int position, int last_position) {
        String stringSplit;
        boolean convertToUpeerCase = false;
        /* check if all all character are upper case */
        char c = string.charAt(position);
        char last_c = string.charAt(last_position-1);
        if(isUpperCase(c) && isUpperCase(last_c)) {
            convertToUpeerCase = true;
        }
        
        if(convertToUpeerCase) {
            stringSplit = string.substring(position, last_position);
        }
        else {
            stringSplit = string.substring(position, last_position).toLowerCase();
        }
        return stringSplit;
    }

}
