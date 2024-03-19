package MyJavaWorkspace;

public class Array {

     static void arrayStringDeclartion()
    {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        System.out.println(a[0]);
        System.out.println(a[1]);

        String[] str = new String[10];
        str[0] = "Double Test";
        str[1] = "First Test";
        str[2] = "Second Test";
        System.out.println(str.length);
        System.out.println(str[0]);
        System.out.println(str[1]);
    }

    static void arrayDeclartion()
    {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    public static void main(String[] args)
    {
        System.out.println("Hello Array World");
        arrayDeclartion();
        arrayStringDeclartion();

    }

}