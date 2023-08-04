class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ultimo = m + n -1;
      
        //Merge de trás para frente.
        while (m>0 && n>0){
            if (nums1[m-1] > nums2[n-1]){
                nums1[ultimo] = nums1[m-1];
                m--;
            }else{
                nums1[ultimo] = nums2[n-1];
                n--;
            }
            ultimo--;
        }
        //Preencher nums1 com o que sobrar da array nums2.
        while (n>0){
            nums1[ultimo] = nums2[n-1];
            n--;
            ultimo--;
        }
    }
}
