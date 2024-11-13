public class OperatorClass {
    public static void main(String []args){
        //Arithimatic Operator
        //+,-,*,/,%
        int intVar1 = 10, intVar2 =20;
        int addOper = intVar1 +intVar2; //10+20
        int minusOper = intVar1 - intVar2;//10-20
        int multOper = intVar1*intVar2; //10*20
        int divOper = intVar1/intVar2;//10/20
        int modOper = intVar1%intVar2;//10%20 (remainder)

        //Assignment Operator
        int assignVar = 10;
        assignVar +=20; //10+20 ->30
        assignVar -=15; //30-15 ->15
        assignVar *=2; //15*2 -> 30
        assignVar /=10; //30/10 ->3
        assignVar %= 2; //3%2 ->1

        //Unary Operator
        int unaryVar =20;
        unaryVar ++; //unaryVar += 1; 20+1; 21
        unaryVar --; //unaryVar -= 1; 21-1; 20

        //Relational Operator
        int relVar1 =20, relVar2 =30;
        boolean equalOper =relVar1 == relVar2; //20=30 ? false
        boolean greaterOper =relVar1 > relVar2; // 20>30 ? false
        boolean lessEqualOper =relVar2 <=30; //30<=30? true
        boolean notEqual = 20 != 10; //true

        //Logical Operator
        int logVar1 = 10, logVar2 =20, logVar3=23;
        boolean andOper = true && true;
        boolean andOperVar = (logVar1 < logVar2) && (logVar3 ==logVar2); //true&&false
        boolean orOper = false || false || true;
        boolean orOperVar = (logVar1 <logVar2) || (logVar3 ==logVar2);
        boolean notOper = !(logVar1 <logVar2); //!true -> false

        //Ternary Operator?
        /*
         * string status
         * int marking =40;
         * if(marking >40){
         * status ="Pass"
         * }else{
         * status ="Fail"
         * }
         */
        // int marking =40;
        // String status =(marking >40)? "pass": "fail";
        // System.out.println(status); //fail

        // int marking =40;
        // String status =(marking >40|| true)? "pass": "fail";
        // System.out.println(status); //pass


        /*
         * Task 
         * Add the following variable
         * oppMarking -> int
         * architectureMarking -> int
         * databaseMarking -> int
         * creativeThinking -> int
         * make a float avg and calculate the avg of the markings
         * make a boolean expression to check if
         * all the marking is greater or equal to 40
         * and check if the avg is greater than 50
         * make a result -> String and check the boolean
         * if true set result as "GOod job"  else set result as "Bad job"
         * print the result
         */

         int oppMarking = 40;
         int architectureMarking = 50;
         int databaseMarking = 60;
         int creativeThinking = 70;
         float avg = (oppMarking + architectureMarking + databaseMarking + creativeThinking)/4;
         boolean allMarkingGE40 = (oppMarking >= 40) && (architectureMarking >=50);
         boolean avgGT50 = (avg > 50);
         String result = (allMarkingGE40 && avgGT50) ? "Good job":"Bad job";
         System.out.println(result); //Good job
         }

    }
    

