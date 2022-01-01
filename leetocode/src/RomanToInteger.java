class RomanToInteger {
    public int romanToInt(String s) {
        
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        
        char[] charArray = s.toCharArray();
        int returnValue=0;
        
        for(int i=0; i<charArray.length;i++){
            
            if(i>0 && romanMap.get(charArray[i-1]) < romanMap.get(charArray[i])){
                returnValue=returnValue+romanMap.get(charArray[i])- (2*romanMap.get(charArray[i-1]));
            }else{
                returnValue=returnValue+romanMap.get(charArray[i]);
                
            }            
        }
        
        return returnValue;
    }
}
