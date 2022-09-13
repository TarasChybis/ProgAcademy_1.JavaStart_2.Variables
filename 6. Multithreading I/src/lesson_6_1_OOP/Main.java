//Методы для работы с потоками.

package lesson_6_1_OOP;

public class Main {

	public static void main(String[] args) {

//		Мы в теле любого метода можем получить ссылку на текущий поток (исполнителя, который этот метод выполняет).
		Thread mainThread = Thread.currentThread();
		
//		Узнать имя потока
		System.out.println(mainThread.getName());

//		Изменить имя потока (id номер потока изменять нельзя. id номер потока уникален, создается операционной системой и в процессе выполнения потока изменен быть не может).args
		System.out.println(mainThread.getId());
		
//		Получить ссылку на группу потоков. Потоки можно группировать.
		System.out.println(mainThread.getThreadGroup());
		
//		Прекратить выполнение блока кода на определенное колличество времени (апример на 3с).
		System.out.println(mainThread.getName() + " Start");
		System.out.println("When you finish reading this text, the stream-thread will end.");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(mainThread.getName() + " End");
	}

}
