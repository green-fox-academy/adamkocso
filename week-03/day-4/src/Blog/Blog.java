package Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogpost;

   public Blog(){
       blogpost = new ArrayList<>();
   }

   public void add(BlogPost post){
       blogpost.add(post);
   }

   public void delete(int number){
       if (number < blogpost.size())
       blogpost.remove(number);
   }

   public void update(int number, BlogPost post){
       if(number < blogpost.size())
       blogpost.set(number, post);
   }



}
