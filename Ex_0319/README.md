jdk(java development kit)

확인 방법 ⇒ cmd창 → java -version

⇒  jdk 없다면

검색 창 openJDK → 맨 위에거 (oracle) → OpenJDK Archive → JDK 11 Releases → zip 다운 

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/df807236-25ec-490f-877e-73708445aa41/727ccf05-b857-441e-8ebd-8695eec987d5/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/df807236-25ec-490f-877e-73708445aa41/9372c4f1-6b08-4229-88e8-c509f032beab/Untitled.png)

---

환경 변수 새로 추가해주기

→ 시스템 변수 → 새로 만들기 → 이름 : JAVA_HOME / 위치: jdk 파일 위치

Path : %JAVA_HOME%\bin 추가 → 멘 위로 올리기

---

### 통합개발환경(IDE)
Intgrated Development Environment

→ 코딩, 디버깅, 컴파일, 배포 등 프로그램 개발에 관련된 모든 작업을 하나의 프로그램 안에서 처리하는 환경을 제공하는 소프트웨어

- 이클립스(eclipse) → 무료
- VisualStudio
- Intellij → 좋음 (근데 유료) / 무료버전은 java만 지원
- Pycham

---

### [eclipse.org](http://eclipse.org)

→ Download Packages → 2023-03 → web developers

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/df807236-25ec-490f-877e-73708445aa41/0c093592-559f-4ec8-967f-98be31b90812/Untitled.png)

---

### JAVA (OOP ; Object-Oriented Programming)

→ 객체 지향 언어 : 상태와 기능이 정의된 객체로 무언갈 한다.

→ 객체 지향 언어의 특징

- 캡슐화 (알약)
- 추상화 (추상적인 표현) → 구체화
- 상속화 (코드를 물려받아서 사용)
- 다형화 (다향한 형태로 표현한다)

→ java의 장점

→ 한번 작성을 하면 다른 운영체제에서도 작동을 잘한다.

---

### Eclipse

1. 프로젝트는 패키지를 만들어서 관리
2. 패키지 안에 클래스를 만들어서 관리
3. 클래스를 만들때 이름의 첫 글자는 반드시 대문자로
4. 프로그램을 실행하면  main영역 안에 있는 코드를 읽는다
5. 중괄호는 쌍으로 존재한다 
6. 명령이 끝나면 세미콜론(;)으로 끝내기

---

### JAVA 프로그래밍 구조

→ 자바 언어로 만들어진 파일을(.java) 컴파일을 하면서 기계어 파일인 바이트 코드(.class)파일이 생성된다. 이후 바이트 코드 파일을 JVM읽고 실행하게 된다.

- JVM( Java Virtual Machine)
    
    → 자바 프로그램 실행 환경을 만들어주는 소프트웨어 
    
    → 자바 코드를 컴파일 하여 바이트 코드로 만들면 JVM환경에서 실행된다.
    
    → JVM은 JRE에 포함되어있다
    
- 바이트 코드
    
    → 우리가 프로그래밍 언어로 명령을 한다고 해서 컴퓨터가 바로 알아들을 순 없다
    
    → 프로그래밍 언어를 1과0으로 이루어진 바이트 코드로 변환해주는 작업을 거쳐야 함
    
    → 이것을 바이트 코드라 부름
    
- 컴파일
    
    → 자바 파일을 바이트 코드로 바꾸는 일련의 과정
    
    → 컴파일러가 컴파일을 한다
    

---

### 프로그램의 구성

→ 컴퓨터 프로그램은 데이터(data)와 명령어(instruction)의 결합으로 구성된다.

### 데이터

→ 실제적인 값을 의미한다.

→ 숫자, 문자와 같은 단순한 데이터부터 소리, 사진, 영상 등의 복합적인 데이터가 있다.

→ 데이터는 언제든지 수정할 수 있어야 하며, 사용 목적에 따라 다른 형태로 가공할 수 있어야 한다.

→ 이러한 데이터는 컴퓨터의 메모리에 저장된다.

### 데이터의 출력

→ System.out.print(): 괄호 안의 데이터를 출력한다

→System.out.println(): 괄호 안의 데이터를 출력하고 줄을 바꿔준다(개행)

→ main → Ctrl+스페이스바 ( public static void main(String[] args)

→ sysout → Ctrl+스페이스바 (System.out.println())

### 자료형

- 기본자료형(문자, 숫자(정수, 실수),논리) 8가지
    
    
    | 자료형 | 키워드 | 메모리크기 | 표현범위 |
    | --- | --- | --- | --- |
    | 논리형 | boolean | 1bit |  true, false |
    | 문자형 | char | 2byte | 0 |
    | 정수형 | byte | 1byte | -128~127 |
    |  | short | 2byte | -32,768~ 32,767 |
    |  | int | 4byte | -21,4748,3638~21,4748,3637 |
    |  | long | 8byte | -900경~900경 |
    | 실수형 | float | 4byte | 기본값 0.0 |
    |  | double | 8byte | 기본값 0.0 |
    
- 참조자료형
    
    → 하나의 기본 자료형으로는 표현할 수 없는 것들을 표현할 때 사용하는 자료형
    
    → 개발자가 직접 추가하여 사용할 수도 있기 때문에 개수가 정해져 있지 않다
    
    → 대표적으로 String 이라는 문자열을 저장할 수 있는 참조 자료형이 있다.
