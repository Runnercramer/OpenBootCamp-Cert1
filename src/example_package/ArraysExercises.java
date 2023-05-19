package example_package;

public class ArraysExercises {

    public String reverse(String texto){
        char[] initialArray =  texto.toCharArray();
        char[] finalArray =  new char[initialArray.length];
        int cont = 0;
        for (int i = initialArray.length - 1; i >= 0; i--) {
            finalArray[cont] = initialArray[i];
            cont++;
        }
        return String.valueOf(finalArray);
    }
}
