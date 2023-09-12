public class Computer {

    // Attributes
    private String name;
    private String ip;
    private String mac;
    private String os;
    private String osVersion;
    private String osArchitecture;
    private String osManufacturer;

    public static class Builder {

        private String name;
        private String ip;
        private String mac;
        private String os;
        private String osVersion;
        private String osArchitecture;
        private String osManufacturer;

        public Builder(String name, String ip, String mac) {
            this.name = name;
            this.ip = ip;
            this.mac = mac;
        }

        public Builder os(String os) {
            this.os = os;
            return this;
        }

        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        public Builder osArchitecture(String osArchitecture) {
            this.osArchitecture = osArchitecture;
            return this;
        }

        public Builder osManufacturer(String osManufacturer) {
            this.osManufacturer = osManufacturer;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

    private Computer(Builder builder) {
        this.name = builder.name;
        this.ip = builder.ip;
        this.mac = builder.mac;
        this.os = builder.os;
        this.osVersion = builder.osVersion;
        this.osArchitecture = builder.osArchitecture;
        this.osManufacturer = builder.osManufacturer;
    }

    public String toString() {
        return "Computer: " + this.name + "\n" +
                "IP: " + this.ip + "\n" +
                "MAC: " + this.mac + "\n" +
                "OS: " + this.os + "\n" +
                "OS Version: " + this.osVersion + "\n" +
                "OS Architecture: " + this.osArchitecture + "\n" +
                "OS Manufacturer: " + this.osManufacturer + "\n";
    }

}