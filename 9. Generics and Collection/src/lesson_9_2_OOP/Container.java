package lesson_9_2_OOP;

//public class Container {						//Было
public class Container <E>{						//Стало
	
	private Object element;

//	public Container(Object element) {			//Было
//		super();
//		this.element = element;
//	}
	
	public Container(E element) {				//Стало
		super();
		this.element = element;
	}

//	public Object getElement() {				//Было
//		return element;
//	}
	
	public E getElement() {						//Стало
		return (E) element;						//Используем Downcasting
	}

//	public void setElement(Object element) {	//Было
//		this.element = element;
//	}
	
	public void setElement(E element) {	//Стало
		this.element = element;
	}

	@Override
	public String toString() {
		return "Container [element=" + element + "]";
	}	
	
}
