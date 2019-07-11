package TeachersAndStudents;

public class Student {
    String name;

    Student (String name){
        this.name = name;
    }

    public void learn(){
        System.out.println(name + " is learning something new");
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }


}
