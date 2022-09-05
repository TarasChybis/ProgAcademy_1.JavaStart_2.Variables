<h1> 2. Inheritance and polymorphism </h1>

<p>
<b> home_work_2_1_OOP </b><br>
1) Create an Animal class.<br>
It should have fields:<br>
- String ration (what the animal eats)<br>
- String color (what color it is)<br>
- int weight (weight)<br>
Methods:<br>
- Standard (getters and setters, toString(), etc.)<br>
- String getVoice() (vote)<br>
- void eat() (eat)<br>
- void sleep() (sleep)<br>
2) Create classes Cat, Dog as subclasses of Animal. Add a new String name field. Redefine getVoice(), eat(), sleep() methods.<br>
3) Create a Veterinarian class.<br>
Fields:<br>
- String name<br>
Methods:<br>
- Standard<br>
- void treatment (Animal animal). (Treatment of an animal. Cats and dogs can be treated).
</p>

<p>
<b> home_work_2_2_OOP </b><br>
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
<b> lesson_2_1_OOP </b><br>
1) Create a Person class.<br>
It should have fields:<br>
- String name<br>
- String lastName<br>
Methods:<br>
- Standard (getters and setters, toString(), etc.)<br>
2) Create an Employee class as a subclass of Person. Add new fields int id and String department. Override method String toString().
</p>