package example_package;

public class IvaCalculator {

    public double calculate(double precioSinIva){
        return (precioSinIva + (precioSinIva * 0.19));
    }
}
