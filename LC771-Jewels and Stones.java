class Solution {
    public int numJewelsInStones(String J, String S) {
         int output = 0;
        for(int i =0; i< J.length(); i++){
             char result = J.charAt(i);
            for(int j =0; j< S.length(); j++){
                if(S.charAt(j) == result){
                    output++;
                }
            }
        }
        return output;
    }

}
