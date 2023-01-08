package pl.kurs.task3;

public class FibonacciServices {
    private static final int firstFibonacciElement = 0;
    private static final int secondFibonacciElement = 1;
    public static int getFibonacciIndex(int number) {
        int index = 0;
        int temporaryElement;

        if (number == firstFibonacciElement)
            return 0;
        else if (number == secondFibonacciElement) {
            return 1;
        } else {
            int previousFibonacciElement = firstFibonacciElement;
            int currentFibonacciElement = secondFibonacciElement;
            do {
                index++;
                temporaryElement = currentFibonacciElement;
                currentFibonacciElement += previousFibonacciElement;
                previousFibonacciElement = temporaryElement;
                if (number == currentFibonacciElement)
                    return index;
            } while (number > currentFibonacciElement);
        }
        return -1;
    }
    public static int getFibonacciIndex2(int number) {

        return 0;
    }
}
