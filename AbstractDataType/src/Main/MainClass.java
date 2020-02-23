package Main;

import java.util.Scanner;

import define.Mycontact;
public class MainClass {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        Mycontact user = new Mycontact();
        boolean response = true;
        do {
            System.out.println("Welcome to Pari's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            String st = sc.next();
            if (st.length() > 1) {
                System.out.println("Invalid Option");
                continue;
            }
            char choice = st.charAt(0);
            switch (choice) {
                case '1':
                    user.addContact();
                    break;
                case '2':
                    user.viewContact();
                    break;
                case '3':
                    user.searchcontact();
                    break;
                case '4':
                    user.deleteContact();
                    break;
                case '5':
                    System.out.println("Thank You");
                    System.out.println("Have a great day");
                    response = false;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
        while (response);
        sc.close();
    }

	}
