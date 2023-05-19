package example_package;

public class SmartDevice {

    public SmartDevice() {
    }

    public SmartDevice(String name, double price, String brand, String ram) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.ram = ram;
    }

    private String name;
    private double price;
    private String brand;
    private String ram;

    static class SmartPhone extends SmartDevice {
        private int coresAmount;
        private String processorName;
        private int camsAmount;
        private int storage;
        private double weight;

        public SmartPhone() {
        }

        public SmartPhone(String name, double price, String brand, String ram, int coresAmount, String processorName, int camsAmount, int storage, double weight) {
            super(name, price, brand, ram);
            this.coresAmount = coresAmount;
            this.processorName = processorName;
            this.camsAmount = camsAmount;
            this.storage = storage;
            this.weight = weight;
        }
    }

    static class SmartWatch extends SmartDevice {
        private String watchBand;
        private double batteryDuration;

        public SmartWatch() {
        }

        public SmartWatch(String name, double price, String brand, String ram, String watchBand, double batteryDuration) {
            super(name, price, brand, ram);
            this.watchBand = watchBand;
            this.batteryDuration = batteryDuration;
        }
    }
}
