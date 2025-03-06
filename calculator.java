package calculator;
public class Calculator {
    public static void main(String[] args) {
        int num1, num2;
        double sum, difference, product, quotient;
        
        num1 = 10;
        num2 = 5;
        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;
        
        System.out.println("Sum/Difference/Product/Quotient: \n" + sum + "\n" + difference + "\n" + product + "\n" + quotient);
    } 
}
