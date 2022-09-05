<h1> 3. Exceptions </h1>

<p>
<b> home_work_3_1_OOP </b><br>
1) Create a Human class.<br>
Fields:<br>
- String name (name).<br>
- String lastName (last name).<br>
- Gender gender (gender. Implement using Enum).<br>
Methods:<br>
- Standard (getters and setters, toString(), etc.).<br>
2) Create a class Student as a subclass of Human.<br>
Fields:<br>
- int id (study number).<br>
- String groupName (the name of the group where he studies).<br>
Methods:<br>
- Standard (getters and setters, toString(), etc.).<br>
3) Create classes GroupOverflowException, StudentNotFoundException (successors of Exception) as custom exceptions.<br>
4) Create a class Group.<br>
Fields:<br>
- String groupName (name).<br>
- Student[] students = new Student[10]; (an array of 10 students).<br>
Methods:<br>
- Standard (getters and setters, toString(), etc.).<br>
- public void addStudent(Student student) throws GroupOverflowException (method of adding a student to a group. If 11 students are added, a custom exception should be thrown).<br>
- public Student searchStudentByLastName(String lastName) throws StudentNotFoundException (method to search for a student in a group.<br>
If the student is not found, a custom exception should be thrown).<br>
- public boolean removeStudentByID(int id) (method of removing a student by grade number, return true if there was such a student and he was removed and false otherwise).
</p>

<p>
<b> home_work_3_2_OOP </b><br>
Implement a method to sort an array of students by last name. Use it in the toString() method of the Group class to get a list of students in alphabetical order.
</p>

<p>
<b> lesson_3_1_OOP </b><br>
Implement exceptions for entering prices from a file.
</p>

<p>
<b> lesson_3_2_OOP </b><br>
Implement enumerations 'Enums'.
</p>