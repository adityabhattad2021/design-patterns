public class App {
    public static void main(String[] args) throws Exception {
        
    //    Testing the Builder Pattern
        PhoneBuilder builder = new PhoneBuilder();
        Phone phone = builder.setOs("Android",null)
            .setRam(2,null)
            .setProcessor("Snapdragon",null)
            .setScreenSize(5.5,null)
            .setBattery(3000,null)
            .getPhone(null);
        System.out.println(phone);

        // Director director = new Director();
        // Phone phone = director.makePhone();
        // System.out.println(phone);
        // Phone updatedPhone = director.updateRam(phone, 4);
        // System.out.println(updatedPhone);
        // Phone updatedPhone2 = director.updateBattery(phone, 4000);
        // System.out.println(updatedPhone2);
        // Phone updatedPhone3 = director.updateProcessor(phone, "MediaTek");
        // System.out.println(updatedPhone3);
        // Phone updatedPhone4 = director.updateScreenSize(phone, 6.0);
        // System.out.println(updatedPhone4);
        // Phone updatedPhone5 = director.updateOs(phone, "iOS");
        // System.out.println(updatedPhone5);

        // Phone newPhone = director.makePhone();
        // System.out.println(newPhone);
    }
}
