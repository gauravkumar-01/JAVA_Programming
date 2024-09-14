public class String_Demo3 {
    public static void main(String[] args) {
        String str = "abcdef";

        System.out.println(str.charAt(3));
        System.out.println(str.substring(2,5));
        System.out.println(str.substring(0));
        String st = "dcba";
        System.out.println(str.concat(st));
        System.out.println(str);

        System.out.println(str.compareTo(st));

        System.out.println(st + 10 + 20);
        System.out.println(st+(10+20));
        System.out.println(st+(10+20)+50);
    }
}
