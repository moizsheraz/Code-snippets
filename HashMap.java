  Map <Character,Integer>  map = new HashMap<>();
          for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
