package TeachersAndStudents;

public class Main {

    public static void main(String[] args) {

        Student bela = new Student("Bela");

        Teacher teacher = new Teacher();

        bela.question(teacher);
        teacher.teach(bela);
    }
}
