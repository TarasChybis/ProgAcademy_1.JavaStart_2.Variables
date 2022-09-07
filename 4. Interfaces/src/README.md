<h1> 4. Interfaces </h1>

<p>
<b> home_work_4_1_OOP </b><br>
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
- public Student searchStudentByLastName(String lastName) throws StudentNotFoundException (method to search for a student in a group.
If the student is not found, a custom exception should be thrown).<br>
- public boolean removeStudentByID(int id) (method of removing a student by grade number, return true if there was such a student and he was removed and false otherwise).<br>
5) Extend the implementation of the Students group with the ability to sort the array of students by last name. To do this, add the sortStudentsByLastName() method to the Group class.
</p>

<p>
<b> home_work_4_2_OOP </b><br>

</p>

<p>
<b> lesson_4_1_OOP </b><br>
Sorting an array of references of Type Cat.
</p>