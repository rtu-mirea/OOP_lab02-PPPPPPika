import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Laba №2");
        System.out.println();

        Work wrk = new Work();
        Work2 work2 = new Work2();
        Work3 work3 = new Work3();

        Scanner input = new Scanner(System.in);

        int numSwitch, numSwitch1, numSwitch2, numSwitch3  = 0;

        System.out.println("Enter 1 (Work1)" + "\n" + "Enter 2 (Work2)" + "\n" + "Enter 3 (Work3)");

        numSwitch = input.nextInt();

        switch (numSwitch)
        {
            case 1:
                System.out.println("Enter 1 to split text.");
                System.out.println("Enter 2 to reduce the first letters.");
                System.out.println("Enter 3 to output the counter(ам).");
                System.out.println("Enter 4 to output the new string.");

                numSwitch1 = input.nextInt();

                switch (numSwitch1)
                {
                    case 1:
                        wrk.Division();
                        wrk.PrintArr_text();
                        break;
                    case 2:
                        wrk.Reduction();
                        wrk.PrintArr_text();
                        break;
                    case 3:
                        wrk.SearchElement();
                        break;
                    case 4:
                        wrk.NumberWord_newString();
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
            case 2:
                System.out.println("Enter 1 to increase text.");
                System.out.println("Enter 2 to division text.");
                System.out.println("Enter 3 to counter points.");

                numSwitch2 = input.nextInt();

                switch (numSwitch2)
                {
                    case 1:
                        work2.TextIncrease();
                        break;
                    case 2:
                        work2.Division();
                        work2.PrintArr_text();
                        break;
                    case 3:
                        work2.FuncCounter();
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                break;
            case 3:
                System.out.println("Enter 1 to checking for the same." + "\n" + "Enter 2 to replacement");

                numSwitch3 = input.nextInt();

                switch (numSwitch3)
                {
                    case 1:
                        work3.SameElement();
                        break;
                    case 2:
                        work3.Replacement();
                        break;
                    default:
                        System.out.println("Error");
                }
                break;
        }
    }
}
