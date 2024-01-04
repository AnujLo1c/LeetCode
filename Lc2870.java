import java.util.Arrays;

class Lc2870 {
    public static int minOperations(int[] nums) {
        Arrays.sort(nums);
        int[] ans=new int[nums.length];
        int c=-1,count=0,t=0;
        for(int i=0;i<nums.length;i++){
            if(c!=nums[i]){
            if(count>0){ans[t]=count;
                t++;
            count=0;
        }
            c=nums[i];
            count++;
            }
            else if(c==nums[i]){
                count++;
                if(i==nums.length-1 && count>0){
                    ans[t]=count;
                }
            }
            // System.out.print("c= "+c);
            // System.out.println(" count= "+c);
            // System.out.print(" count= "+c);
        }
        c=0;count=0;
        for(int i=0;ans[i]!=0;i++){
            if(ans[i]==1) return -1;
            c=ans[i]%3;
            count+=(c==1||c==2)?((ans[i]/3)+1):ans[i]/3;
        }
        return count;
    }
        public static void main(String[] args){
int[] ar={2,1,2,2,3,3};
    System.out.println(minOperations(ar));        
        }
}