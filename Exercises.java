package javainproduction._1;

public class Exercises {
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        private static void exercise1() {
            System.out.println("\nExercise 1: ");
            double x = Math.random() * 100;
            String output = (x >= 50) ? "x is greater than or equal to 50" : "x is less than 50";
            System.out.println(output);
        }
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        public record Person(String name, int age, String address) {
            @Override
            public String toString() {
                return String.format("Name: %s, Age: %d, Address: %s", name, age, address);
            }
        }

        private static void exercise2() {
            System.out.println("\nExercise 2: ");
            Person person = new Person("John Doe", 30, "123 Main St");
            System.out.println(person);
        }
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
    }

}
