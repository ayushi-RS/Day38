public int quickselect(int[] nums,int low, int hi, int k){
    int pivot=nums[hi];
    int pi=partition(nums,pivot,low,hi);
    if(k>pi){
        return quickselect(nums,pi+1,hi,k);
    }else if(k<pi){
        return quickselect(nums,low,pi-1,k);
    }else{
        return nums[pi];
    }
    
    
}

public int partition(int[] arr,int pivot,int low, int hi){
    int i=low,j=low;
    
    while(i<=hi){
        if(arr[i]<=pivot){
            swap(arr,i,j);
            i++;
            j++;
        }else{
            i++;
        }
    }
    
    return j-1;
}

public void swap(int[] nums,int i, int j){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}
}