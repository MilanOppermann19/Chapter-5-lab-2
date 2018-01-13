public class probDriver
//driver fot the probability main class
{
    public static void main(String[] args) {
        Probability p1 = new Probability(6, 10); //creates probability 1
        Probability p2 = new Probability(4, 10); //creates probability 2
        System.out.println(p1.probabilityAND(p2)); // prints both probability 1 and 2
    }
}