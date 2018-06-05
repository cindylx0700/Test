

class Solution {
public:
    int numJewelsInStones(string J, string S) {
        int output = 0;
        for(int i =0; i< J.size(); i++){
            char ii = J.at(i);
            for(int j =0; j< S.size(); j++){
                if(S[j] == ii){
                    output++;
                }
            }
        }
        return output;
    }
};
