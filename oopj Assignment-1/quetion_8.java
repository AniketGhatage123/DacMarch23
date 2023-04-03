class quetion_8
{
    public static void main(String args [])
    {  //
        byte a=8;
        String str=new String();
        str=Byte.toString(a);
        System.out.println(" String ="+str);
        //byte value into byte instance
        Byte b=new Byte(a);
        System.out.println(b);
        //string instance to byte instance
        str="111";
         b=Byte.valueOf(str);
         System.out.println(b);

    }
}