class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        while( s.contains("()") || s.contains("{}") || s.contains("[]") ){
            if(s.contains("()")){
                s=s.replace("()","");
            }
            if(s.contains("{}")){
                s=s.replace("{}","");
            }
            if(s.contains("[]")){
                s=s.replace("[]","");
            }
        }
        
        if(s.trim().length()==0){
            return true;
        }else{
            return false;
        }
        
    }
}
