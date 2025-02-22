class Solution {
   
    public void rec(int[] arr,ArrayList<Integer> tempArray, List<List<Integer>>  sumsArray, int index){
        
        if(index==arr.length){
            List<Integer> sortedTemp = new ArrayList<>(tempArray); // Create a new list
            
            Collections.sort(sortedTemp);
            if(!sumsArray.contains(sortedTemp))
            {    
                sumsArray.add(sortedTemp);   
            }
            return;
        }
        //pick
        tempArray.add(arr[index]);
        rec(arr,tempArray,sumsArray,index+1);
        tempArray.remove(tempArray.size()-1);
        rec(arr,tempArray,sumsArray,index+1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> sumsArray=new ArrayList<List<Integer>>();
        ArrayList<Integer> tempArray=new ArrayList<>();
        rec(nums,tempArray,sumsArray,0);
        return sumsArray;
    }
}