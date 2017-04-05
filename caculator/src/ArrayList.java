public class ArrayList<T> implements Stack {
	private static final int DEFAULT_MAX_STACK_SIZE = 5;
	private int _maxSize;
	private int _top;
	private T[] _elements;
	
	public ArrayList() {
		this._maxSize = DEFAULT_MAX_STACK_SIZE;
		this._top = -1;
		this._elements = (T[]) new Object[DEFAULT_MAX_STACK_SIZE];
	}
	
	public ArrayList(int maxSize) {
		//initialize _maxSize to custom max variable
		//initialize _top to -1
		//initialize _element array's type to Object
		this._maxSize = maxSize;
		this._top = -1;
		this._elements = (T[]) new Object[maxSize];
	}
	
	public boolean isFull() {
		//check _top that it is full
		return (this._top == this._maxSize - 1);
	}
	
	public int size() {
		//check elements length to check _top
		return this._top + 1;
	}
	
	@Override
	public boolean push(Object newElement) {
		if (this.isFull()) {
			return false;
		}
		else {
			this._top++;
			this._elements[this._top] = (T)newElement;
			return true;
		}
		return false;
	}

	@Override
	public Object pop() {
		if (this.isEmpty()) {
			return null;
		}
		else {
			return this._elements[this._top--];
			//decrement _top
		}
	}

	@Override
	public Object peek() {
		if (this.isEmpty()) {
			return null;
		}
		else {
			return this._elements[this._top];
		}
	}

	@Override
	public boolean isEmpty() {
		return (this._top == -1);
	}

	@Override
	public void clear() {
		this._top = -1;
		this._elements = null;
	}
	
	public T findElementByOrder(int order) {
		if (this.isEmpty()) {
			return null;
		}
		else {
			return this._elements[order];
		}
	}
}
