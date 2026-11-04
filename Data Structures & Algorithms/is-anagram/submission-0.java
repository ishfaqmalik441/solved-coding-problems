class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (char e: s.toCharArray()) {
            if (sMap.containsKey(e)) {
                int val = sMap.get(e);
                val += 1;
                sMap.put(e, val);
            } else {
                sMap.put(e, 1);
            }
        }

        for (char f: t.toCharArray()) {
            if (tMap.containsKey(f)) {
                int val = tMap.get(f);
                val += 1;
                tMap.put(f, val);
            } else {
                tMap.put(f, 1);
            }
        }

        return sMap.equals(tMap);

    }
}
