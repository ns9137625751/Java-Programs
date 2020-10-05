class Test 
{  
    static int factorial(int n) 
    { 
        if (n == 0) 
          return 1; 
          
        return n*factorial(n-1); 
    } 
      
    public static void main(String[] args)  
    { 
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt(); 
        System.out.println("Factorial of "+ num + " is " + factorial(5)); 
    } 
} 
