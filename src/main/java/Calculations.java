public abstract class Calculations {
    public void addition(int[] pairOfInt){
        System.out.println(pairOfInt[0] + pairOfInt[1]);
    }
    public void subtraction(int[] pairOfInt){
        System.out.println(pairOfInt[0] - pairOfInt[1]);
    }
    public void multiplication(int[] pairOfInt){
        System.out.println(pairOfInt[0] * pairOfInt[1]);
    }
    public void division(int[] pairOfInt){
        System.out.println(Math.floor((float)pairOfInt[0] / pairOfInt[1]));
    }
}
