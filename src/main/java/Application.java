import java.util.ArrayList;

/**
 * A simple introduction to Java Generics.
 *
 * @author Joshua Thotsana Mabotsa.
 */
public class Application{

    public static void main(String[] args) {

        GenericsClass<String> stringInstance;
        GenericsClass<Integer> integerInstance;

        Integer[] intArray = {12,324,6,7900};

        String[] stringArray = {"I","Love","To","Code"};

        printArrayContent(intArray);
        System.out.println();

        printArrayContent(stringArray);
        System.out.println();


        stringInstance = new GenericsClass<>();
        stringInstance.set("Test");
        stringInstance.get(); // print out Test

         integerInstance = new GenericsClass<>();
        integerInstance.set(1000);

        integerInstance.get(); // print out 1000
    }

    /**
     * A function that accepts one parameter and it is able to accept an integer array or string array and prints out
     * the contents of that array.
     * @param array     the array argument.
     * @param <T>       the Generic object parameter.
     */
    public static  <T> void printArrayContent(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}
