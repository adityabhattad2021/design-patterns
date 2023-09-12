public class App {
    public static void main(String[] args) throws Exception {
        Computer.Builder builder = new Computer.Builder("My Computer", "10.10.10.4", "00:00:00:00:00:00");
        builder.os("Windows 10").osArchitecture("monolithic").osVersion("v10.0.5").osManufacturer("Microsoft");
        Computer computer = builder.build();

        System.out.println(computer);

        Computer computer2 = new Computer.Builder("My Computer", "10.10.10.5", "00:00:00:00:00:12")
                .os("Windows 10")
                .osArchitecture("microkernel")
                .osVersion("v11.2.5")
                .osManufacturer("Microsoft")
                .build();

        System.out.println(computer2);

    }
}
