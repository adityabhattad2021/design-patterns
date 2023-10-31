public class HeadOfDepeartment extends AttendenceApprover {

    @Override
    public void approve(Student s) {
        if (s.getAttendance() > 60) {
            System.out.println("Attendance approved by Head of Department");
        } else {
            if(s.getMedicalCertificate().contains("Sach me bemaar tha sir!") && s.getAttendance()>40){
                nextApprover.approve(s);
            }else{
                System.out.println("Detained!! (from HOD Office)");
            }
        }
    }

}
