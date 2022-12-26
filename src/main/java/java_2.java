public class java_2 {
    public static void main(String[] args) {
        var q =4.0f;
        System.out.println(q);
        var b ="12";
        b+="3";
        // b.reverse();
        System.out.println(b.toString());
        var line =new StringBuilder("-");
        var anotherline=line.append("-");
        System.out.println(line);
        System.out.println(anotherline);
        System.out.println(line ==anotherline);
        System.out.println("");
        System.out.println(line.length());
        var line1 =new String("-");
        var anotherline1= line1.concat("-");

        System.out.println(anotherline1);
        System.out.println(line1);
        System.out.println(line1.length());
    }
}
