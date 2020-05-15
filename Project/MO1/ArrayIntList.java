
public class ArrayIntList 
{
    private int[] elementData;
    private int size;
    
    public ArrayIntList() {
    	this(10);
    }
    
    public ArrayIntList(int capacity) {
    	elementData = new int[capacity];
    }
    
    
    
    //adds an integer at the end of the list
    public void add(int value) {
    	elementData[size] = value;
    	size++;
    }
    
    //adds an integer to a specified index
    public void add(int index, int value) {
    	for (int i = size; i > index; i--) {
    		elementData[i] = elementData[i - 1];
    	}
    	elementData[index] = value;
    }
    
    //returns the value of the index that is entered
    public int get(int index) {
    	return elementData[index];
    }
    
    //returns the index of the entered value if it is inside the list
    public int indexOf(int value) {
    	
    	int foundAt = -1;
    	for (int i = 0; i < size; i++) {
    		if (value == elementData[i]) {
    			foundAt = i;
    			break;
    		} 
    	}
    	return foundAt;
    	
    }
    
    //removes the value at the specified index
    public void remove(int index) {
    	for (int i = index; i < size; i++) {
    		elementData[i] = elementData[i + 1];
    	}
    	size--;
    	elementData[size] = 0;
    }
    
    //removes all indexes of the value specified
    public void removeAll(int value) {
    	for (int i = 0; i < size; i++) {
    		while (value == elementData[i]) {
    			remove(i);
    		}
    	}
    }
    
    //Sets an integer at a specified index of the array
    public void set(int index, int value) {
    	elementData[index] = value;
    }
    
    public int size() {
    	return this.size;
    }
    
    //outputs a string representation of the list contents
    public String toString() {
    	if (size == 0) {
    		return "[]";
    	} else {
    		    String result = "[" + elementData[0];
    		    for (int i = 1; i < size; i++) {
    		    	result += ", " + elementData[i];
    		    }
    		    result += "]";
    		    return result;
    	}
    }
    
    //adds values of one list to another list
    public void addAll(ArrayIntList other) {
    	for (int i = 0; i < other.size(); i++) {
    		this.add(other.get(i));
    	}
    }
    
    //flips the array list so that the values are displayed in reverse order
    public void reflect() {
    	for (int i = size - 1; i >= 0; i--) {
    		this.add(this.get(i));
    	}
    }
    
    private boolean same;
    public boolean equals(Object obj) {
    	if (!(obj instanceof ArrayIntList)) {
    		return same = false;
    	}
    	if (obj == null) {
    		return same = false;
    	}
    	ArrayIntList other = (ArrayIntList)obj;
    	for (int i = 0; i < size; i++) {
    		if (this.get(i) == other.get(i)) {
    			same = true;
    		} else {
    			same = false;
    		}
    		//return this.get(i) == other.get(i);
    	}
    	return same;
    }
    
    //compares one list to another list that is passed in, returns 0 if both are the same
    public int compareTo(ArrayIntList obj) {
    	
    	int isEqual = 1;
    	if (obj == null) {
    		throw new NullPointerException();
    	}
    	if (this.size == obj.size) {
    		System.out.println("Same size, checking for data");
    		for (int i = 0; i < size; i++) {
    			System.out.println("Iteration: " + i + " Data: "+ obj.get(i));
    			
    			//if value of internal list is less than the list being compared, returns a negative value of the internal list index + 1
    			//if value of internal list is greater than the list being compared, returns the value of the internal list index + 1
    			if (this.elementData[i] == obj.elementData[i]) {
    				isEqual = 0;
    			} else if (this.elementData[i] < obj.elementData[i]) {
    				System.out.println("Index: " + this.indexOf(this.elementData[i]) + " of internal list is smaller");
    				return -this.elementData[i] + 1;
    			} else {
    				System.out.println("Index: " + this.indexOf(this.elementData[i]) + " of internal list is bigger");
    				return this.elementData[i] + 1;
    			}
    		}
    		//if both lists aren't the same size, returns the internal list's size as a negative value + 1 if internal list is smaller than the one being compared to
    		//if the internal list is larger than the one being compared to, return the size of the comparable list + 1
    	} else if (this.size < obj.size) {
    		System.out.println("Internal list is smaller");
    		return -this.size + 1;
    	} else {
    		System.out.println("Internal list is bigger");
    		return obj.size + 1;
    	} 
    	
    	return isEqual; 
    }
    
    
}
