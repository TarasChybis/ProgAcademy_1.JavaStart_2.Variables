<h1> 6. Multithreading I </h1>

<p>
<b> home_work_6_1_OOP </b><br>
Write a program that will copy all files with a predetermined extension (for example, only doc) from one directory to another.
</p>

<p>
<b> home_work_5_2_OOP </b><br>
Implement a separate GroupFileStorage class that will have the following methods:<br>
- void saveGroupToCSV(Group gr) - write group to CSV file<br>
- Group loadGroupFromCSV(File file) - read and return a group from a file<br>
- File findFileByGroupName(String groupName, File workFolder) - search for a file in the working directory (workFolder). The name of the file is determined by the name of the group saved in it.
</p>

<p>
<b> home_work_5_3_OOP </b><br>
Implement a service to compare files for identity. Files are considered identical if they are byte-by-byte equal. Files of different lengths, or files in which at least one byte is different, are considered different.
</p>

<p>
<b> home_work_5_4_OOP </b><br>
Complete the resulting service with the ability to transfer file addresses in key mode when the application is launched from the command line.
</p>

<p>
<b> lesson_6_1_OOP </b><br>
Методы для работы с потоками.
</p>

<p>
<b> lesson_6_2_OOP </b><br>
1) Создать класс FactorialTask.<br>
2) Создать 3 потока (3 исполнителя).<br>
3) Передать ссылку на объект класса FactorialTask, реализующего интерфейс Runnable. <br>
4) Запустить их методами start(). 
</p>

<p>
<b> lesson_6_3_OOP </b><br>
1) Создать класс FactorialTask.<br>
2) Создать 3 потока (3 исполнителя).<br>
3) Передать ссылку на объект класса FactorialTask, реализующего интерфейс Runnable.<br> 
4) Запустить их методами start().<br>
5) Основной поток Main поставить на паузу с помощью метода join(), пока задачи выполняются в параллельных потоках.<br>
6) Собрать данные из параллельных потоков в основной поток Main. 
</p>

<p>
<b> lesson_6_4_OOP </b><br>
Использование метода void interrupt() для прерывания выполнения потока метода run(). 
</p>