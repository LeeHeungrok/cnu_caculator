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
	
	@Override
	public boolean push(Object anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
}
