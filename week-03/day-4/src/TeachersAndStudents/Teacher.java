package TeachersAndStudents;

public class Teacher {


    Teacher(){}

    public void answer() {
        System.out.println("The teacher is answering a question");
    }

    public void teach(Student student) {
        student.learn();
    }


}
