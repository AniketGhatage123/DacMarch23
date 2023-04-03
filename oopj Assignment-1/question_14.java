class question_14
{
    public static void main(String args[])
    {
        short a=10;
        Short s1=new Short(a);
        System.out.println("short instance "+s1);
        byte b=s1.byteValue();
        System.out.println("short instance to byte= "+b);
        short c=s1.shortValue();
        System.out.println("short instance to short= "+c);
        int d=s1.intValue();
        System.out.println("short instance to int= "+d);
        long f=s1.longValue();
        System.out.println("short instance to long= "+f);
        float m=s1.floatValue();
        System.out.println("short instance to float= "+m);
        double n= s1.doubleValue();
        System.out.println("short instance to double= "+n);
    }
}