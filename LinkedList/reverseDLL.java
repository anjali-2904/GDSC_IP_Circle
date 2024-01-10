public static Node reverseDLL(Node  head)
{
    //Your code here
    
    Node currNode=head;
    Node preNode =null;
    Node nxtNode=null;
    
    while(currNode!=null){
        nxtNode=currNode.next;
        currNode.next=preNode;
        currNode.prev=nxtNode;
        preNode=currNode;
        currNode=nxtNode;
    }
    return preNode;
    
}
