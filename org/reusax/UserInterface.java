package org.reusax;
import org.reusax.employees.Employee;

import java.util.*;

public class UserInterface {

    private static String END_LINE;
    private Scanner input;
    private String name;
    private String ID;
    private double salary;
    private int GPA;
    private String degree;
    private String department;
    private ReusaxCorp corp;

public UserInterface() {

        input = new Scanner(System.in);
        END_LINE = System.lineSeparator();
    }

public void Welcome(){

    System.out.println(" Welcome to ReusaxCorp..."+END_LINE+
                       " What may we help you with today?"+END_LINE+
                       "....................................... "+END_LINE+
                       " 1. Register a new employee. " +END_LINE+
                       " 2. Remove a existing employee. " +END_LINE+
                       " 3. Retrieve information about an employee." +END_LINE+
                       " 4. Update an employees information. " +END_LINE+
                       " 5. Calculate gross cost of employees. " +END_LINE+
                       " 6. Calculate net cost of employees. " +END_LINE+
                       " 7. Retrieve total number of employees. " +END_LINE
            );

    options();

}

public void options(){

    Employee worker;

    while ( true ) {

        String option = input.nextLine();

        switch (option) {
            case "1":
                System.out.println("What type of employee?"+END_LINE+
                                   " -Intern. "+END_LINE+
                                   " -Employee. "+END_LINE+
                                   " -Manager. "+END_LINE+
                                   " -Director. "+END_LINE);


                 createEmployee();
                break;
            case "2":
//TODO put in code!
                System.out.println("What is the ID of the employee you wish to remove? "+END_LINE);
                ID = input.nextLine();
                corp.removeEmployee(ID);
                break;
            case "3":
//TODO put in code!
                System.out.println("What is the ID of the employee you wish to know more about? "+END_LINE);
                ID = input.nextLine();
                worker = corp.getEmployee(ID);
                System.out.println(worker);
                break;
            case "4":
//TODO put in code!
                System.out.println("What is the ID of the employee you wish to update? "+END_LINE);
                ID = input.nextLine();
                System.out.println("What do you wish to update? Name/Salary?");
                String choice = input.nextLine();
                if (choice.equals("name")){
                    System.out.println("What is the new name of the ID"+ID);
                    name = input.nextLine();
                    setWorkerName(ID,name);

                }else if(choice.equals("salary")){
                    System.out.println("What is the new salary of the ID"+ID);
                    salary = input.nextDouble();
                    setWorkerSalary(ID,salary);

                }

                break;
            case "5": // Gross pay
//TODO put in code!
                break;
            case "6": // Net Pay
//TODO put in code!
                break;
            case "7":
//TODO put in code!
                break;
            case"8":
                System.out.println("Thank you for your time....oooh, ");
                System.exit(0);
            default:
                System.out.println("Please try again... "+END_LINE);
                break;

        }
    }

}

public void createEmployee (){


    String option = input.nextLine();

    System.out.println(END_LINE+"What´s the name of the new "+option+"? ");
    name = input.nextLine();
    System.out.println(END_LINE+"What´s the salary of the new "+option+"? ");
    salary = input.nextDouble();
    input.nextLine();
    System.out.println(END_LINE+"What´s the ID of the new "+option+"? ");
    ID = input.nextLine();

    switch (option){
        case "intern":
            System.out.println(END_LINE+"What´s the new Interns GPA? ");
            GPA = input.nextInt();
            input.nextLine();
            corp.addIntern(name, salary,ID, GPA);
            //TODO call function!
            break;
        case "employee":
            corp.addEmployee(name,salary,ID);
            //TODO call function!
            break;
        case "manager":
            System.out.println(END_LINE+"What kind of degree does the new Manager have? ");
            degree = input.nextLine();
            //TODO call function!
            break;
        case "director":
            System.out.println(END_LINE+"What kind of degree does the new Director have? ");
            degree = input.nextLine();
            System.out.println(END_LINE+"Which department is the new Director in charge of? ");
            department = input.nextLine();
            //TODO call function!
            break;
        default:
                System.out.println("Not a valid type of employee...");
                break;
    }

}

public static void main(String[] args){

        UserInterface program = new UserInterface();
        program.Welcome();

    }

}
