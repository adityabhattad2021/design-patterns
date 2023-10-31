public class Student {

    private double CGPA;
    private int attendance;
    
    private String medicalCertificate;
    
    public String getMedicalCertificate() {
        return medicalCertificate;
    }

    public void setMedicalCertificate(String medicalCertificate) {
        this.medicalCertificate = medicalCertificate;
    }
    
    public void setCGPA(double cGPA) {
        CGPA = cGPA;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public double getCGPA(){
        return CGPA;
    }

    public int getAttendance(){
        return attendance;
    }

}
