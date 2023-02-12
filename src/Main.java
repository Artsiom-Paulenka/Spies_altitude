import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        Stack<String> text = new Stack<>();
        Game game = new Game();


        text.push("e");
        text.push("в");
        text.push("и");
        text.push("р");
        text.push("п");
        game.takeWord(text);
        text.push("и");
        text.push("м");
        text.push(",");
        text.push(" ");
        text.push("т");
        game.takeWord(text);
        text.push("р");
        game.takeWord(text);









    }
}
