def main_menu():
    while True:
        print(f"\n{'NOKIA MAIN MENU OPTIONS - PICK AN OPTION':>52}\n")
        print(f"{'1. Phone book':<20}{'2. Messages':<20}{'3. Chat'}")
        print(f"{'4. Call register':<20}{'5. Tones':<20}{'6. Settings'}")
        print(f"{'7. Call divert':<20}{'8. Music':<20}{'9. Games'}")
        print(f"{'10. Calculator':<20}{'11. Reminders':<20}{'12. Clock'}")
        print(f"{'13. Profiles':<20}{'14. Services':<20}{'15. SIM Services'}")
        print("0. Exit\n")

        choice = input("Enter choice: ").strip()
        match choice:
            case '1':
                phone_book()
            case '2':
                messages()
            case '3':
                print("You entered chat")
            case'4':
                call_register()
            case '5':
                tones()
            case '6':
                settings()
            case '7':
                print("You entered call divert*")
            case '8':
                music()
            case '9':
                print("You entered games")
            case '10':
                print("You entered calculator")
            case '11':
                print("You entered Reminders")
            case '12':
                clock()
            case '13':
                print("you entered profiles")
            case '14':
                print("you entered Services")
            case '15':
                print("you entered SIM Services")
            case '0':
                print("Goodbye YamSki!")
                return
            case _:
                print("Enter valid choice")


# THE MENU FUNCTIONS BELOW....

# MENU 1:PHONE BOOK

def phone_book():
    while True:
        print(f"\n{'--- PHONE BOOK ---':>30}\n")
        print(f"{'1. Search':<20}{'2. Service Nos.':<20}{'3. Add name'}")
        print(f"{'4. Erase':<20}{'5. Edit':<20}{'6. Copy'}")
        print(f"{'7. Assign tone':<20}{'8. Send b\'card':<20}{'9. Options'}")
        print(f"{'10. Speed dials':<20}{'11. Voice tags':<20}{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened Search")
            case '2':
                print("You opened Service Nos.")
            case '3':
                print("You opened Add name")
            case '4':
                print("You opened Erase")
            case '5':
                print("You opened Edit")
            case '6':
                print("You opened Copy")
            case '7':
                print("You opened Assign tone")
            case '8':
                print("You opened Send b'card")
            case '9':
                phone_book_options()
            case '10':
                print("You opened Speed dials")
            case '11':
                print("You opened Voice tags")
            case '0':
                return
            case _:
                print("Invalid option. Enter valid options in the list")


def phone_book_options():
    while True:
        print("\n--- OPTIONS ---\n")
        print(f"{'1. Memory in use':<20}{'2. Type of view':<20}{'3. Memory status':<20}{'0. Back'}\n")

        option = input("Enter your option: ").strip()
        match option:
            case '1':
                print("You opened Memory in use")
            case '2':
                print("You opened Type of view")
            case '3':
                print("You opened Memory status")
            case '0':
                return
            case _:
                print("Invalid option, enter correct option")

# MENU 2:MESSAGES

def messages():
    while True:
        print(f"\n{'--- MESSAGES ---':>30}\n")
        print(f"{'1. Write messages':<22}{'2. Inbox':<22}{'3. Outbox'}")
        print(f"{'4. Picture messages':<22}{'5. Templates':<22}{'6. Smileys'}")
        print(f"{'7. Message settings':<22}{'8. Info service':<22}{'9. Voice mailbox number*'}")
        print(f"{'10. Service command editor':<28}{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened Write messages")
            case '2':
                print("You opened Inbox")
            case '3':
                print("You opened Outbox")
            case '4':
                print("You opened Picture messages")
            case '5':
                print("You opened Templates")
            case '6':
                print("You opened Smileys")
            case '7':
                message_settings()
            case '8':
                print("You opened Info service")
            case '9':
                print("You opened Voice mailbox number*")
            case '10':
                print("You opened Service command editor")
            case '0':
                return
            case _:
                print("Invalid option. Enter valid options in the list")


def message_settings():
    while True:
        print(f"\n{'--- MESSAGE SETTINGS ---':>34}\n")
        print(f"{'1. Set 1':<15}{'2. Common':<15}{'0. Back'}\n")

        choice = input("Enter choice: ").strip()
        match choice:
            case '1':
                message_settings_set_1()
            case '2':
                message_settings_common()
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


def message_settings_set_1():
    while True:
        print("\n--- MESSAGE SETTINGS: SET 1 ---\n")
        print(f"{'1. Message centre number':<28}{'2. Messages sent as':<24}{'3. Message validity'}")
        print(f"{'0. Back'}\n")

        choice = input("Enter option: ").strip()
        match choice:
            case '1':
                print("You opened Message centre number")
            case '2':
                print("You opened Messages sent as")
            case '3':
                print("You opened Message validity")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


def message_settings_common():
    while True:
        print("\n--- MESSAGE SETTINGS: COMMON ---\n")
        print(f"{'1. Delivery reports':<24}{'2. Reply via same centre':<28}{'3. Character support'}")
        print(f"{'0. Back'}\n")

        choice = input("Enter option: ").strip()
        match choice:
            case '1':
                print("You opened Delivery reports")
            case '2':
                print("You opened Reply via same centre")
            case '3':
                print("You opened Character support")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


# MENU 4: CALL REGISTER 

def call_register():
    while True:
        print(f"\n{'--- CALL REGISTER ---':>32}\n")
        print(f"{'1. Missed calls':<26}{'2. Received calls':<26}{'3. Dialled numbers'}")
        print(f"{'4. Erase recent call lists':<26}{'5. Show call duration':<26}{'6. Show call costs'}")
        print(f"{'7. Call cost settings':<26}{'8. Prepaid credit':<26}{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened Missed calls")
            case '2':
                print("You opened Received calls")
            case '3':
                print("You opened Dialled numbers")
            case '4':
                print("You opened Erase recent call lists")
            case '5':
                show_call_duration()
            case '6':
                show_call_costs()
            case '7':
                call_cost_settings()
            case '8':
                print("You opened Prepaid credit")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


def show_call_duration():
    while True:
        print("\n--- SHOW CALL DURATION ---\n")
        print(f"{'1. Last call duration':<28}{'2. All calls\' duration':<28}{'3. Received calls\' duration'}")
        print(f"{'4. Dialled calls\' duration':<28}{'5. Clear timers':<28}{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened Last call duration")
            case '2':
                print("You opened All calls' duration")
            case '3':
                print("You opened Received calls' duration")
            case '4':
                print("You opened Dialled calls' duration")
            case '5':
                print("You opened Clear timers")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


def show_call_costs():
    while True:
        print("\n--- SHOW CALL COSTS ---\n")
        print(f"{'1. Last call cost':<24}{'2. All calls\' cost':<24}{'3. Clear counters':<24}{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened Last call cost")
            case '2':
                print("You opened All calls' cost")
            case '3':
                print("You opened Clear counters")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


def call_cost_settings():
    while True:
        print("\n--- CALL COST SETTINGS ---\n")
        print(f"{'1. Call cost limit':<24}{'2. Show costs in':<24}{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened Call cost limit")
            case '2':
                print("You opened Show costs in")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


# MENU 5: TONES 

def tones():
    while True:
        print(f"\n{'--- TONES ---':>28}\n")
        print(f"{'1. Ringing tone':<24}{'2. Ringing volume':<24}{'3. Incoming call alert'}")
        print(f"{'4. Message alert tone':<24}{'5. Keypad tones':<24}{'6. Warning tones'}")
        print(f"{'7. Vibrating alert':<24}{'8. Screen saver':<24}{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened Ringing tone")
            case '2':
                print("You opened Ringing volume")
            case '3':
                print("You opened Incoming call alert")
            case '4':
                print("You opened Message alert tone")
            case '5':
                print("You opened Keypad tones")
            case '6':
                print("You opened Warning tones")
            case '7':
                print("You opened Vibrating alert")
            case '8':
                print("You opened Screen saver")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


# MENU 6: SETTINGS

def settings():
    while True:
        print(f"\n{'--- SETTINGS ---':>30}\n")
        print(f"{'1. Call settings':<26}{'2. Phone settings'}")
        print(f"{'3. Security settings':<26}{'4. Restore factory settings'}")
        print(f"{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                call_settings()
            case '2':
                phone_settings()
            case '3':
                security_settings()
            case '4':
                print("You opened Restore factory settings")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


def call_settings():
    while True:
        print("\n--- CALL SETTINGS ---\n")
        print(f"{'1. Automatic redial':<26}{'2. Speed dialling':<26}{'3. Call waiting options'}")
        print(f"{'4. Own number sending':<26}{'5. Phone line in use':<26}{'6. Automatic answer*'}")
        print(f"{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened Automatic redial")
            case '2':
                print("You opened Speed dialling")
            case '3':
                print("You opened Call waiting options")
            case '4':
                print("You opened Own number sending")
            case '5':
                print("You opened Phone line in use")
            case '6':
                print("You opened Automatic answer*")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


def phone_settings():
    while True:
        print("\n--- PHONE SETTINGS ---\n")
        print(f"{'1. Language':<26}{'2. Cell info display':<26}{'3. Welcome note'}")
        print(f"{'4. Network selection':<26}{'5. Confirm SIM service actions':<32}{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened Language")
            case '2':
                print("You opened Cell info display")
            case '3':
                print("You opened Welcome note")
            case '4':
                print("You opened Network selection")
            case '5':
                print("You opened Confirm SIM service actions")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


def security_settings():
    while True:
        print("\n--- SECURITY SETTINGS ---\n")
        print(f"{'1. PIN code request':<26}{'2. Call barring service':<26}{'3. Fixed dialling'}")
        print(f"{'4. Closed user group':<26}{'5. Security level':<26}{'6. Change access codes'}")
        print(f"{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened PIN code request")
            case '2':
                print("You opened Call barring service")
            case '3':
                print("You opened Fixed dialling")
            case '4':
                print("You opened Closed user group")
            case '5':
                print("You opened Security level")
            case '6':
                print("You opened Change access codes")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


# MENU 8: MUSIC

def music():
    while True:
        print(f"\n{'--- MUSIC ---':>28}\n")
        print(f"{'1. Music player':<20}{'2. Radio':<20}{'3. Recorder':<20}{'4. Track list'}")
        print(f"{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened Music player")
            case '2':
                print("You opened Radio")
            case '3':
                print("You opened Recorder")
            case '4':
                print("You opened Track list")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


# MENU 12: CLOCK

def clock():
    while True:
        print(f"\n{'--- CLOCK ---':>28}\n")
        print(f"{'1. Alarm clock':<22}{'2. Clock settings':<22}{'3. Date setting'}")
        print(f"{'4. Stopwatch':<22}{'5. Countdown timer':<25}{'6. Auto update of date and time'}")
        print(f"{'0. Back'}\n")

        option = input("Enter option: ").strip()
        match option:
            case '1':
                print("You opened Alarm clock")
            case '2':
                print("You opened Clock settings")
            case '3':
                print("You opened Date setting")
            case '4':
                print("You opened Stopwatch")
            case '5':
                print("You opened Countdown timer")
            case '6':
                print("You opened Auto update of date and time")
            case '0':
                return
            case _:
                print("Invalid option. Choose correct one YamSki!")


main_menu()

