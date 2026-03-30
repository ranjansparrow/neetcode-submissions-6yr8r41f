class Solution {
    public boolean isPalindrome(String s) {
        String r = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        char[] val = r.toCharArray();
        
        int j = val.length;
        for(int i = 0 ;i< j;i++){
            System.out.println(i  +" " + val[i] + " " +j + " " +  val[j-1]);

            if(val[i]!= val[j-1]){
                return false;
            }
            j--;
        }
        return true;
    }
}
