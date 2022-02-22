public class GreatestCommonDivisor {

    /**
     * This is naive solution
     * TC : O(min(number1, number2))
     * @return Integer
     */
    public static Integer gcdSol1(Integer number1, Integer number2){
        Integer result = Math.min(number1, number2);
        while(result > 0){
            if(number1 % result == 0 && number2 % result == 0){
                break;
            }
            result --;
        }
        return result;
    }

    /**
     * This is best solution (Euclidean Algo)
     * @return Integer
     */
    public static Integer gcdSol2(Integer number1, Integer number2){
        while(number1 != number2){
            if(number1 > number2){
                number1 = number1 - number2;
            }else{
                number2 = number2 - number1;
            }
        }
        return number1;
    }

    /**
     * This is an optimised solution
     * @return Integer
     */
    public static Integer gcdSol3(Integer number1, Integer number2){
        if(number2 == 0){
            return number1;
        }else{
            return gcdSol3(number2, number1 % number2);
        }
    }
}
