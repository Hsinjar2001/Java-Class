   /*
         * task
         * make an instance variable firstName
         * make a new object and print the firstNmae
         * Calculate and print the following
         * double avg 13/2
         * float pct = 411/400
         */
public class VariablesTask {
    String firstName = "Rajnish";

    public static void main(String[] args) {
        VariablesTask obj1 = new VariablesTask();
        System.out.println("firstName: " + obj1.firstName);

        double avg = 13 / 2d;
        float pct = 111 / 100f;
        System.out.println("avg: " + avg);
        System.out.println("pct: " + pct);
    } 
}
