
// Iterate over HashMap in java
for (int num : map1.keySet()) {
            if (!map2.containsKey(num)) {
                diff1.add(num);
            }
        }
        
        for (int num : map2.keySet()) {
            if (!map1.containsKey(num)) {
                diff2.add(num);
            }
        }
