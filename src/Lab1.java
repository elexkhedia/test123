// we want to do a sum of numbers between 1 and 10 (inclusive) - out=55
public class Lab1 {
     // define variable called sum and init with value 0, why int ?

    public static void main(String[] args) {
        int sum=0;
        //section 1: define your loop variable
        //section 2: condition to run loop
        //section 3: iterator add, subtract

        for ( int a=1 ; a<=10 ; a++) {
            // factorial = 10! (0--1+2+3+4+5+6...+10)
            sum=sum+a;

            /*
            sum = 0 a=1 || inloop sum=sum+a --> sum=0+1 --> sum=1
            sum = 1 a=2 || inloop sum=sum+a --> sum=1+2 --> sum=3
            sum = 3 a=3 || inloop sum=sum+a --> sum=3+3 --> sum=6
            sum = 6 a=4 || inloop sum=sum+a --> sum=6+4 --> sum=10
            System.out.printf("Inside loop a="+a+" sum="+sum);
            System.out.printf("\n");
             */
        }
        System.out.printf("OUTPUT:"+sum);

    }
}
