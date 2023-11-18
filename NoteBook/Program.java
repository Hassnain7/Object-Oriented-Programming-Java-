import java.util.Scanner;
public class Program {
    public static void main(String args[]) {
            notebook n1 = new notebook();
            int choice;

            do {
                System.out.println("Notebook Menu:");
                System.out.println("1. Add a note");
                System.out.println("2. Display all notes");
                System.out.println("3. Search for a note");
                System.out.println("4. Delete a note");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();// Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter the note: ");
                        String note = scanner.next();
                        n1.addNote(note);
                        break;
                    case 2:
                        n1.DisplayNote();
                        break;
                    case 3:
                        System.out.print("Enter the note to search: ");
                        String search = scanner.next();
                        n1.SearchNote(search);
                        break;
                    case 4:
                        System.out.print("Enter the note number to delete: ");
                        int index = scanner.nextInt();
                        // Consume the newline character
                        n1.deleteNote(index);
                        break;
                    case 5:
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }

                System.out.println();
            } while (choice != 5);
        }
    }