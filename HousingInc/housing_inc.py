import mysql.connector
import time

connection = mysql.connector.connect (
    host="localhost",
    user="root",
    password="ILovebooks!@#123",
    database="enu_db"
)
print("Initializing Database...")
time.sleep(0.8)
print("Connected to mySQL!")
time.sleep(0.8)
cursor = connection.cursor()

def execute(query):
    cursor.execute(query)
    result = cursor.fetchall()
    return result

def insert(query):
    cursor.execute(query)
    connection.commit() 



def loadPage(seconds):
    print("Loading page...")
    time.sleep(seconds)


def housing_inc():
    logged_in = False
    while True:
        if logged_in == False:
            print("Housing Inc.")
            print("    1: Log In")
            print("    2: Sign Up")
            print("    3: Build a House")
            print("    4: See Available Homes")
            print("    5: Get your Estimate")
            print("    6: Forgot Owner iD?")
            print("    7: Exit")
        
            optionInput = input("Choose an option: ")

            if optionInput == "1":
                loadPage(2)

                owner_id = input("Owner Id: ")
                house_id = input("House Id: ")
                name = execute(f"SELECT first_name, last_name FROM Owners WHERE owner_id = {owner_id} AND house_id = {house_id};")

                
                if name == []:
                    print("Owner Id or House Id is incorrect")
                    time.sleep(2)
                else:
                    first_name = name[0][0]
                    last_name = name[0][1]
                    print("Retreiving data...")
                    time.sleep(2)

                    print(f"Welcome {first_name} {last_name}!")
                    logged_in = True
                    time.sleep(2)

            elif optionInput == "2":
                loadPage(2)

                first_name = input("First Name: ")
                last_name = input("Last Name: ")
                email = input("Email: ")
                age = input("Age: ")
                house_id = input("New Home Id: ")

                insert(f'INSERT INTO Owners(first_name, last_name, email, age, house_id) VALUES ("{first_name}", "{last_name}", "{email}", {age}, {house_id});')
                print("Inserting data...")
                time.sleep(0.8)
                print("Logging info...")
                time.sleep(0.8)
                print("Reviewing security...")
                time.sleep(0.19)
                print("Successfully Signed Up!")
            
            elif optionInput == "3":
                loadPage(2)

                square_feet = input("Square Feet: ")
                house_price = input("Price: ")
                year_built = input("Build Year: ")

                insert(f'INSERT INTO Houses(square_feet, house_price, year_built, is_available) VALUES({square_feet}, {house_price}, {year_built}, 1);')
                house_id = execute(f"SELECT house_id WHERE square_feet = {square_feet} AND house_price = {house_price} AND year_built = {year_built};")
                print("Building house...")
                time.sleep(0.8)
                print("Placing the cement...")
                time.sleep(0.8)
                print("Laying the bricks...")
                time.sleep(0.4)
                print("Plastering the walls...")
                time.sleep(0.3)
                print(f"Successfully Built House! Your house id is {house_id}!")
                time.sleep(2)


            
            elif optionInput == "5":
                loadPage(2)

                first_name = input("First Name: ")
                last_name = input("Last Name: ")

                owner_id = execute(f'SELECT owner_id FROM Owners WHERE first_name = "{first_name}" AND last_name = "{last_name}"')
                if owner_id == []:
                    print("No such owner exists!")
                else:
                    print("Getting Info...")
                    time.sleep(2)

                    print(f"Your Owner id is {owner_id[0][0]}")
                    time.sleep(2)
        
        else:
            x = 5
            

            
        



        
housing_inc()

cursor.close()
connection.close()