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
1) Create a TextTransformer class.<br>
Method:<br>
- String transform(String text) - Converts text to upper case. Example hello> HELLO<br>
2) Create the class InverseTransformer as a subclass of TextTransformer. Override the String method transform(String text) - Reverses the text. Example hello > olleh<br>
3) Create the class UpDownTransformer as a subclass of TextTransformer. Override the String method transform(String text) - Every odd letter is large, even is small. Example hello > HeLlO<br>
4) Create a TextSaver class.<br>
Fields:<br>
- TextTransformer transformer<br>
- File file<br>
Methods:<br>
- void saveTextToFile(String text) - First, one of the transformers (transformer field) converts a string, then save it to a file (file field).
</p>

<p>
<b> lesson_3_1_OOP </b><br>
Implement exceptions for entering prices from a file.
</p>

<p>
<b> lesson_3_2_OOP </b><br>
Implement enumerations 'Enums'.
</p>