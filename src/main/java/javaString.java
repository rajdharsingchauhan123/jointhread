public class javaString {
    public static void main(String[] args) {
//        String s ="welcome";
         String s1 ="welcome";
//        String s3 =s1.concat(s);
//        System.out.println(s3);
//        String s4 =s+s1;
//        System.out.println(s4);
//        String s5 =40+50+"raj"+53+43;
//        System.out.println(s5);
        StringBuilder s =new StringBuilder("hello");
      //  StringBuilder s1 =new StringBuilder("raj");
        StringBuilder s2 =s.append(s1);
        System.out.println(s2);

        String s4 =new String("welcome");
        String s5 =s4.toString();
        System.out.println(s5);




    }
}
