public class CompareDriver
{
    public static void main(String[] args) {
    String st1 = new String("hi");
    String st2 = new String ("bye");
    
    Integer z1 = new Integer(1);
    Integer z2 = new Integer(2);
    
    System.out.println(Compare1.largest(st1, st2));
    System.out.println(Compare3.largest(st1, st2));
    System.out.println(Compare3.largest(z1, z2));
    System.out.println(Compare3.largest(st1,z2));
    }
}