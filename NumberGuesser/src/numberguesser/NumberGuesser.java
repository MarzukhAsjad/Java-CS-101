package numberguesser;

public class NumberGuesser {
    long startTime = System.nanoTime();
    public static void main(String [] args) {
        Guesser(47);
    }



    public static void Guesser (int n) {
        for(int i = 0; i >= 0; i++) {
            int x = new java.util. Random().nextInt(100);

            if (x == n) {
                System.out.println(x + " DONEE")
                ;break;
            }

            else {
                System.out.println(x);
            }

        }


    }
    long endTime   = System.nanoTime();
    long totalTime = endTime - startTime;

    System.out.println(totalTime);
}