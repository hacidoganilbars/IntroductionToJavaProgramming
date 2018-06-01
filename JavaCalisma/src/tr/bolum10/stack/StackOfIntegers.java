package tr.bolum10.stack;
//UML
/****************************************
 *          StackOfIntegers             *
 *_____________________________________ *
 *                                      *
 * -elements: int[]                     *  
 * -size: int                           *
 *______________________________________*
 *                                      *
 * +StackOfIntegers()                   *
 * +StackOfIntegers(capacity: int)      *
 * +empty(): boolean                    * 
 * +peek(): int                         *
 * +push(value: int): void              * 
 * +pop(): int                          *
 * +getSize(): int                      *
 *                                      *
 ****************************************/
public class StackOfIntegers {

	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITIY = 16;

	public StackOfIntegers() {
		this(DEFAULT_CAPACITIY);
	}

	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	public void push(int value) {
		if (size >= elements.length) {
			int temp[] = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}

	public int pop() {
		return elements[--size];
	}

	public int peek() {
		return elements[size - 1];
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}

}
