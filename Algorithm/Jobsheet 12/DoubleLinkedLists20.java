public class DoubleLinkedLists20 {
    int size;
    Node20 head;

    DoubleLinkedLists20() {
        size = 0;
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        head = null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Data kosong.");
        } else {
            Node20 tmp = head;
            while (tmp != null) {
                System.out.println("ID : " + tmp.data);
                tmp = tmp.next;
            }
        }
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node20(null, item, jarak, null);
        } else {
            Node20 newNode = new Node20(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks diluar batas");
        }
        Node20 tmp = head;
        for(int i =0;i<index;i++){
            tmp=tmp.next;
        }
        return tmp.jarak;
    }

    public void add(int index, int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            System.out.println("Nilai indeks diluar batas");
            return;
        } else {
            Node20 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            Node20 newNode = new Node20(current.prev, item, jarak, current.next);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }
    public void remove(int index) {
        Node20 current = head;
        while(current!=null){
            if(current.data==index){
                if(current.prev!=null){
                    current.prev.next=current.next;
                }else{
                    head=current.next;
                }
                if(current.next!=null){
                    current.next.prev=current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    public int get(int index) throws Exception{
        if(isEmpty() || index>=size){
            throw new Exception("Index diluar batas");
        }
        Node20 tmp = head;
        for(int i=0;i<index;i++){
            tmp=tmp.next;
        }
        return tmp.data;
    }
}