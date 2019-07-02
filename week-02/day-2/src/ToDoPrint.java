public class ToDoPrint {

    public static void main(String[] args) {

        String todoText = " - Buy milk\n";

        todoText = "My ToDo:\n".concat(todoText);
        todoText = todoText.concat(" - Download Games\n");
        todoText = todoText.concat("\t - Diablo");


        System.out.println(todoText);

    }

}
