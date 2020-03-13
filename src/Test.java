public class Test {
    public static void main(String[] args) {


        int x = 5;
        if (x < 0) {
            System.out.println("Variable is negative number");
        }
        else {
            System.out.println("Variable is positive number");
        }
        if (x==5){
            System.out.println("Variable x is number 5");

        }
        else {
            System.out.println("Variable isn't number 5");
        }
        if (x<10){
            System.out.println("Variable is small to 10 number");
        }

        int a = 5;
        switch (a){
            case 3:
                System.out.println("Variable is not equals");
                break;
            case 4:
                    System.out.println("Variable is not equals");
                    break;
            case 5:
                System.out.println("Variable is equals");
                break;
            default:
                System.out.println("Variable is diffrend");

        }
    }
}
