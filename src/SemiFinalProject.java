//Llosa, Eduardo Dominico F
import java.util.*;

public class SemiFinalProject {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Stack<String> STACK = new Stack();
        int x = 1;
        boolean isComplete = false;
        while (!isComplete){

            System.out.println("Enter 7 lines of code:");
            while(x <= 7 ) {
                STACK.add(s.nextLine());
                x++;
            }
            x = 1;
            if (STACK.get(1).equals("</html>")  &&
                    STACK.get(0).equals("<!DOCTYPE html>") && STACK.get(2).equals("<body>")
                    && STACK.get(3).contains("<h1>") && STACK.get(3).contains("</h1>")
                    && STACK.get(4).contains("<p>") && STACK.get(4).contains("</p>")
                    &&STACK.get(5).equals("</body>")
                    && STACK.get(6).equals("</html>"))
            {
                System.out.println("Your HTML code is valid and complete!!".toUpperCase(Locale.ROOT));
                System.out.println("--------------------------------");
                int j =1;
                for (int i = 0; i <= 6; i++) {
                    System.out.println(j + "\t"+ STACK.get(i)  );
                    j++;
                    isComplete = true;
                }
            }else{
                System.out.println("YOUR CODE IS INVALID OR INCOMPLETE!");
                int j = 1;

                for (int i = 0; i <= 6; i++) {
                    System.out.println(j + "\t" + STACK.get(i));
                    j++;
                }
                System.out.println("--------------------------------");
                for (int n = 0; n < 7 ; n++) {
                    STACK.pop();
                }
            }
        }
    }
}
//<!DOCTYPE html>
//<html>
//<body>
//<h1>My First Heading</h1>
//<p>My first paragraph.</p>
//</body>
//</html>
