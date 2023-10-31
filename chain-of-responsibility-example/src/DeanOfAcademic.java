public class DeanOfAcademic extends AttendenceApprover {

    @Override
    public void approve(Student s) {
        if (s.getAttendance() > 50) {
            System.out.println("Attendance approved by dean of academic!");
        } else {
            if(s.getCGPA()>9 && s.getAttendance()>40){
                System.out.println("Attendance approved by dean of academic!");
                return;
            }
            System.out.println("Back!!");
        }
    }

}
