public class App {
    public static void main(String[] args) throws Exception {
        AttendenceApprover dean = new DeanOfAcademic();
        AttendenceApprover hod = new HeadOfDepeartment();
        AttendenceApprover prof = new AssistantProfessor();
        Student s = new Student();

        prof.setNextApprover(hod);
        hod.setNextApprover(dean);
        dean.setNextApprover(null);
        s.setAttendance(41);
        s.setCGPA(9.5);
        s.setMedicalCertificate("Sach me bemaar tha sir!!");

        prof.approve(s);
    }
}
