public class Compare3
{
    public static Comparable largest(Comparable y1, Comparable y2) {
        if(y1.compareTo(y2) > 0) {
            return y1;
        }
        else {
            return y2;
        }
    }
}