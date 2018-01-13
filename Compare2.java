public class Compare2
{
    public static Integer largest(Integer z1, Integer z2) {
        if(z1.compareTo(z2) > 0) {
            return z1;
        }
        else {
            return z2;
        }
    }
}