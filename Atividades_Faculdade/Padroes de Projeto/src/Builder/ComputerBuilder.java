package Builder;

public class ComputerBuilder {
    String HDD;
    String RAM;
    boolean isGraphicsCardEnabled;
    boolean isBluetoothEnabled;

    public ComputerBuilder setHDD(String HDD) {
        this.HDD = HDD;
        return this;
    }

    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder enableGraphicsCard(boolean enabled) {
        this.isGraphicsCardEnabled = enabled;
        return this;
    }

    public ComputerBuilder enableBluetooth(boolean enabled) {
        this.isBluetoothEnabled = enabled;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }
}
