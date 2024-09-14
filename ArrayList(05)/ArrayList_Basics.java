import java.util.ArrayList;
public class ArrayList_Basics {
    public static void main(String[] args) {

        // ArrayList<Class datatype> list_name = new ArrayList<>();

        //Note :  Angular Bracket me class type ki cheej hi likhte hai..

        ArrayList<Integer> list = new ArrayList<>();  // An empty list has created..
        System.out.println(list);


        // // Adding Element to list
        // list.add(10);
        // list.add(20);
        // System.out.println(list);
        // list.add(30);
        // System.out.println(list);

        // // Size of list
        // System.out.println(list.size());

        // // Remove Element from list
        // System.out.println(list.remove(1));


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        System.out.println(list);

        // Getting Elements from list.
        System.out.println(list.get(5));

        // Updating value of any index..
        list.set(4,70);
        System.out.println(list); 
    }
}