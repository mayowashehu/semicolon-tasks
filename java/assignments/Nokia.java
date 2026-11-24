import java.util.Scanner;

public class Nokia {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        mainMenu();
    }
     
    // MAIN MENU   
    public static void mainMenu() {
        boolean keepShowing = true;
        while (keepShowing) {
            System.out.printf("%50s%n", "NOKIA 5510 MAIN MENU - PICK AN OPTION");
            System.out.printf("%-20s%-20s%s%n", "1. Phone book","2. Messages","3. Chat");
            System.out.printf("%-20s%-20s%s%n", "4. Call register", "5. Tones", "6. Settings");
            System.out.printf("%-20s%-20s%s%n", "7. Call divert", "8. Music", "9. Games");
            System.out.printf("%-20s%-20s%s%n", "10. Calculator", "11. Reminders", "12. Clock");
            System.out.printf("%-20s%-20s%s%n", "13. Profiles", "14. Services", "15. SIM Services");
            System.out.printf("0. Exit%n");
            
            System.out.print("Enter Choice: ");
            String choice = input.nextLine().trim();
            switch (choice) {
                case "1": phoneBook(); break;
                case "2": messages(); break;
                case "3": System.out.println("You entered Chat"); break;
                case "4": callRegister(); break;
                case "5": tones(); break;
                case "6": settings(); break;
                case "7": System.out.println("You entered Call divert"); break;
                case "8": music(); break;
                case "9": System.out.println("You entered Games"); break;
                case "10": System.out.println("You entered Calculator"); break;
                case "11": System.out.println("You entered Reminders"); break;
                case "12": clock(); break;
                case "13": System.out.println("You entered Profiles"); break;
                case "14": System.out.println("You entered Services"); break;
                case "15": System.out.println("You entered SIM Services"); break;
                case "0": System.out.println("Good bye Ski!..."); keepShowing = false; break;
                default: System.out.println("Invalid choice, enter correct option");
            }
            System.out.println();
        }
    }
     
    // PHONE BOOK MENU
    public static void phoneBook() {
        while (true) {
            System.out.printf("%20s%n", "---PHONE BOOK MENU OPTIONS---");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                    "1. Search",
                    "2. Service Nos",
                    "3. Add Name",
                    "4. Erase",
                    "5. Edit",
                    "6. Copy",
                    "7. Assign Tone",
                    "8. Send b'card",
                    "9. Options",
                    "10. Speed dials",
                    "11. Voice Tags",
                    "0. Back");
            System.out.print("Enter choice: ");
            String choice = input.nextLine().trim();
            
            switch (choice) {
                case "1": System.out.println("You entered Search"); break;
                case "2": System.out.println("You entered Service Nos"); break;
                case "3": System.out.println("You entered Add name"); break;
                case "4": System.out.println("You entered Erase"); break;
                case "5": System.out.println("You entered Edit"); break;
                case "6": System.out.println("You entered copy"); break;
                case "7": System.out.println("You entered Assign Tone"); break;
                case "8": System.out.println("You entered send b'card"); break;
                case "9": phoneBookOptions(); break;
                case "10": System.out.println("You entered Speed dials"); break;
                case "11": System.out.println("You entered Voice Tags"); break;
                case "0": return;
                default: System.out.println("invalid option"); break;
            }
            System.out.println();
        }
    }
     
    public static void phoneBookOptions() {
        while (true) {
            System.out.printf("%20s%n", "----PHONE BOOK OPTIONS----");
            System.out.printf("%s%n%s%n%s%n%s%n", "1. Memory in use", "2. Type of view", "3. Memory Status", "0. Back");
            System.out.print("Enter choice: ");
            String choice = input.nextLine().trim();
            
            switch (choice) {
                case "1": System.out.println("You entered Memory in use"); break;
                case "2": System.out.println("You entered Type of view"); break;
                case "3": System.out.println("You entered Memory Status"); break;
                case "0": return;
                default: System.out.println("You entered invalid option"); break;
            }
            System.out.println();
        }
    }
      
    // MESSAGES MENU
    public static void messages() {
        while (true) {
            System.out.printf("%20s%n", "--- MESSAGES ---");
            System.out.printf("%-22s%-22s%s%n", "1. Write messages", "2. Inbox", "3. Outbox");
            System.out.printf("%-22s%-22s%s%n", "4. Picture messages", "5. Templates", "6. Smileys");
            System.out.printf("%-22s%-22s%s%n", "7. Message settings", "8. Info service", "9. Voice mailbox number*");
            System.out.printf("%-28s%s%n%n", "10. Service command editor", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": System.out.println("You opened Write messages"); break;
                case "2": System.out.println("You opened Inbox"); break;
                case "3": System.out.println("You opened Outbox"); break;
                case "4": System.out.println("You opened Picture messages"); break;
                case "5": System.out.println("You opened Templates"); break;
                case "6": System.out.println("You opened Smileys"); break;
                case "7": messageSettings(); break;
                case "8": System.out.println("You opened Info service"); break;
                case "9": System.out.println("You opened Voice mailbox number*"); break;
                case "10": System.out.println("You opened Service command editor"); break;
                case "0": return;
                default: System.out.println("Invalid option. Enter valid options in the list");
            }
            System.out.println();
        }
    }

    public static void messageSettings() {
        while (true) {
            System.out.printf("%20s%n", "--- MESSAGE SETTINGS ---");
            System.out.printf("%-15s%-15s%s%n%n", "1. Set 1", "2. Common", "0. Back");

            System.out.print("Enter choice: ");
            String choice = input.nextLine().trim();
            switch (choice) {
                case "1": messageSettingsSet1(); break;
                case "2": messageSettingsCommon(); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }

    public static void messageSettingsSet1() {
        while (true) {
            System.out.printf("%20s%n", "--- MESSAGE SETTINGS: SET 1 ---");
            System.out.printf("%-28s%-24s%s%n", "1. Message centre number", "2. Messages sent as", "3. Message validity");
            System.out.printf("%s%n%n", "0. Back");

            System.out.print("Enter option: ");
            String choice = input.nextLine().trim();
            switch (choice) {
                case "1": System.out.println("You opened Message centre number"); break;
                case "2": System.out.println("You opened Messages sent as"); break;
                case "3": System.out.println("You opened Message validity"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }

    public static void messageSettingsCommon() {
        while (true) {
            System.out.printf("%20s%n", "--- MESSAGE SETTINGS: COMMON ---");
            System.out.printf("%-24s%-28s%s%n", "1. Delivery reports", "2. Reply via same centre", "3. Character support");
            System.out.printf("%s%n%n", "0. Back");

            System.out.print("Enter option: ");
            String choice = input.nextLine().trim();
            switch (choice) {
                case "1": System.out.println("You opened Delivery reports"); break;
                case "2": System.out.println("You opened Reply via same centre"); break;
                case "3": System.out.println("You opened Character support"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }
     
    // CALL REGISTER MENU
    public static void callRegister() {
        while (true) {
            System.out.printf("%20s%n", "--- CALL REGISTER ---");
            System.out.printf("%-26s%-26s%s%n", "1. Missed calls", "2. Received calls", "3. Dialled numbers");
            System.out.printf("%-26s%-26s%s%n", "4. Erase recent call lists", "5. Show call duration", "6. Show call costs");
            System.out.printf("%-26s%-26s%s%n%n", "7. Call cost settings", "8. Prepaid credit", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": System.out.println("You opened Missed calls"); break;
                case "2": System.out.println("You opened Received calls"); break;
                case "3": System.out.println("You opened Dialled numbers"); break;
                case "4": System.out.println("You opened Erase recent call lists"); break;
                case "5": showCallDuration(); break;
                case "6": showCallCosts(); break;
                case "7": callCostSettings(); break;
                case "8": System.out.println("You opened Prepaid credit"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }

    public static void showCallDuration() {
        while (true) {
            System.out.printf("%20s%n", "--- SHOW CALL DURATION ---");
            System.out.printf("%-28s%-28s%s%n", "1. Last call duration", "2. All calls' duration", "3. Received calls' duration");
            System.out.printf("%-28s%-28s%s%n%n", "4. Dialled calls' duration", "5. Clear timers", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": System.out.println("You opened Last call duration"); break;
                case "2": System.out.println("You opened All calls' duration"); break;
                case "3": System.out.println("You opened Received calls' duration"); break;
                case "4": System.out.println("You opened Dialled calls' duration"); break;
                case "5": System.out.println("You opened Clear timers"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }

    public static void showCallCosts() {
        while (true) {
            System.out.printf("%20s%n", "--- SHOW CALL COSTS ---");
            System.out.printf("%-24s%-24s%-24s%s%n%n", "1. Last call cost", "2. All calls' cost", "3. Clear counters", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": System.out.println("You opened Last call cost"); break;
                case "2": System.out.println("You opened All calls' cost"); break;
                case "3": System.out.println("You opened Clear counters"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }

    public static void callCostSettings() {
        while (true) {
            System.out.printf("%20s%n", "--- CALL COST SETTINGS ---");
            System.out.printf("%-24s%-24s%s%n%n", "1. Call cost limit", "2. Show costs in", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": System.out.println("You opened Call cost limit"); break;
                case "2": System.out.println("You opened Show costs in"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }
      
    // TONES MENU
    public static void tones() {
        while (true) {
            System.out.printf("%20s%n", "--- TONES ---");
            System.out.printf("%-24s%-24s%s%n", "1. Ringing tone", "2. Ringing volume", "3. Incoming call alert");
            System.out.printf("%-24s%-24s%s%n", "4. Message alert tone", "5. Keypad tones", "6. Warning tones");
            System.out.printf("%-24s%-24s%s%n%n", "7. Vibrating alert", "8. Screen saver", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": System.out.println("You opened Ringing tone"); break;
                case "2": System.out.println("You opened Ringing volume"); break;
                case "3": System.out.println("You opened Incoming call alert"); break;
                case "4": System.out.println("You opened Message alert tone"); break;
                case "5": System.out.println("You opened Keypad tones"); break;
                case "6": System.out.println("You opened Warning tones"); break;
                case "7": System.out.println("You opened Vibrating alert"); break;
                case "8": System.out.println("You opened Screen saver"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }
      
    // SETTINGS MENU
    public static void settings() {
        while (true) {
            System.out.printf("%20s%n", "--- SETTINGS ---");
            System.out.printf("%-26s%s%n", "1. Call settings", "2. Phone settings");
            System.out.printf("%-26s%s%n", "3. Security settings", "4. Restore factory settings");
            System.out.printf("%s%n%n", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": callSettings(); break;
                case "2": phoneSettings(); break;
                case "3": securitySettings(); break;
                case "4": System.out.println("You opened Restore factory settings"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }

    public static void callSettings() {
        while (true) {
            System.out.printf("%20s%n", "--- CALL SETTINGS ---");
            System.out.printf("%-26s%-26s%s%n", "1. Automatic redial", "2. Speed dialling", "3. Call waiting options");
            System.out.printf("%-26s%-26s%s%n", "4. Own number sending", "5. Phone line in use", "6. Automatic answer*");
            System.out.printf("%s%n%n", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": System.out.println("You opened Automatic redial"); break;
                case "2": System.out.println("You opened Speed dialling"); break;
                case "3": System.out.println("You opened Call waiting options"); break;
                case "4": System.out.println("You opened Own number sending"); break;
                case "5": System.out.println("You opened Phone line in use"); break;
                case "6": System.out.println("You opened Automatic answer*"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }

    public static void phoneSettings() {
        while (true) {
            System.out.printf("%20s%n", "--- PHONE SETTINGS ---");
            System.out.printf("%-26s%-26s%s%n", "1. Language", "2. Cell info display", "3. Welcome note");
            System.out.printf("%-26s%-32s%s%n%n", "4. Network selection", "5. Confirm SIM service actions", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": System.out.println("You opened Language"); break;
                case "2": System.out.println("You opened Cell info display"); break;
                case "3": System.out.println("You opened Welcome note"); break;
                case "4": System.out.println("You opened Network selection"); break;
                case "5": System.out.println("You opened Confirm SIM service actions"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }

    public static void securitySettings() {
        while (true) {
            System.out.printf("%20s%n", "--- SECURITY SETTINGS ---");
            System.out.printf("%-26s%-26s%s%n", "1. PIN code request", "2. Call barring service", "3. Fixed dialling");
            System.out.printf("%-26s%-26s%s%n", "4. Closed user group", "5. Security level", "6. Change access codes");
            System.out.printf("%s%n%n", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": System.out.println("You opened PIN code request"); break;
                case "2": System.out.println("You opened Call barring service"); break;
                case "3": System.out.println("You opened Fixed dialling"); break;
                case "4": System.out.println("You opened Closed user group"); break;
                case "5": System.out.println("You opened Security level"); break;
                case "6": System.out.println("You opened Change access codes"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }
      
    // MUSIC MENU
    public static void music() {
        while (true) {
            System.out.printf("%20s%n", "--- MUSIC ---");
            System.out.printf("%-20s%-20s%-20s%s%n", "1. Music player", "2. Radio", "3. Recorder", "4. Track list");
            System.out.printf("%s%n%n", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": System.out.println("You opened Music player"); break;
                case "2": System.out.println("You opened Radio"); break;
                case "3": System.out.println("You opened Recorder"); break;
                case "4": System.out.println("You opened Track list"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }
      
    // CLOCK MENU
    public static void clock() {
        while (true) {
            System.out.printf("%20s%n", "--- CLOCK ---");
            System.out.printf("%-22s%-22s%s%n", "1. Alarm clock", "2. Clock settings", "3. Date setting");
            System.out.printf("%-22s%-25s%s%n", "4. Stopwatch", "5. Countdown timer", "6. Auto update of date and time");
            System.out.printf("%s%n%n", "0. Back");

            System.out.print("Enter option: ");
            String option = input.nextLine().trim();
            switch (option) {
                case "1": System.out.println("You opened Alarm clock"); break;
                case "2": System.out.println("You opened Clock settings"); break;
                case "3": System.out.println("You opened Date setting"); break;
                case "4": System.out.println("You opened Stopwatch"); break;
                case "5": System.out.println("You opened Countdown timer"); break;
                case "6": System.out.println("You opened Auto update of date and time"); break;
                case "0": return;
                default: System.out.println("Invalid option. Choose correct one YamSki!");
            }
            System.out.println();
        }
    }
}
