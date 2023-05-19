package example_package;

public class TextCreator {

    public String createFinalString(String[] arregloStrings){
        String resultado = "";
        for(int i = 0; i < arregloStrings.length; i++){
            resultado += arregloStrings[i] + " ";
        }
        return resultado;
    }
}
