package LabAssConstruct;

public class Example {	//Q20
    int x;
    
    Example() { // default constructor
        this(10);           // calls parameterized constructor
        this.show();        // calls method
    }
    
    Example(int a) { // parameterized constructor
        x = a;
    }
    
    void show() { // method
        System.out.println(x);
    }
    public static void main(String[] args) {
    	
    //Example s = new 	Example();
    	
    }
}
