class solve {
    public boolean graphColoring(boolean graph[][], int m, int v) {
        
        
        int color[] = new int[v];
        Arrays.fill(color,-1);
        
        boolean ans = mColor(graph,m,v,color,0);//0 is starting vartice
        return ans;
    }
    public static boolean mColor(boolean graph[][],int m,int v,int color[],int currentV){
        if(currentV == v){
            return true;
        }
        for(int i=1;i<=m;i++){
            if(isPossibleToColor(graph,v,color,currentV,i)){
                color[currentV] = i;
                if(mColor(graph,m,v,color,currentV+1)){
                    return true;
                }
                color[currentV] = -1;
            }
        }
        return false;
 
    }
    //check any adjacent contain same color. if contain same color return false else return true.
    public static boolean isPossibleToColor(boolean graph[][],int v,int color[],int currentV,int i){
        for(int j=0;j<v;j++){
            if(graph[currentV][j]==true && color[j] == i){
                return false;
            }
        }
        return true;
    }
}
