public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int original=x, reminder, palindrome=0;
        do{
            reminder=x%10;
            palindrome=  reminder + (palindrome*10);
            x=x/10;
        }while(x!=0);

        if(original==palindrome){
            return true;
        }else{
            return false;
        }
    }

}
