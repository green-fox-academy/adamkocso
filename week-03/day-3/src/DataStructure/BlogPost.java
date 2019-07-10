package DataStructure;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    BlogPost(){}

    public void printTitleAuthorDate(){
        System.out.print(title + " ");
        System.out.print("titled by " + authorName + " ");
        System.out.println("posted at " + publicationDate);
        System.out.println('\t' + text);
        System.out.println();
    }
}
