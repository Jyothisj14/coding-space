class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev))
            return true;
        else
            return false;
        
    }
}


or



two - pointers method

  class Solution {
    public boolean isPalindrome(int x) {
        boolean output=false;
        String s = String.valueOf(x);
        int n = s.length();
        char[] arr = new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.charAt(i);
        }
        int left=0; int right =n-1;
        while(left<right)
        {
            if(arr[left]!=arr[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
