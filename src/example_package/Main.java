package example_package;

public class Main {

    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(id);
        System.out.println(price);
        System.out.println(value);
        System.out.println(name);

        IvaCalculator calculator = new IvaCalculator();
        System.out.println(calculator.calculate(100));

        String[] arreglo = {"Hola", "este", "es", "un", "texto", "de", "prueba"};
        TextCreator creator = new TextCreator();
        System.out.println(creator.createFinalString(arreglo));
    }

    private static int age = 23;
    private static long id = 1023876543L;
    private static double price = 324.50;
    private static boolean value = true;
    private static String name = "Cristian";

}
