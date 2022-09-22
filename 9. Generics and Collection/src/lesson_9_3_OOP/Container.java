package lesson_9_3_OOP;

public class Container <E extends Number>{						
	
	private Object element;

	public Container(E element) {				
		super();
		this.element = element;
	}

	public E getElement() {						
		return (E) element;						
	}

	public void setElement(E element) {	
		this.element = element;
	}

	@Override
	public String toString() {
		return "Container [element=" + element + "]";
	}	
	
}
