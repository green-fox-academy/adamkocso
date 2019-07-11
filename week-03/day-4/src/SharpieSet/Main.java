package SharpieSet;

public class Main {

    public static void main(String[] args) {

        SharpieSet myCase = new SharpieSet();

        myCase.add(new Sharpie("blue", 10.3f, 100));
        myCase.add(new Sharpie("red", 8.1f, 100));
        myCase.add(new Sharpie("yellow", 5, 0));
        myCase.add(new Sharpie("green", 5, 0));
        myCase.add(new Sharpie("purple", 5, 0));
        myCase.add(new Sharpie("pink", 5, 0));



        System.out.println(myCase.usableSharpie());

        System.out.println(myCase.removeTrash());




    }

}
