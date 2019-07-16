package CloneableTask;

public class Sponsor extends Person{

    String company;
    int hiredStudents;


    public Sponsor(String name, int age, String gender, String company){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        hiredStudents = 0;
    }

    public Sponsor(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
        company = "Google";
        hiredStudents = 0;
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company
                + " and hired " + hiredStudents + " students so far.");
    }

    @Override
    public void getGoal(){
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public void hire(){
        hiredStudents++;
    }
}