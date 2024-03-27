package ex3_array;

public class Ex1_array {
	public static void main(String[] args) {
		//배열(Array)
		//순서대로 번호가 붙은 원소들이 연속적인 형태로 구성된 구조
		//이렇게 여러 데이터를 담을 수 있는 구조를 자료구조(data Structure)라고 한다
		//배열을 사용하면 같은 자료형의 데이터들을 효율적으로 관리할 수 있다.
		
		//배열의 선언
		//자료형[] 배열명;
		//대괄호[]는 배열의 연산자를 의미한다.
		int[] arr;
		
		//null;
		//int num;
		//어떤 값을 가질지 알 수 없다.
		//따라서 변수를 만들 때, 어떤 값이 부여되는지 쉽게 알기위해
		//초기값을 부여하면서 선언하도록 했다.
		
		//배열의 경우 여러개의 데이터를 저장하기 위해 별도의 공간이 필요하다
		//배열을 선언만 하고 생성하지 않았을 경우, 시스템은 배열을 만들때 null이라는 키워드를 부여한다
		//이때 null의 의미는 "없다"라는 의미를 가진다
		//배열 변수는 만들어졌지만, 그안에 값을 담을 공간들이 생성되지 않았다.
		
		//배열의 생성
		//배열명 = new 자료형[크기(길이)];
		arr = new int[5];
		//배열은 new를 통해서 공간은 stack과 heap중에서 heap에 확보된다.
		
		//선언과 생성을 동시에 하는 것이 가능하다
		//자료형 배열명 = new 자료형[크기(길이)];
	
		//배열의 초기화
		//초기화를 통해 배열을 선언하면 실제 시스템 메모리에는
		//선언된 크기와 값 만큼 각각 독립적인 저장 공간이 연속적으로
		//배치되어 생성된다
		
		//이 방법은 배열을 최초로 선언할때만 가능
		//자료형[] 배열명 = {데이터,데이터,데이터,데이터}
		
		System.out.println(arr);
		//배열의 이름을 출력하면 
		//주소값을 반환한다
		//이처럼 값을 직접 배열에 저장하는 것이 아니라
		//주소값이 저장되어 해당 주소를 통해 실제 메모리에 접근한다
		//이런것을 참조변수라고 한다.
		
		//배열의 특징
		//배열 생성시 크기를 지정한다
		//배열 생성 후 공간의 크기를 늘리거나 줄일 수 없다.
		//생성된 배열과 같은 타입의 데이터만 저장이 가능하다.
		
		//인덱스(index)
		//배열을 만든 후에는 값을 넣거나 꺼내야 한다
		//배열은 각 공간마다 위치를 알려주는 위치값이 존재한다
		//배열이 지니는 값들의 위치를 인덱스(index)라고 부른다
		//인덱스(index)는 배열의 공간마다 붙혀진 번호로서
		//0부터 시작하여 순차적으로 증가한다
		
		//배열의 각각의 공간에 접근하는 법
		//배열명[index] = 데이터;
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("-------------------------");
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
		//배열을 처음 생성하면 데이터 타입별로 기본값이 주어진다
		//정수 : 0
		//실수 : 0.0
		//문자형 : ''
		//객체형 : null
		
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		
		int[] varArray = {1,2,3,4,5};
		
		System.out.println("intArray[0] : "+intArray[0]);
		System.out.println("intArray[1] : "+intArray[1]);
		
		System.out.println("strArray[0] : "+strArray[0]);
		System.out.println("strArray[1] : "+strArray[1]);
		
		System.out.println("varArray[0] : "+varArray[0]);
		System.out.println("varArray[1] : "+varArray[1]);
	}
}
