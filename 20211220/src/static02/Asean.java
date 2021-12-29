package static02;

public class Asean {
	
    public int check;
    public int midTerm;
    public int finalTerm;
	
    private static int presentationScore;

public Asean(int check, int midTerm, int finalTerm) {
	
	this.check = check;
	this.midTerm = midTerm;
	this.finalTerm = finalTerm;
	
	presentationScore = 19;
	
}

public void showAseanInfo() {
	
	System.out.println("출석 점수: "+ check);
	System.out.println("중간고사 성적: "+ midTerm);
	System.out.println("기말고사 성적: "+ finalTerm);
	System.out.println("발표 성적: "+ presentationScore+"\n");

}

public static void showPrescore() {
	System.out.println("발표 성적: "+ presentationScore+"\n");
}
}
