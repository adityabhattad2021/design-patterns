public class PhoneBuilder {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public PhoneBuilder setOs(String os, Phone phone) {
        if (phone != null) {
            this.ram = phone.getRam();
            this.processor = phone.getProcessor();
            this.screenSize = phone.getScreenSize();
            this.battery = phone.getBattery();
        }
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram, Phone phone) {
        if (phone != null) {
            this.os = phone.getOs();
            this.processor = phone.getProcessor();
            this.screenSize = phone.getScreenSize();
            this.battery = phone.getBattery();
        }
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor, Phone phone) {
        if (phone != null) {
            this.os = phone.getOs();
            this.ram = phone.getRam();
            this.screenSize = phone.getScreenSize();
            this.battery = phone.getBattery();
        }
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize, Phone phone) {
        if (phone != null) {
            this.os = phone.getOs();
            this.ram = phone.getRam();
            this.processor = phone.getProcessor();
            this.battery = phone.getBattery();
        }
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery, Phone phone) {
        if (phone != null) {
            this.os = phone.getOs();
            this.ram = phone.getRam();
            this.processor = phone.getProcessor();
            this.screenSize = phone.getScreenSize();
        }
        this.battery = battery;
        return this;
    }

    public Phone getPhone(Phone phone) {
        if (phone == null) {
            return new Phone(os, ram, processor, screenSize, battery);
        }
        phone.setOs(os);
        phone.setRam(ram);
        phone.setProcessor(processor);
        phone.setScreenSize(screenSize);
        phone.setBattery(battery);
        return phone;
    }
}