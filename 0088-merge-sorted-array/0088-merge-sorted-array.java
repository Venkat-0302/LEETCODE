class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            nums1[0]=nums1[0];
        }
        else{
        m= nums1.length;
        n= nums2.length;
        int j=0;
      for(int i=0;i<m;i++){
        if(nums1[i]!=0){
            nums1[j]=nums1[i];
            j++;
        }
      } 
      for(int x:nums2){
        
        nums1[j]=x;
        j++;
      
      }
       Arrays.sort(nums1);
        }
    }
}