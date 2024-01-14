import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {


        int age = 0;
        int nChargeableIncome = 0;
        int deductionOne = 0;
        int deductionTwo = 0;
        int deductionThree = 0;
        int deductionFour = 0;
        int deductionFive = 0;
        int allowanceOne = 0;
        int allowanceThree = 0;
        int allowanceFour = 0;

        Scanner scanner = new Scanner(System.in);

        String contOrEnd = "";
        while (!contOrEnd.equalsIgnoreCase("exit")) {


            System.out.println("Please enter you first name");
            String firstName = scanner.nextLine();

            System.out.println("Please enter your surname");
            String lastName = scanner.nextLine();

            System.out.println("Please enter your age");
            age = scanner.nextInt();

            System.out.println("Tax Payer Details: " + firstName + " " + lastName + ", age " + age);
            System.out.println("Nathan Lau \nDecember 10, 2023 \nAssignment 6 - HK Tax Calculator \nI got help from Mr. Tam. \n" +
                    "I will be calculating the amount of tax a family has to pay annually by asking for some information from the user.");
            System.out.println("Welcome to Nathan's Hong Kong Tax Rate Calculator \nI will have to collect some information to calculate the amount of tax you" +
                    "have to pay in a year.");

            while (true) {
                System.out.println("What is your net chargeable income? (enter the number in HKD with no units or money symbols.)");
                nChargeableIncome = scanner.nextInt();

                if (nChargeableIncome >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            }


            while (true) {
                System.out.println("How much do you pay for Expenses of Self-education? Please enter a positive integer.");
                deductionOne = scanner.nextInt();

                if (deductionOne >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            }

            while (true) {
                System.out.println("How much do you pay for Charitable Donations? Please enter a positive integer.");
                deductionTwo = scanner.nextInt();

                if (deductionTwo >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            }

            while (true) {
                System.out.println("How much do you pay for Health Insurances? Please enter a positive integer (Amount cannot exceed 8,000).");
                deductionThree = scanner.nextInt();

                if (deductionThree >= 0 && deductionThree < 8000) {
                    break;
                } else {
                    System.out.println("Invalid input or number exceeds 8,000. PLease enter a positive integer from 0 to 8,000 (inclusive).");
                }
            }

            while (true) {
                System.out.println("How much do you pay for Domestic Rents? Please enter a positive integer (Amount cannot exceed 100,000).");
                deductionFour = scanner.nextInt();

                if (deductionFour >= 0 && deductionFour < 100000) {
                    break;
                } else {
                    System.out.println("Invalid input or number exceeds 100,000. PLease enter a positive integer from 0 to 100,000 (inclusive).");
                }
            }

            while (true) {
                System.out.println("How much do you pay for Home Loan Interest? Please enter a positive integer.");
                deductionFive = scanner.nextInt();
                if (deductionFive >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. PLease enter a positive integer.");
                }
            }

            String allowanceOneAns;
            String allowanceTwoAns;


            while (true) {
                System.out.println("Are you a single parent? Please answer Yes or No.");
                scanner.nextLine();
                allowanceOneAns = scanner.next().toLowerCase();

                if (allowanceOneAns.equals("yes")) {
                    String answer;
                    int children;

                    System.out.println("Do you have children? Please answer Yes or No.");
                    answer = scanner.next().toLowerCase();

                    while (true) {
                        if (answer.equals("yes")) {
                            System.out.println("How many children do you have? Enter a number from 1-9.");
                            children = scanner.nextInt();
                            while (true) {
                                if (children >= 1 && children <= 9) {
                                    allowanceThree = children * 130000;
                                    break;
                                }
                                else {
                                    System.out.println("Invalid input. Enter a number from 1-9.");
                                    children = scanner.nextInt();
                                }
                            }
                            break;
                        }
                        else if (answer.equals("no")) {
                            break;
                        }
                        else {
                            System.out.println("Invalid input. Please answer Yes or No.");
                            answer = scanner.next();
                        }
                    }
                } else if (allowanceOneAns.equals("no")) {
                    System.out.println("Are you currently a married parent? Please answer Yes or No.");
                    allowanceTwoAns = scanner.next().toLowerCase();

                    while (true) {
                        if (allowanceTwoAns.equals("yes")) {
                            String answer;
                            int children;

                            System.out.println("Do you have children? Please answer Yes or No.");
                            answer = scanner.next().toLowerCase();

                            while (true) {
                                if (answer.equals("yes")) {
                                    System.out.println("How many children do you have? Enter a number from 1-9.");
                                    children = scanner.nextInt();
                                    while (true) {
                                        if (children >= 1 && children <= 9) {
                                            allowanceThree = children * 130000 + 264000;
                                            break;
                                        } else {
                                            System.out.println("Invalid input. Enter a number from 1-9.");
                                            children = scanner.nextInt();
                                        }
                                    }
                                } else if (answer.equals("no")) {
                                    allowanceThree = 264000;
                                    break;
                                } else {
                                    System.out.println("Invalid input. Please answer Yes or No.");
                                    answer = scanner.next();
                                }
                            }
                        } else if (allowanceTwoAns.equals("no")) {
                            break;
                        } else {
                            System.out.println("Invalid input. Please answer Yes or No.");
                            allowanceTwoAns = scanner.next().toLowerCase();
                        }
                    }
                } else {
                    System.out.println("Invalid input. Please answer Yes or No.");
                    allowanceOneAns = scanner.next().toLowerCase();
                }
                break;
            }


            String allowanceFourAns;
            while (true) {
                System.out.println("Do you have a personal disability? Please answer Yes or No.");
                scanner.nextLine();
                allowanceFourAns = scanner.next().toLowerCase();

                if (allowanceFourAns.equals("yes")) {
                    allowanceFour = 75000;
                    break;
                } else if (allowanceFourAns.equals("no")) {
                    allowanceFour = 132000;
                    break;
                } else {
                    System.out.println("Invalid input. Please answer Yes or No.");
                }
            }


            int totalDeductions = deductionOne + deductionTwo + deductionThree + deductionFour + deductionFive;
            int totalAllowances = allowanceOne + allowanceThree + allowanceFour;
            double standardTax = nChargeableIncome - totalDeductions - totalAllowances;

            double taxPay = 0;
            if (standardTax - 200000 <= 0) {
                if (0 <= standardTax && standardTax <= 50000) {
                    taxPay = standardTax * 0.02;
                } else if (50001 <= standardTax && standardTax <= 100000) {
                    taxPay = standardTax * 0.06;
                } else if (100001 <= standardTax && standardTax <= 150000) {
                    taxPay = standardTax * 0.1;
                } else if (150001 <= standardTax && standardTax <= 200000) {
                    taxPay = standardTax * 0.14;
                }
            }
            else {
                taxPay = (standardTax - 200000) * 0.17 + 16000;
            }
            System.out.println("You're tax payment is HKD" + taxPay + ".");

            System.out.println("Enter 'exit' to exit to code. Enter any other input to keep calculating your tax payment.");
            scanner.nextLine();
            contOrEnd = scanner.nextLine();
        }
        System.out.println("Thanks for using Nathan's Hong Kong Tax Rate Calculator!");
    }
}