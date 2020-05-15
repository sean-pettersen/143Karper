package M0_IntArray.com.olympic.cis143.lab1.add;

import java.util.Arrays;


public class IntArrayAdd {

    private int[] data;

    public IntArrayAdd() {
        this.data = new int[0];
    }

    public int[] getData() {
        return this.data;
    }

    /**
     * This method will need to add an element to the end of an array.
     *
     * @param value The value to be added.
     */
    public void add(int value) { 
    	for(int i = 0; i < data.length; i++)
    	{
    		if(i <= 1)
    		{
    			data = Arrays.copyOf( data , data.length + 1);
    		    data[data.length -1] = 1;
    		}
    		else if(i <= 3)
    		{
    			data = Arrays.copyOf( data , data.length + 2);	
    		    data[data.length -3 ] = 1;
    		    data[data.length -2 ] = 2;
    		    data[data.length -1] = 3;
    		}
    		
    	}
    } 
   }