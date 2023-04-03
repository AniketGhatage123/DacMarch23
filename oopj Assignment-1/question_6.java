class question_6
{
    public static void main(String args[])
    {
        boolean  a=false;       
        String str = new String();
        str = Boolean.toString(a);
        System.out.println(str);
        //boolean value into instance
        Boolean t= new Boolean(a);
        System.out.println(t);
        //String value into boolean
        String str1=new String("true");
        boolean b ;
         b=Boolean.parseBoolean(str1);
         System.out.println(b);
         //String value into boolean instance
         t= Boolean.valueOf(str1);
         System.out.println(b);

        
    }
}