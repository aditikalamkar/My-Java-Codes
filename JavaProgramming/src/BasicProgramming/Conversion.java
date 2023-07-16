package BasicProgramming;

public class Conversion {

	public static void main(String args[])
    {
        int a = 257;
        byte b = (byte) a;
        System.out.println(b);
        // byte range is -128 to 127. total 256
        //In explicite type conversion range get out of the scope it will perform the module (%) Operation.
        //So here , 256 % 257 = 1 . Output is 1.

        float f = 5.6f;
        int i = (int) f;
        System.out.println(i);
    }
}
