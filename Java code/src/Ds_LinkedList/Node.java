package Ds_LinkedList;

/**
 * Created by tcheng on 2015/11/4.
 */
public class Node {
    public int index;
    public Node next;
    public String name;
    public Node(int index,String name, Node next){
        this.index = index;
        this.next = next;
        this.name = name;
    }

    public String toString(){
        return name;
    }

}
