
# User Management System
This project is a User Management System implemented using Spring Boot. It provides a set of endpoints to manage user information such as adding users, retrieving user details, updating user information, and deleting users.

# Technologies Used
Java</br>
Spring Boot</br>
Spring Data JPA</br>
H2 Database</br>
Validation Annotations</br>
## Setup
Clone the repository or download the source code.
shell
Copy code
git clone <repository-url>
Import the project into your preferred IDE (e.g., IntelliJ, Eclipse).

Build the project to resolve the dependencies.

### Run the project using the IDE or using the following command:

shell</br>
Copy code</br>
mvn spring-boot:run</br>
Endpoints</br>
The User Management System provides the following endpoints:</br>

# Add User

# Method: POST</br>
Endpoint: /api/users/addUser</br>
Request Body: User object</br>
Description: Add a new user to the system.</br>
Get User by UserId</br>

# Method: GET
Endpoint: /api/users/getUser/{userid}</br>
Path Variable: userid (User Id value)</br>
Description: Retrieve user details based on the provided User Id.</br>
Get All Users</br>

# Method: GET
Endpoint: /api/users/getAllUser</br>
Description: Retrieve details of all users in the system.</br>
Update User Info</br>

# Method: PUT
Endpoint: /api/users/updateUserInfo</br>
Request Body: User object</br>
Description: Update user information based on the provided User Id.</br>
Delete User</br>

# Method: DELETE
Endpoint: /api/users/deleteUser/{userid}</br>
Path Variable: userid (User Id value)</br>
Description: Delete a user from the system based on the provided User Id.</br>
Validation</br>
The User Management System implements validation on the following attributes using annotations:</br>

### username:
Validates that the username is not null and meets the specified size requirements.</br>
### dateOfBirth:
Validates that the date of birth is in the correct format (e.g., "YYYY-MM-DD").</br>
### email: 
Validates that the email is in a valid format.</br>
### phoneNumber: 
Validates that the phone number is exactly 12 digits and starts with a valid country code.</br>
For detailed information on the validation annotations used, please refer to the Spring Boot Annotations documentation.</br>
