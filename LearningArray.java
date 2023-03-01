package arraylearning;

public class LearningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningArray learning=new LearningArray();
		learning.declare_array();
		int[]marks= {77,89,96,93,99};
		 System.out.print("before adding 2 ");
		learning.print_array(marks);
		marks = learning.add2_array(marks);
	    System.out.println("After adding 2 ");
	    for (int i = 0; i < marks.length; i++) {
	      System.out.print(marks[i] + " ");
	    }
		
	}

	private int[] add2_array(int[] marks) {
		// TODO Auto-generated method stub
		   for (int i = 0; i < marks.length; i++) {
			      marks[i] = marks[i] + 2;
			    }
			    return marks;
		
	}

	private void print_array(int[] marks) {
		// TODO Auto-generated method stub
		
		    // TODO Auto-generated method stub
		    for(int i=0; i<marks.length; i++)
		    {
		      System.out.print(marks[i]+"  ");
		    }
		    
		  
		
	}

	private void declare_array() {
		// TODO Auto-generated m
		 
		int[] marks = {77,83,92,93,99}; 
	    String[] names = new String[3]; 
	    names[0] = "zia"; 
	    names[1] = "karuppasami"; 
	    names[2] = "arunkumar"; 
	    
	    int[] values = new int[0]; 
	    System.out.println(marks.length);
	    System.out.println(names.length);
	    System.out.println(values.length);
		    
		  }
		
	}


