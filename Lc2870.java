import java.util.Arrays;

class Lc2870 {
    public static int minOperations(int[] nums) {
        Arrays.sort(nums);
        int[] ans=new int[nums.length];
        int c=-1,count=0,t=0;
        for(int i=0;i<nums.length;i++){
            if(c!=nums[i]){
                // System.out.println("countc"+count);
                if(count>0){
                    ans[t]=count;
                    t++;
                    count=0;
                }
                c=nums[i];
                count++;
                if(i==nums.length-1 && count==1){
return -1;
                }
                
                // System.out.println(" count= "+c+count);
            }
            // else if(c==nums[i]){
                else{
                count++;
                if(i==nums.length-1 && count>0){
                    ans[t]=count;
                    t++;
                }
            }
        
        }
        c=0;count=0;
        for(int i=0;ans[i]!=0;i++){
            System.out.println("index "+i+ans[i]);
            if(ans[i]==1) return -1;
            c=ans[i]%3;
            count+=(c==1||c==2)?((ans[i]/3)+1):ans[i]/3;
        }
        return count;
    }
        public static void main(String[] args){
int[] ar={1,14,1,1,1};
    System.out.println(minOperations(ar));        
        }
}