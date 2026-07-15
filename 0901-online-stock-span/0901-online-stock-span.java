class StockSpanner {
    class pair{
        int price,idx;
    }
    Stack<pair> st=new Stack<>();
    int time=0;

    public StockSpanner() {
        pair base=new pair();
        base.price=1000000;
        base.idx=-1;
        st.push(base);
        
    }
    
    public int next(int price) {
        pair p=new pair();
        p.price=price;
        p.idx=time;
        time++;
        while(st.peek().price<=p.price)
        {
            st.pop();
           

        }
        int ans=p.idx-st.peek().idx;
        st.push(p);
        return ans;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */