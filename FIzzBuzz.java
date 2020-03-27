class Solution {
    public List<String> fizzBuzz(int n) {
        //returns an array list of strings consisting  of Fizz,buzz,fizzbuzz and number 
        ArrayList <String> result = new ArrayList<>();  
        if(n==1){
             result.add(1+"");
            return result;
        }
      
        for(int i =1; i<=n; i++){
            if(i%5 ==0 && i%3 ==0){
               result.add("FizzBuzz");
            }
            else if(i%3 ==0){
             result.add("Fizz"); 
            }
             else  if(i%5 ==0){
                result.add("Buzz"); 
            }
            
            else 
                result.add(i+""); 
          
        }
        return result;
    }
}
