class Solution {
    public boolean isAnagram(String s, String t) {
        int s1 = s.length();
        int s2 = t.length();

        if(s1!=s2){
            return false;
        }
        int arr[] = new int[26];

        for(int i = 0; i<s1;i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int j=0; j<s2; j++){
            arr[t.charAt(j) -'a']--;
            if(arr[t.charAt(j) -'a'] < 0){
                return false;
            }
        }
        return true;
    }
}