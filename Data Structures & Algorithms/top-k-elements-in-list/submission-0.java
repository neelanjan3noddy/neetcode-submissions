class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (int num : map.keySet()) {
            int frequency = map.get(num);

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        for (int frequency = buckets.length - 1; frequency >= 0; frequency--) {
            if (buckets[frequency] != null) {
                for (int num : buckets[frequency]) {
                    result[index++] = num;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}