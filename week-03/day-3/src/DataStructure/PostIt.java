package DataStructure;

public class PostIt {

    String backgroundColor;
    String text;
    String textColor;

    PostIt(){}

    public void print(){
        System.out.print(this.backgroundColor + " ");
        System.out.print(this.text + " ");
        System.out.print(this.textColor);
        System.out.println();
    }
}
