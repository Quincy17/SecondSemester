public class Node20 {
    int data, jarak;
    Node20 prev, next;
    
    Node20(Node20 prev, int data, int jarak, Node20 next){
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}