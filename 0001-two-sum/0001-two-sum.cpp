#include <unordered_map>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> map;
        std::vector<int> indices;

        for (int i = 0; i < nums.size(); i++) {
            map.insert(std::make_pair(nums[i], i));
        }

        for (int i = 0; i < nums.size(); i++) {
            int missing = target - nums[i];

            auto item = map.find(missing);
          
            if (item != map.end() && i != item->second){
                indices.push_back(i);
                indices.push_back(item->second);
                return indices;
            }
        }
        return indices;
    }
};