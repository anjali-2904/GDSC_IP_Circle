class DataStream {

    Queue<Integer> q;
    int value,k;

    public DataStream(int val, int k) {
        q=new LinkedList<>();
        this.value=val;
        this.k=k;  
    }
    
    public boolean consec(int num) {
        return check(num);   
    }
     boolean check(int n)
    {
        if(n==value)
            q.add(n);
        else
            q=new LinkedList<>(); 
             
        return q.size()>=k;
        
    }
}
