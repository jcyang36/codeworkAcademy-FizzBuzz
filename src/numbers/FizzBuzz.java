package numbers;

public class FizzBuzz
{
    public static void main (String[] args)
    {
    int count=1;
    int nextFizz=3;
    int nextBuzz=5;
    int nextFizzBuzz=0;
    
    
    while(count<=100){
        if (count==nextFizz) {
            if (count==nextBuzz){
                System.out.println("Fizzbuzz!!!");
                nextFizz=count+3;
                nextBuzz=count+5;
                }
            
            
            else{
                System.out.println("Fizz");
                nextFizz=count+3;
                }
        


            
            
            }
        else if (count==nextBuzz && count!=nextFizz){
            System.out.println("Buzz");
            nextBuzz=count+5;
        }
        else {System.out.println(count);
        };
        
    
    count=count+1;
    }
    
    System.out.println("No more numbers.");

    }




}