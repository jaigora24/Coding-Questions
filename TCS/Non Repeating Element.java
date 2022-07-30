class Check{
    
    public int firstNonRepeating(int a[], int n) 
    { 
        boolean visit[] = new boolean[n];
        for(int i=0; i<n; i++){
            int j;
            for(j=0; j<n; j++){
                if(i!=j && a[i]==a[j]){
                    break;
                }
            }
            if(j==n){
                return a[i];
            }
        }
        return -1;
    }  
    
}

