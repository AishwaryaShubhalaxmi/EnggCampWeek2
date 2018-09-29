package com.mindtree.entity;

public class Test {
    private int tId;
    private String testName;
    private int cost;
  
    public int gettId() {
		return tId;
	}

	public Test(int tId, String testName, int cost) {
		super();
		this.tId = tId;
		this.testName = testName;
		this.cost = cost;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Test(){
    	
    }
    
   
}
