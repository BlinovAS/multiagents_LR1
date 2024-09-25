public class ArabicCalcs extends Calculations{
    public void calculate(String expression){
        if(expression.contains("+")){
            String[] pairOfNums = expression.split("\\+");
            int[] pairOfInt = {Integer.parseInt(pairOfNums[0]),Integer.parseInt(pairOfNums[1])};
            this.addition(pairOfInt);
        }
        else if (expression.contains("-")){
            String[] pairOfNums = expression.split("-");
            int[] pairOfInt = {Integer.parseInt(pairOfNums[0]),Integer.parseInt(pairOfNums[1])};
            this.subtraction(pairOfInt);
        }
        else if (expression.contains("*")){
            String[] pairOfNums = expression.split("\\*");
            int[] pairOfInt = {Integer.parseInt(pairOfNums[0]),Integer.parseInt(pairOfNums[1])};
            this.multiplication(pairOfInt);
        }
        else{
            String[] pairOfNums = expression.split("/");
            int[] pairOfInt = {Integer.parseInt(pairOfNums[0]),Integer.parseInt(pairOfNums[1])};
            this.division(pairOfInt);
        }

    }
}
