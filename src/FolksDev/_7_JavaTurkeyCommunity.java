package FolksDev;

public class _7_JavaTurkeyCommunity {
    public static void main(String[] args) {
        int[] nums = {8,7,11,2,4};

        int[] result = findTwoSum(nums, 9);

        if(result.length == 2){
            System.out.println(result[0] + "" + result[1]);
        }else{
            System.out.println("Sonuc bulunamadı");
        }
    }

    private static int[] findTwoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
