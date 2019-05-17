print(" BookMyShow ".center(60, "*"))

bill = []
seat = {'a': ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'],
        'b': ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'],
        'c': ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'],
        'd': ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'],
        'e': ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']}
no_seat=0
row=""
frm=0

def billing():
    print()
    print("__" * 28)
    print("--" * 28)
    print(" BookMyShow Bill ".center(56, "*"))
    print("--" * 28)
    print("Movie Name      : ", bill[0])
    print("Theater Name    : ", bill[1])
    print("Movie Timing    : ", bill[2])
    price = 250 if bill[3][1] > 'c' else (350 if bill[3][1] == 'c' else 500)
    print("Price           :  ", price, "Rs.", " per ticket", sep="")
    print("Quantity        : ", bill[3][0])
    print("Seats No        : ", end="")
    for i in range(2, 2 + 4):
        print(" ", bill[3][1], i, sep="", end="")
    print("\n", "--" * 28, sep="")
    print("Sub Total       :  ", price * bill[3][0], "Rs.", sep="")
    print("Internet charge :  ", bill[3][0] * 15, "Rs.", sep="")
    gst = ((bill[3][0] * 15 + price * bill[3][0]) * 18) / 100
    print("GST @18%        :  ", gst, "Rs.", sep="")
    total = gst + price * bill[3][0] + bill[3][0] * 15
    print("--" * 28)
    print("Grand Total     :  ", total, "Rs.", sep="")
    print("Thank You".center(56, "-"))
    print()
    bill.clear()
    # print(seat)


def movies():
    global seat, bill
    bill.clear()
    seat.clear()
    seat = {'a': ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'],
            'b': ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'],
            'c': ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'],
            'd': ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'],
            'e': ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']}
    movie = ["Avenger:End Game", "KGF","KALANK","Student of The Year 2"]
    n = 1;
    print()
    print("__" * 28)
    print(" MOVIES ".center(56, "*"))
    print("__" * 28)
    print("SI", ":", "MOVIE")
    for i in movie:
        print(n, " :", i)
        n += 1
    try:
        choice = int(input("\nEnter the MOVIE SI number :"))
        if choice <= len(movie) and choice > 0:
            bill.append(movie[choice - 1])
        else:
            raise
    except:
        print("Enter a valid choice")
        movies()


def timing():
    time = ["10:30am", "02:00pm", "05:30pm", "8:30pm"]
    n = 1;
    print("__" * 28)
    print(" TIMEINGS ".center(56, "*"))
    print("__" * 28)
    print("SI", ":", "TIME")
    for i in time:
        print(n, " :", i)
        n += 1
    try:
        choice = int(input("\nEnter the Timing SI number :"))
        if choice <= len(time) and choice > 0:
            bill.append(time[choice - 1])
        else:
            raise
    except:
        print("\nEnter a valid choice")
        timing()


def theaters():
    theater = ["Cinepolis: Binnypet Mall",
               "Everest Digital 2K Cinema: Frazer Town",
               "Gopalan Cinemas: Arcade Mall, Mysore Road",
               "PVR: Central Spirit Mall, Bellandur",
               "Cinepolis: Forum Shantiniketan, Bengaluru",
               "PVR: Forum Mall 4DX, Koramangala"]
    n = 1;
    print("__" * 28)
    print(" THEATER ".center(56, "*"))
    print("__" * 28)
    print("SI", ":", "THEATER")
    for i in theater:
        print(n, " :", i)
        n += 1
    try:
        choice = int(input("Enter the Theater SI number :"))
        if choice <= len(theater) and choice > 0:
            bill.append(theater[choice - 1])
        else:
            raise
    except:
        print("\nEnter a valid choice")
        theaters()


def disp():
    """
    this is for display the seats

    """
    print("__" * 29)
    print("RowID", "|", "Seat Number")
    print("__" * 29)
    for i in seat:
        for j in i:
            print(j, "   "" | ", seat.get(j), end="")
            print(" ->Silver Class -250Rs" if j > 'c' else (
                " ->Gold Class -350Rs" if j == 'c' else " ->Platinum Class -500Rs"), end="")
        print()
    print("All eyes this way please!".center(60, "-"))
    print("__" * 54)


def validate(no_seat, row, frm):
    """
    this is for validate the seat is available or not
    """
    try:
        val = seat.get(row)
        for i in range(int(frm), int(frm) + int(no_seat) ):
            # print(i)
            # print(i > len(val) - 1)
            # print(val[i] != str(i) )
            # print(int(no_seat) + int(frm) < 11)
            if (i > len(val) - 1 or val[i] != str(i) or int(no_seat) + int(frm) > 10):
                return False

        return True
    except:
        return False


def seat_select(no_seat, row, frm):
    """
    this is for select the seat
    """
    # print(seat)
    # print(row)
    val = seat.get(row)
    # print(val)
    if (no_seat <= len(val)):
        val[int(frm):int(frm) + int(no_seat)] = ["x" for i in range(int(no_seat))]
        bill.append([no_seat, row, frm])

def inputs():
    global  no_seat,row,frm
    try:
        no_seat = int(input("Enter the TOTAL number of seats :"))
        row = input("Enter the RowID:").lower()
        frm = input("Enter the seat no from: ")
    except:
        print("Enter the valid Input>>>")
        inputs()


name = input("\nEnter the Name: ")

while (1):
    try:
        movies()
        theaters()
        timing()
        disp()
        inputs()

    except:
        print("\n*** ENTER VALID INPUT ***\n")
        inputs()
    flag=True
    while(flag):
        if (validate(no_seat, row, frm)):
            seat_select(no_seat, row, frm)
            flag=False
        else:
            print("\n#####Sorry,Wrong Input / Total number of seat is no available in this Row#####")
            inputs()
    disp()
    # print(bill)
    c = input("Do you want to print bill? y->Yes\nOr If want to reselect PRESS any other Key :")
    if (c != 'y'):
        continue
    billing()
    choice = input("Do you want to Exit? y->Yes :")
    if (choice == "y"):
        break
