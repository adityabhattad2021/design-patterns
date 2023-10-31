public class AssistantProfessor extends AttendenceApprover {

    @Override
    public void approve(Student s) {
        if (s.getAttendance() > 75) {
            System.out.println("Attendance approved by assistant professor!");
        } else {
            if (s.getCGPA() > 9.5 && s.getAttendance() > 70) {
                System.out.println("Attendance approved by assistant professor!");
                return;
            }
            nextApprover.approve(s);
        }
    }

}
