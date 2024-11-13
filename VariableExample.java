

public class VariableExample {
//Instance Variable
int instanceVariable = 100;
//instance can only be accessed with the object
//Static Variable
static boolean staticVariable =false;
//staticVariable can be accessed with Class directly

void firstFunction(){
    int localVariable=300;
    //Local variable are made inside a function/constructer scope/block
    System.out.println("Local Variable :" + localVariable);
}
    public static void main(String[] args) {
        int localVariable2 =400;
        System.out.println("LOcal Variable : " +localVariable2);
        //To use the instance variable of a class, make object
        //sybtex: ClassName objVariable = new ClassName();
        VariableExample variableExampleobj = new VariableExample();
        //The variable of VariableExample is caled object, here variableExampleobj
       
        System.out.println("Instance Variable :"  + variableExampleobj.instanceVariable);
        //static variable can be accessed with, className.VariableName
        System.out.println("Static Variable :" +VariableExample.staticVariable);
        //calling function
        variableExampleobj.firstFunction();

        //Java TypeCasting pritive Datatype
        //Widening Casting/Implicit Casting/automatic
        //Conversion of smaller datatype to arger datatype (size/capacity)
        // byte -> short -> char -> int -> long ->float -> double
        byte byteVariable =10;
        short shortVariable = byteVariable ;// here byte is automatically converted to short

        int mathMark= 20;
        double mathConverted = mathMark; //int is automatically converted to double->20.0
        System.out.println("Int to double " +mathConverted);

        //Narrowing Casting/Explicit Casting/ Manual
        //Conversion of larger datatype to smaller datatype
       // - double -> float -> long -> int -> char -> short -> byte
        double gpa = 3.4;
        int gpaInt = (int) gpa;
        System.out.println("GPA int" +gpaInt);
        int floatConversion = (int) 400.33f; //400 

        //Calculation
        float mathCalc = 1/2;  // 1/2 in int is 0 -> 0.0
        System.out.println(mathCalc);
        float mathCalcSolve = 1f/2; //either one vale float
        System.out.println(mathCalc);
        float mathCalcSolve2 = (float) 1/2; // or manual cast
        System.out.println(mathCalc);
        



     
    }
    
}
