public class SwitchCaseStatement {
    public static void main(String[] args){
        int day =1;
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");  
                break;
            case 2:
                System.out.println("Tuesday");  
                break;
            case 3:
                System.out.println("wednesday");  
                break;
            default:
            System.out.println("UNknow day");
            break;
             
        }

        //nest switch statement
        String beverage ="Coke";
        char gender ='M';
        switch(beverage){
        case "Coke":
        switch(gender){
            //Coke and M

        case 'M':
            System.out.println("Male");
            break;
        case 'F':
            System.out.println("Femal");
            break;
    
        }
        System.out.println("Black");
        break;
        default:
            System.out.println("Unknown beverages");
            break;
    }

    //Switch case or
    int status = 404;
    switch(status){
        // status == 200 || status == 201 || status == 202
        case 200:
        case 201:
        case 202:
        System.out.println("Sucess");
        break;
        //status == 401 || status == 404
        case 401:
        case 404:
        System.out.println("Not found");
        break;
        default:
        System.out.println("Unknown status");
        break;
    }

    // Task1
    // make an int month and assin value
    //int month = 4;
    //using switch case check the month and print the follwing
    //0-> jan
    //1-> Feb
    //2-> Mar
    //3-> Jun
    //.. continue each moth till 11
    //11 -> Dec

    //Task2
    //make a variable String locale ans assign "np"
    //String locale ="np"
    //using switch case check the and print the following 
    //"en" or "en/us" or "en/uk" -> "Selected english"
    //"in" -> "Selected Indian"
    //"jp" -> "selected Indian"
    //"np" -> "Selected Nepali"
    //else -> "Unknown locale"

    int month= 4;
    switch (month) {
        case 0:
        System.out.println("Jan");
         break;
         case 1:
         System.out.println("Feb");
         break;
         case 2:
        System.out.println("Mar");
        break;
        case 3:
        System.out.println("Jun");
        break;
        case 4:
        System.out.println("Jul");
        break;
        case 5:
        System.out.println("Aug");
        break;
        case 6:
        System.out.println("Sep");
        break;
        case 7:
        System.out.println("Oct");
        break;
        case 8:
        System.out.println("Nov");
        break;
        case 9:
        System.out.println("Dec");
        break;
        default:
        System.out.println("Unknown month");
        break;
    }

    String locale ="np";
    switch (locale) {
        case "en":
        case "en/us":
        case "en/uk":
        System.out.println("Selected english");
        break;
        case "in":
        case "in/india":
        System.out.println("Selected Hindi");
        break;
        case "np":
        System.out.println("Selected Nepali");
        break;
        default:
        System.out.println("Selected language is not supported");
        break;
        }
}
}
