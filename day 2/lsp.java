class Main { 
  
    static boolean isPerfect(int N) 
    { 
        if ((Math.sqrt(N) - Math.floor(Math.sqrt(N))) != 0) 
            return false; 
        return true; 
    } 
    static void getClosestPerfectSquare(int N) 
    { 
        if (isPerfect(N)) { 
            System.out.println(N + " "
                               + "0"); 
            return; 
        } 
        int aboveN = -1, belowN = -1; 
        int n1; 
        n1 = N + 1; 
        while (true) { 
            if (isPerfect(n1)) { 
                aboveN = n1; 
                break; 
            } 
            else
                n1++; 
        }
        n1 = N - 1; 
        while (true) { 
            if (isPerfect(n1)) { 
                belowN = n1; 
                break; 
            } 
            else
                n1--; 
        } 
  
        // Variables to store the differences 
        int diff1 = aboveN - N; 
        int diff2 = N - belowN; 
  
        if (diff1 > diff2) 
            System.out.println(belowN + " " + diff2); 
        else
            System.out.println(aboveN + " " + diff1); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 66; 
  
        getClosestPerfectSquare(N); 
    } 
} 
