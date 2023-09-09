public class Director {

    private PhoneBuilder builder;

    public Director() {
        this.builder = new PhoneBuilder();
    }

    public Phone makePhone() {
        Phone phone = this.builder.setOs("Android",null)
            .setRam(2,null)
            .setProcessor("Snapdragon",null)
            .setScreenSize(5.5,null)
            .setBattery(3000,null)
            .getPhone(null);
        return phone;
    }

    public Phone updateRam(Phone phone,int ram) {
        Phone updatedPhone = this.builder.setRam(ram,phone)
            .getPhone(phone);
        return updatedPhone;
    }

    public Phone updateBattery(Phone phone,int battery) {
        Phone updatedPhone = this.builder.setBattery(battery,phone)
            .getPhone(phone);
        return updatedPhone;
    }

    public Phone updateProcessor(Phone phone,String processor) {
        Phone updatedPhone = this.builder.setProcessor(processor,phone)
            .getPhone(phone);
        return updatedPhone;
    }

    public Phone updateScreenSize(Phone phone,double screenSize) {
        Phone updatedPhone = this.builder.setScreenSize(screenSize,phone)
            .getPhone(phone);
        return updatedPhone;
    }
   
    public Phone updateOs(Phone phone,String os) {
        Phone updatedPhone = this.builder.setOs(os,phone)
            .getPhone(phone);
        return updatedPhone;
    }

}
