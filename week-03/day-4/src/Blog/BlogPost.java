package Blog;


public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    BlogPost(String authorName, String title, String text, String publicationDate){
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

//    public void printTitleAuthorDate(){
//        System.out.print(title + " ");
//        System.out.print("titled by " + authorName + " ");
//        System.out.println("posted at " + publicationDate);
//        System.out.println('\t' + text);
//        System.out.println();
//    }
}
