public abstract class AttendenceApprover{

    protected AttendenceApprover nextApprover;

    public void setNextApprover(AttendenceApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approve(Student s);

}