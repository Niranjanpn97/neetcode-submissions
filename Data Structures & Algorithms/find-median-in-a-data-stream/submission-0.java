class MedianFinder {
    ArrayList<Integer> data;

    public MedianFinder() {

        data= new ArrayList<>();
        
    }
    
    public void addNum(int num) {
        data.add(num);
        
    }
    
    public double findMedian() {
        Collections.sort(data);
        if(data.size()>1)
       {
        if(data.size()%2==0)
        {
            int n = data.size();
            double ans = (data.get(n/2)+data.get(n/2-1))/2.0;
            return ans;
        }else
        {
            return data.get(data.size()/2);
        }
       }else
       {
        return data.get(0);
       }

    }
}
