  Set<Integer> intersection = new HashSet<>();

// insert
 intersection.add(nums1[p1]);

// traverse
   for (int x: intersection) {
            result[curr++] = x;
        }
