class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        // Build frequency maps for s1 and the first window of s2
        for (int i = 0; i < s1.length(); i++) {
            map1[s1.charAt(i) - 'a']++;
            map2[s2.charAt(i) - 'a']++;
        }

        if (ismatched(map1, map2)) return true;

        // Sliding window
        for (int i = s1.length(); i < s2.length(); i++) {
            map2[s2.charAt(i) - 'a']++;                // add new char
            map2[s2.charAt(i - s1.length()) - 'a']--;  // remove old char

            if (ismatched(map1, map2)) return true;
        }

        return false;
    }

    private boolean ismatched(int[] map1, int[] map2) {
        for (int i = 0; i < 26; i++) {
            if (map1[i] != map2[i]) return false;
        }
        return true;
    }
}
