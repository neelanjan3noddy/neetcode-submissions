class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(m<n){return false;}

        int freq1[] = new int[26];
      

        for(int i=0;i<n;i++){
            freq1[s1.charAt(i) - 'a']++;
        }
        for(int i=0;i<=m-n;i++){
         int freq2[] = new int[26]; 
            for(int j=0;j<n;j++){
              freq2[s2.charAt(i+j) - 'a']++;  
            }
            if(isMatched(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
    private boolean isMatched(int freq1[],int freq2[]){
        for(int i=0;i<26;i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
            return true;
        }
}
