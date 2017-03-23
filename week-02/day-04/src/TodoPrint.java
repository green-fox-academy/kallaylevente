/**
 * Created by Levente on 2017. 03. 23..
 */
public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        String todo = "My todo:\n";
        todoText = todo.concat(todoText);
        todoText = todoText.concat(" - Download games\n");
        todoText = todoText.concat("   - Diablo");
        System.out.println(todoText);
    }
}
