package example_package;

public class Main {

    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice();
        SmartDevice.SmartPhone smartPhone = new SmartDevice.SmartPhone();
        SmartDevice.SmartWatch smartWatch = new SmartDevice.SmartWatch();

        //-------------------------------------------------

        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

        ArraysExercises arraysExercises = new ArraysExercises();
        System.out.println(arraysExercises.reverse("Cristian"));

        String[] arrayStringUnidimensional = {"Cristian", "David", "Vargas", "Mesa"};
        for (int i = 0; i < arrayStringUnidimensional.length; i++) {
            System.out.println(arrayStringUnidimensional[i]);
        }

        int[][] arrayBidimensionalInt = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arrayBidimensionalInt.length; i++) {
            for (int j = 0; j < arrayBidimensionalInt[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arrayBidimensionalInt[i][j] + "; ");
            }
            System.out.println();
        }


        String[] nombres = {"Cristian", "David", "Daniela", "Valentina", "Dayanna"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]+ " ");
        }
    }
}
