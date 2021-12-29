import java.util.Arrays;

public class Array01_146p {

	public static void main(String[] args) {
		
		// 배열은 일반 변수와 달리 하나의 변수에 여러값을 입력가능하고
		// 자료형에 []를 붙이는 것으로 선언한다.
		// 크기를 정해 생성할수있고 정하지 않고 생성할수도있다.
		// 설정된 크기 이상으로 자료를 담을 수 없다.
		// 배열의 크기는 "길이"라 표현.
		// 배열명.length를 이용해 배열크기를 알 수 있다.
		
		// 배열의 선언 1(길이 확정x)
		int a[]= {1,2,3,4};
		System.out.println(Arrays.toString(a));
		
		// 배열의 선언 2(길이 확정x)
	    double b[]= {5,6,7,8,9};
	    System.out.println(Arrays.toString(b));
	    
	    // 배열의 생성(길이 확정) // 자동으로 0이 채워짐.
	    int c[]= new int[10];
	    System.out.println(Arrays.toString(c));
	    
	    // 배열의 길이는 .length로 알 수 있다.
	    System.out.println(a.length);
	    System.out.println(b.length);
	    System.out.println(c.length);

	}

}
