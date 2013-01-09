
package Calculator;

import java.util.ArrayList;



public abstract class Calculator implements Calc
{

    private ArrayList<Double> numbers;
    private double modifier;
    private short op;

    public Calculator() 
    {
        this.numbers=new ArrayList<Double>();
    }


    public void addValue(double value) 
    {
        this.numbers.add(value);

    }


    public void removeValue(double value) 
    {
        numbers.remove(value);
    }


    public abstract ArrayList<Double> processCalc(short op);
    

    public String toString() 
    {
    	String txt="";
        for(int i=0;i<this.getNumbers().size();i++){
        	txt+=this.getNumbers().get(i);
        	txt+="\n";
        }
		return txt;
    }


	/**
	 * @return the numbers
	 */
	private ArrayList<Double> getNumbers() {
		return numbers;
	}


	/**
	 * @param numbers the numbers to set
	 */
	private void setNumbers(ArrayList<Double> numbers) {
		this.numbers = numbers;
	}


	/**
	 * @return the op
	 */
	public short getOp() {
		return op;
	}


	/**
	 * @param op the op to set
	 */
	public void setOp(short op) {
		this.op = op;
	}


	/**
	 * @return the modifier
	 */
	public double getModifier() {
		return modifier;
	}
	
	public void setModifier(double modifier) 
    {
        this.modifier=modifier;
    }
}
