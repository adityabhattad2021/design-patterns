public class App {
    public static void main(String[] args) throws Exception {
        
        // PhoneBuilder builder = new PhoneBuilder();
        // Phone phone = builder.setOs("Android")
        //     .setRam(2)
        //     .setProcessor("Snapdragon")
        //     .setScreenSize(5.5)
        //     .setBattery(3000)
        //     .getPhone(null);
        // System.out.println(phone);
        // Phone updatedPhone = builder.setRam(4)
        //     .getPhone(phone);
        // System.out.println(updatedPhone);
        // Phone updatedPhone2 = builder.setBattery(4000)
        //     .getPhone(phone);
        // System.out.println(updatedPhone2);
        // Phone updatedPhone3 = builder.setProcessor("MediaTek")
        //     .getPhone(phone);
        // System.out.println(updatedPhone3);
        // Phone updatedPhone4 = builder.setScreenSize(6.0)
        //     .getPhone(phone);
        // System.out.println(updatedPhone4);
        // Phone updatedPhone5 = builder.setOs("iOS")
        //     .getPhone(phone);
        // System.out.println(updatedPhone5);

        Director director = new Director();
        Phone phone = director.makePhone();
        System.out.println(phone);
        Phone updatedPhone = director.updateRam(phone, 4);
        System.out.println(updatedPhone);
        Phone updatedPhone2 = director.updateBattery(phone, 4000);
        System.out.println(updatedPhone2);
        Phone updatedPhone3 = director.updateProcessor(phone, "MediaTek");
        System.out.println(updatedPhone3);
        Phone updatedPhone4 = director.updateScreenSize(phone, 6.0);
        System.out.println(updatedPhone4);
        Phone updatedPhone5 = director.updateOs(phone, "iOS");
        System.out.println(updatedPhone5);

        Phone newPhone = director.makePhone();
        System.out.println(newPhone);
    }
}
