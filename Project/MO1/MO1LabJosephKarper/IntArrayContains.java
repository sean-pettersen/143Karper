package M0_IntArray.com.olympic.cis143.lab1.contains;

public class IntArrayContains {

    private int[] data;

    public IntArrayContains(int[] values) {
        if (values == null) {
            throw new RuntimeException("Values passed cannot be null");
        }
        this.data = values;
    }

    /**
     * Check to see if the data array contains the value that is passed.
     *
     * @param value The value to see if its contained in the array.
     * @return True if the value is found, else, false.
     */
    public boolean contains(int value) {
    if(this.data[value] == this.data[value])    
    {
    	return true;
    }
    else
    {
    	return false;
    }
    }
    }
