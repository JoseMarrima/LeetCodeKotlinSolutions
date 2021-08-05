fun threeSum(nums: IntArray): List<List<Int>> {
        var result: HashSet<List<Int>> = HashSet()
        nums.sort()
        for (index in nums.indices) {
            twoSum(nums, index, result)
        }
        
        return result.toList()
    }
    
    fun twoSum(nums: IntArray, index: Int, result: HashSet<List<Int>>) {
        var target = -nums[index]
        var map: HashMap<Int, Int> = HashMap<Int, Int>()
        var rest = 0
        for (i in index+1 until nums.size) {
            rest = target - nums[i]
            if (map.containsKey(rest)) {
                var list = intArrayOf(nums[i], rest, nums[index]).toList()
                if(list !in result) {
                    result.add(list)
                }
            }
            map[nums[i]] = i
        }
 }
