package polymorphism;

public class Doctor extends Person{
	
	private String hosName;
	private boolean covid;
	
	public Doctor(String name, int age, String hosName, boolean covid) {
		super(name,age);
	    this.hosName = hosName;
	    this.covid = covid;
	}
    public void showPerson() {
    	super.showPerson();
		System.out.println("병원명:"+hosName+" 백신여부:"+covid);
    }
    
}

