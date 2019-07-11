package Blog;

public class Main {

    public static void main(String[] args) {

        Blog myDailyLife = new Blog();


        myDailyLife.add(new BlogPost("Adam", "First day", "This is my first post", "2019.07.11."));
        myDailyLife.add(new BlogPost("Adam", "Second day", "Hello, hello, sziasztok", "2019.07.12."));
        myDailyLife.add(new BlogPost("Adam", "Third day", "Toas es tomlossajt", "2019.07.13."));
        myDailyLife.add(new BlogPost("Adam", "Fourth day", "Remelem tudtam segiteni", "2019.07.14."));

        myDailyLife.delete(3);

        myDailyLife.update(0,new BlogPost("Adam", "Welcome", "Welcome in my blog", "2019.07.10."));

    }

}
