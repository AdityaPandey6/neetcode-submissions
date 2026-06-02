class MinStack {

ArrayList<Integer> arr;
int top ;
int minElem; 
int minIndex;

    public MinStack() {
        top = -1;
        minIndex = -1;
        arr = new ArrayList<>();
    }
    
    public void push(int val) {
        top++;
        arr.add(top , val);
    }
    
    public void pop() {
        arr.remove(top);
        top--;
    }
    
    public int top() {
        return arr.get(top);
    }
    
    public int getMin() {
        minElem = Integer.MAX_VALUE;
        for(Integer i : arr){
            minElem = Math.min(minElem , i);
        }
        return minElem;
    }
}
