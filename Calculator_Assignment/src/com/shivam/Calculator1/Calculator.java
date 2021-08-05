package com.shivam.Calculator1;

import java.io.Serializable;

public class Calculator implements Serializable {
	private double setOperandOne;
	private String setOperation;
	private double setOperandTwo;
	private static double result;
	public Calculator() {

	}
	
	public Calculator(double setOperandOne, String setOperation, double setOperandTwo) {
		this.setOperandOne = setOperandOne;
		this.setOperation = setOperation;
		this.setOperandTwo = setOperandTwo; 
		
	}
	
	
//	method for performOperation
	
	public double performOperation() {
		if (setOperation.equals("+")) {
			result = (this.getSetOperandOne() + this.getSetOperandTwo());
			
		}
		else if (setOperation.equals("-")) {
			result = (this.getSetOperandOne() - this.getSetOperandTwo());
		}
		return result;
	}
	
	public void getResult() {
		this.performOperation();
		System.out.println(result);
	}

	/**
	 * @return the setOperandOne
	 */
	public double getSetOperandOne() {
		return setOperandOne;
	}

	/**
	 * @param setOperandOne the setOperandOne to set
	 */
	public void setSetOperandOne(double setOperandOne) {
		this.setOperandOne = setOperandOne;
	}

	/**
	 * @return the setOperation
	 */
	public String getSetOperation() {
		return setOperation;
	}

	/**
	 * @param setOperation the setOperation to set
	 */
	public void setSetOperation(String setOperation) {
		this.setOperation = setOperation;
	}

	/**
	 * @return the setOperandTwo
	 */
	public double getSetOperandTwo() {
		return setOperandTwo;
	}

	/**
	 * @param setOperandTwo the setOperandTwo to set
	 */
	public void setSetOperandTwo(double setOperandTwo) {
		this.setOperandTwo = setOperandTwo;
	}

	
}
