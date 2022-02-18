package Pratice.functionandMethod;

// Condtion means 
/* Syntax of IF statement 

if (boolean expression true or false)
{
    body
}else {
    do this 
}
*/
public class conditional {
    public static void main(String[] args) {
       int salary = 254000;
       /* if (salary > 2000){
            salary = salary+2333;
        }
        else {
            salary = salary + 70000;
        }
        System.out.println(salary);

        */

        if (salary > 10000){
            salary  +=2000;
        }
        else {
            salary += 1000;

        }
        System.out.println(salary);
    }
    
}
