public class SListIterator {
    private Node head;
    public void addData(int data) {
        Node newNode=new Node(data);
        if(this.head == null){
            head = newNode;
        }else {
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next=newNode;
        }
    }

    public void deleteNode(int index) {
        Node node = head;
        for(int i = 0; i< index -1; i++){
            node = node.next;
        }
        node.next=(node.next.next);
    }

    public void displayList() {
        if(head != null){
            Node currentNode = head;
            while(currentNode.next != null){
                System.out.print(currentNode.data+" -> ");
                currentNode = currentNode.next;
            }
            System.out.print(currentNode.data);
        }
    }
}
