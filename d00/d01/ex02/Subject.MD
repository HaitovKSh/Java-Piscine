Exercise 00

Models
Turn-in directory : еx00/

Files to turn in  :  User.java, Transaction.java, ex00.Chat.src.java.edu.school21.chat.models.Main.java

Allowed functions

User classes can be employed, along with:

Types (+ all methods of these types) : Integer, String, UUID, enumerations



Your first task is to develop basic domain models—namely, User and Transaction classes. It is quite
likely for different users to have the same name in the system. This problem should be solved by
adding а special field for а user's unique ID. This ID can be any integer number. Specific ID
creation logic is described in the next exercise.
Thus, the following set of states (fields) is typical for User class:

• Identifier

• Name

• Balance

Transaction class describes а money transfer between two users. Here, а unique identifier should
also be defined. Siпce the number of such transactions can be very large, let us define the
identifier as ап UUID string. Thus, the following set of states (fields) is typical for Transaction
class:

• Identifier

• Recipient (User type)

• Sender (User type)

• Transfer category (debits, credits)

• Transfer amount


It is necessary to check the initial user balance (it cannot be negative), as well as the balance
for the outgoing (negative amounts only) and incoming (positive amounts only) transactions (use of
get/set methods).
Ап example of use of such classes shall be contained in ex00.Chat.src.java.edu.school21.chat.models.Main file (creation, initialization,
printing object content оп а console) . All data for class fields шust be hardcoded  in ex00.Chat.src.java.edu.school21.chat.models.Main.