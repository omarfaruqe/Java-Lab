package view;
public class SquareFactory implements IShapeFactory {

	@Override
	public IShape makeShape() {
		// TODO Auto-generated method stub
		return null;
	}
	
	double getArea(String l){
		double len = Double.parseDouble(l);
    	return len*len;
    }
	/*
	class AnonymousDemo 
	{ 
	    double sidlen;
	    double getArea(){
	    	return sidlen*sidlen;
	    }
	} 
	void paint(){
		
	}
	//SingleTon class
	  private static SquareFactory myObj;
	    /**
	     * Create private constructor
	     
	  SquareFactory(){
	         
	  }
	    /**
	     * Create a static method to get instance.
	     
	    public static SquareFactory getInstance(){
	        if(myObj == null){
	            myObj = new SquareFactory();
	        }
	        return myObj;
	    }

	    public void getSomeThing(){
	        // do something here
	        System.out.println("I am here....");
	    }
	     
	    public static void main(String a[]){
	    	SquareFactory st = SquareFactory.getInstance();
	        st.getSomeThing();
	    }
	    */
}
