//	Как хранить ссылку на объект любого типа данных?
//	Объявляем поле типа Object, котоорый будет инрать роль хранилища для одного объекта произвольного типа.
//	Объявляем конструктор, который позволит инициализировать это поле.
//	Объявляем методы получения и установки.
//	Объявляем метод toString.

package lesson_9_1_OOP;

public class Container {
	
	private Object element;

	public Container(Object element) {
		super();
		this.element = element;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "Container [element=" + element + "]";
	}	
	
}
