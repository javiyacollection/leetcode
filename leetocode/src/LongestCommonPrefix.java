class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
       
        String firstString= strs[0];
        char[] chararray =firstString.toCharArray();
        for(int i=0; i<chararray.length; i++){
            for(int j=1; j<strs.length; j++){
                String str=strs[j];
                if(str.length()<i+1 || firstString.charAt(i)!=str.charAt(i)){
                   return firstString.substring(0,i);
                    
                }
            }
            
        }
        return firstString;
    }
    
}
