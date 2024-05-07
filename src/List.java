public class List {

    private Node head;


    public void add(Double value){
        Node node = new Node();
        node.setValue(value);
        node.setNext(head);
        head = node;
    }


    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");

        Node node = head;

        while (node != null){
            stringBuffer.append(node.getValue() + " ");
            node = node.getNext();
        }

        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
