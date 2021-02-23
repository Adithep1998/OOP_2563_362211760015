package LAB8;

public class Teacher extends Person{
    private String university;

    //Constructor


    public Teacher() {

    }

    public Teacher(String university) {
        this.university = university;
    }
    //getter setter


    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I teaching at " +university);
    }
}
