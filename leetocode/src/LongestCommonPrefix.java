class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        
        String firstString= strs[0];
        if(firstString==""){
            return "";
        }

        String commonString="";
        boolean isExist= true;
        char[] chararray =firstString.toCharArray();

        for(int i=0; i<chararray.length; i++){
            for(int j=1; j<strs.length; j++){
                String str=strs[j];
                if(str.length()<i+1){
                    isExist=false;
                    break;
                }
                if(!(firstString.charAt(i)==str.charAt(i))){
                    isExist=false;
                    break;
                }
            }
            if(isExist){
                commonString=commonString+chararray[i];
            }else{
                break;
            }
        }
        return commonString;
    }
    
}
