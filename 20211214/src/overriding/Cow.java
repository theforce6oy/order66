package overriding;

public class Cow extends Animal {
	
	private boolean killpersn;
	public String pattern;
	
    public void CowInfo() {
	System.out.println("종: "+specie+"크기: "+big+
			"육식여부: "+eatmeat+"줄무늬: "+pattern);
}
}