import java.util.Stack;

public class Game {

    public void takeWord(Stack text) {
        for (int j = text.size(); j > 0; j--) {
            System.out.print(text.pop());
        }
    }
}




