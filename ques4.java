class HelloWorld {
    
    public static removeloop(Node head){
        HashSet<Node> hs = new HashSet<>();
        if (head.next==null) return;
            Node curr = head;
            Node prev = null;
        while (curr.next.next != null){
            if (hs.contains(curr)){
                prev.next=null;
                break;
            }
            hs.add(curr);
            prev = curr;
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        removeloop(head);
    }
}
