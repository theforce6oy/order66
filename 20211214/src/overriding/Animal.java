package overriding;

public class Animal {
	
	String specie;
	int big;
    boolean eatmeat;
    
    public void animalInfo(String s) {
    	specie = s;
    	
    	System.out.println("종: "+specie+"크기: "+big+
    			"육식여부: "+eatmeat);
    }
    public void howl() {
    	System.out.println("동물이 웁니다.");
    }
    
}
