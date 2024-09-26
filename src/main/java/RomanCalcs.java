public class RomanCalcs extends Calculations{
    private final String[] romanNumber = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "L","C"};
    private final String[] arabicNumber = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "50","100"};
    private int gap = 0;
        public void calculate(String expression){
        if(expression.contains("+")){
            String[] pairOfNums = expression.split("\\+");
            this.convert(pairOfNums);
            int[] pairOfInt = {Integer.parseInt(pairOfNums[0]),Integer.parseInt(pairOfNums[1])};
            this.addition(pairOfInt);
        }
        else if (expression.contains("-")){
            String[] pairOfNums = expression.split("-");
            this.convert(pairOfNums);
            int[] pairOfInt = {Integer.parseInt(pairOfNums[0]),Integer.parseInt(pairOfNums[1])};
            this.subtraction(pairOfInt);
        }
        else if (expression.contains("*")){
            String[] pairOfNums = expression.split("\\*");
            this.convert(pairOfNums);
            int[] pairOfInt = {Integer.parseInt(pairOfNums[0]),Integer.parseInt(pairOfNums[1])};
            this.multiplication(pairOfInt);
        }
        else{
            String[] pairOfNums = expression.split("/");
            this.convert(pairOfNums);
            int[] pairOfInt = {Integer.parseInt(pairOfNums[0]),Integer.parseInt(pairOfNums[1])};
            this.division(pairOfInt);
        }
    }

    public String[] convert(String[] pairOfNums){
        for(int i = 0; i < romanNumber.length; i++){
            if (romanNumber[i].equals(pairOfNums[0])){
                pairOfNums[0] = arabicNumber[i];
            }
            if (romanNumber[i].equals(pairOfNums[1])){
                pairOfNums[1] = arabicNumber[i];
            }
        }
        return pairOfNums;
    }

    @Override
    public void addition(int[] pairOfInt) {
        for(int i = 0; i < pairOfInt[0] + pairOfInt[1]; i += gap){

            if(pairOfInt[0] + pairOfInt[1] - 10 - gap >= 0){
                System.out.print("X");
                gap += 10;
            }
            else if(pairOfInt[0] + pairOfInt[1] - 9 - gap >= 0){
                System.out.print("IX");
                gap += 9;
            }
            else if(pairOfInt[0] + pairOfInt[1] - 8 - gap >= 0){
                System.out.print("VIII");
                gap += 8;
            }
            else if(pairOfInt[0] + pairOfInt[1] - 7 - gap >= 0){
                System.out.print("VII");
                gap += 7;
            }
            else if(pairOfInt[0] + pairOfInt[1] - 6 - gap >= 0){
                System.out.print("VI");
                gap += 6;
            }
            else if(pairOfInt[0] + pairOfInt[1] - 5 - gap >= 0){
                System.out.print("V");
                gap += 5;
            }
            else if(pairOfInt[0] + pairOfInt[1] - 4 - gap >= 0){
                System.out.print("IV");
                gap += 4;
            }
            else if(pairOfInt[0] + pairOfInt[1] - 3 - gap >= 0){
                System.out.print("III");
                gap += 3;
            }
            else if(pairOfInt[0] + pairOfInt[1] - 2 - gap >= 0){
                System.out.print("II");
                gap += 2;
            }
            else if(pairOfInt[0] + pairOfInt[1] - 1 - gap >= 0){
                System.out.print("I");
                gap += 1;
            }
        }
    }

    @Override
    public void subtraction(int[] pairOfInt) {
        if(pairOfInt[0]-pairOfInt[1] < 1){
            System.out.println("Неположительный результат");
        }
        else{
            for(int i = 0; i < pairOfInt[0] - pairOfInt[1]; i += gap){

                if(pairOfInt[0] - pairOfInt[1] - 10 - gap >= 0){
                    System.out.print("X");
                    gap += 10;
                }
                else if(pairOfInt[0] - pairOfInt[1] - 9 - gap >= 0){
                    System.out.print("IX");
                    gap += 9;
                }
                else if(pairOfInt[0] - pairOfInt[1] - 8 - gap >= 0){
                    System.out.print("VIII");
                    gap += 8;
                }
                else if(pairOfInt[0] - pairOfInt[1] - 7 - gap >= 0){
                    System.out.print("VII");
                    gap += 7;
                }
                else if(pairOfInt[0] - pairOfInt[1] - 6 - gap >= 0){
                    System.out.print("VI");
                    gap += 6;
                }
                else if(pairOfInt[0] - pairOfInt[1] - 5 - gap >= 0){
                    System.out.print("V");
                    gap += 5;
                }
                else if(pairOfInt[0] - pairOfInt[1] - 4 - gap >= 0){
                    System.out.print("IV");
                    gap += 4;
                }
                else if(pairOfInt[0] - pairOfInt[1] - 3 - gap >= 0){
                    System.out.print("III");
                    gap += 3;
                }
                else if(pairOfInt[0] - pairOfInt[1] - 2 - gap >= 0){
                    System.out.print("II");
                    gap += 2;
                }
                else if(pairOfInt[0] - pairOfInt[1] - 1 - gap >= 0){
                    System.out.print("I");
                    gap += 1;
                }
            }
        }
    }

    @Override
    public void multiplication(int[] pairOfInt) {
        for(int i = 0; i < pairOfInt[0] * pairOfInt[1]; i = gap){

            if(pairOfInt[0] * pairOfInt[1] - 100 - gap == 0){
                System.out.print("C");
                gap = 100;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 90 == 0){
                System.out.print("XC");
                break;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 50 - gap >= 0){
                System.out.print("L");
                gap = 50;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 10 - gap >= 0){
                System.out.print("X");
                gap += 10;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 9 - gap >= 0){
                System.out.print("IX");
                gap += 9;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 8 - gap >= 0){
                System.out.print("VIII");
                gap += 8;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 7 - gap >= 0){
                System.out.print("VII");
                gap += 7;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 6 - gap >= 0){
                System.out.print("VI");
                gap += 6;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 5 - gap >= 0){
                System.out.print("V");
                gap += 5;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 4 - gap >= 0){
                System.out.print("IV");
                gap += 4;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 3 - gap >= 0){
                System.out.print("III");
                gap += 3;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 2 - gap >= 0){
                System.out.print("II");
                gap += 2;
            }
            else if(pairOfInt[0] * pairOfInt[1] - 1 - gap >= 0){
                System.out.print("I");
                gap += 1;
            }
        }
    }

    @Override
    public void division(int[] pairOfInt) {
        for(int i = 0; i < pairOfInt[0] / pairOfInt[1]; i += gap){

            if(pairOfInt[0] / pairOfInt[1] - 10 - gap >= 0){
                System.out.print("X");
                gap += 10;
            }
            else if(pairOfInt[0] / pairOfInt[1] - 9 - gap >= 0){
                System.out.print("IX");
                gap += 9;
            }
            else if(pairOfInt[0] / pairOfInt[1] - 8 - gap >= 0){
                System.out.print("VIII");
                gap += 8;
            }
            else if(pairOfInt[0] / pairOfInt[1] - 7 - gap >= 0){
                System.out.print("VII");
                gap += 7;
            }
            else if(pairOfInt[0] / pairOfInt[1] - 6 - gap >= 0){
                System.out.print("VI");
                gap += 6;
            }
            else if(pairOfInt[0] / pairOfInt[1] - 5 - gap >= 0){
                System.out.print("V");
                gap += 5;
            }
            else if(pairOfInt[0] / pairOfInt[1] - 4 - gap >= 0){
                System.out.print("IV");
                gap += 4;
            }
            else if(pairOfInt[0] / pairOfInt[1] - 3 - gap >= 0){
                System.out.print("III");
                gap += 3;
            }
            else if(pairOfInt[0] / pairOfInt[1] - 2 - gap >= 0){
                System.out.print("II");
                gap += 2;
            }
            else if(pairOfInt[0] / pairOfInt[1] - 1 - gap >= 0){
                System.out.print("I");
                gap += 1;
            }
        }
    }

}
