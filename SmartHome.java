public class SmartHome {

    static abstract class SmartDevice {

        String name;

        SmartDevice(String name) {
            this.name = name;
        }

        void info() {
            System.out.println("Device Name: " + name);
        }

        abstract void status();
    }

    interface Switchable {
        void turnOn();
        void turnOff();
    }

    static class SmartLight extends SmartDevice implements Switchable {

        SmartLight(String name) {
            super(name);
        }

        @Override
        void status() {
            System.out.println(name + " Light is ready.");
        }

        @Override
        public void turnOn() {
            System.out.println(name + " Light turned ON");
        }

        @Override
        public void turnOff() {
            System.out.println(name + " Light turned OFF");
        }
    }

    static class SmartFan extends SmartDevice implements Switchable {

        SmartFan(String name) {
            super(name);
        }

        @Override
        void status() {
            System.out.println(name + " Fan is ready.");
        }

        @Override
        public void turnOn() {
            System.out.println(name + " Fan turned ON");
        }

        @Override
        public void turnOff() {
            System.out.println(name + " Fan turned OFF");
        }
    }

    public static void main(String[] args) {

        SmartDevice[] devices = {
            new SmartLight("Bedroom"),
            new SmartFan("Hall")
        };

        for (SmartDevice device : devices) {

            device.info();
            device.status();

            Switchable s = (Switchable) device;

            s.turnOn();
            s.turnOff();

            System.out.println("------------------------");
        }
    }
}