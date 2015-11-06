package Ds_LinkedList;
import java.util.*;
import java.util.Stack;

/**
 * Created by tcheng on 2015/11/4.
 */
public class Ds_LinkedList {

    public static void run(){
        int b = 52;
        Node a = new Node(b, "Apple", null);
        System.out.println(a);

        List <Node> apple = new LinkedList<Node>();

        Node tmp = new Node(123, "apl", null);

        for (int k = 0; k < 10; k++){
            int ll = k*55;
            Node ne = new Node(ll, Integer.toString(ll) , tmp);
            apple.add(ne);
            apple.get(k+1);
            apple.add(k, ne);
            tmp = ne;
        }


        System.out.println(apple.get(3).next.toString());
    }
}
