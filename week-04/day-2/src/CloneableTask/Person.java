package CloneableTask;

public class Person implements Cloneable{
    String name;
    int age;
    String gender;

    @Override
    protected Person clone() {
        Person clone = new Person();
        clone.name = this.name;
        clone.age = this.age;
        clone.gender = this.gender;

        return clone;
    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }

    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }


}
