// Interface defining a common ability
interface Switchable {
    void turnOn();
    void turnOff();
}

class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light: LED bulb glows brightly.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light: LED bulb switched off.");
    }
}

class AC implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("AC: Compressor started, cooling room to 22°C.");
    }

    @Override
    public void turnOff() {
        System.out.println("AC: Flaps closed and cooling stopped.");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Blades spinning at medium speed.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Blades slowing down to a stop.");
    }
}

// Added one more class later without changing main's loop logic
class SmartTV implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("SmartTV: Screen powered on, loading home dashboard.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTV: Entering standby mode.");
    }
}

public class Q20_InterfaceDemo {
    // Helper method showing main loop logic works seamlessly with any new Switchable class
    public static void operateDevices(Switchable[] devices) {
        for (Switchable device : devices) {
            device.turnOn();
            device.turnOff();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Switchable[] devices = {
            new Light(),
            new AC(),
            new Fan(),
            new SmartTV() // Newly added class works directly in the same array/loop
        };

        operateDevices(devices);
    }
}
