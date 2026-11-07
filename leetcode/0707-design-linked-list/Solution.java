class MyLinkedList {

    private static class Node {
        int val;
        Node next; 
        Node(int val) { this.val = val; }

    }

    private Node root;
    private int size;

    public MyLinkedList() {
        root = new Node(0);
        size = 0;
        
    }
    
    public int get(int index) {
        if (index >= size || index < 0) return -1;
        Node temp = root.next;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        Node prev = root;
        for (int i = 0; i < index; i++) prev = prev.next;
        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
        size++;

    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        Node prev = root;
        for (int i = 0; i < index; i++) prev = prev.next;
        prev.next = prev.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */