public class GenericsClass <T> {
    // Instance variables;
    private T variable;

    /**
     * Get the content of the array and prints them on the console.
     */
    public void get() {
        System.out.println(variable);
    }

    /**
     * This is a setter for the private instance variable.
     * @param variable the private variable to be set.
     */
    public void set(T variable) {
        this.variable = variable;
    }


    public GenericsClass() {

    }
}
