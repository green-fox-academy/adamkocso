package DataStructure;

public class Main {
    public static void main(String[] args) {

//  PostIt
        PostIt firstPost = new PostIt();
        firstPost.backgroundColor = "orange";
        firstPost.text = "Idea 1";
        firstPost.textColor = "blue";
        firstPost.print();

        PostIt secondPost = new PostIt();
        secondPost.backgroundColor = "pink";
        secondPost.text = "Awesome";
        secondPost.textColor = "black";
        secondPost.print();

        PostIt thirdPost = new PostIt();
        thirdPost.backgroundColor = "yellow";
        thirdPost.text = "Superb!";
        thirdPost.textColor = "green";
        thirdPost.print();

        //
        System.out.println();
        //

//  BlogPost
        BlogPost firstBlog = new BlogPost();
        firstBlog.authorName = "John Doe";
        firstBlog.title = "Lorem Ipsum";
        firstBlog.publicationDate = "2000.05.04.";
        firstBlog.text = "Lorem ipsum dolor sit amet.";
        firstBlog.printTitleAuthorDate();

        BlogPost secondBlog = new BlogPost();
        secondBlog.authorName = "Tim Urban";
        secondBlog.title = "Wait but why";
        secondBlog.publicationDate = "2010.10.10.";
        secondBlog.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        secondBlog.printTitleAuthorDate();

        BlogPost thirdBlog = new BlogPost();
        thirdBlog.authorName = "William Turton";
        thirdBlog.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        thirdBlog.publicationDate = "2017.03.28.";
        thirdBlog.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        thirdBlog.printTitleAuthorDate();

    }

}
