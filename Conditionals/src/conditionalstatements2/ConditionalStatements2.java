package conditionalstatements2;

import java.util.*;

public class ConditionalStatements2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input now: ");
        String input = reader.next();

        if(input.equals("password"))  // == means equal to, != means not equal to
        {
            System.out.println("DAS RYT!");
        }

        else
        {
            System.out.println("NOPE BRUDUH!");
        }
    }
}
