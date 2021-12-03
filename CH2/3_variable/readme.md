# 변수
* JAVA에는 여러 프로그램이 사용할 수 있도록 공용 메모리 공간이 존재
* 변수는 값을 저장할 수 있는 메모리의 특정 주소에 붙이는 이름.
* 프로그램은 변수를 통해 메모리의 특정 주소에 값을 저장하고 읽을 수 있다.
* 특정 주소에 이름을 붙이는 것이기 때문에 당연히 이름이 겹치면 주소가 겹치게 되므로 사용하지 못한다.

## 추가사항
``` JAVA
String var = "foo";
```
* 해당 코드를 컴파일 및 디컴파일 실시를 해보자.


## 변수 선언
* 메모리의 특정 주소에 이름을 붙이겠다는 의미.
* 결론적으로 값을 저장할 공간을 확보하고 이름을 붙이겠다는 말.


### 선언 방법
* 구조는 간단하다. `타입 변수명;` 구조로 입력하면 끝
``` JAVA
String var;
int var2;
double var3;
...
```

## 초기화
* 사무실을 이사하면 기존에 남아있던 잡동사니들을 모조리 치운 후 필요한 가구를 채워야 한다. 변수도 마찬가지!
* 변수의 저장 공간이 확보되어 있으나, 여러 프로그램에 의해 공유되어왔기 때문에 이 공간 안에 어떠한 값이 저장되어 있는지는 알 수 없다. 
* 그래서 잡동사니를 치우고 필요한 가구를 채우는 과정이 필요한데 이를 초기화 과정이라고 한다.
* 참고로 초기화를 하지 않은 채 컴파일을 실시하면 `Error:(10, 28) java: variable a might not have been initialized`라는 컴파일 에러가 발생하게 된다.
* 참고로 지역변수 or 기본형 타입은 꼭 초기화를 실시해주어야 한다.

* 각 메모리 주소에는 하나의 값 밖에 입력되지 못한다.

### 초기화 방법.
* 변수를 저장할 때에는 대입 연산자 `=`를 사용.
* 수학에서는 등호의 의미를 가지지만, 자바 언어에서는 오른쪽의 값을 저장한다는 의미!
```JAVA
var = "Hello";
var2 = 10;
```
* 물론 한줄에 하는 것도 가능하다.
```JAVA
String var = "Hello";
int var2 = 10;
```


## 변수의 스코프와 라이프타임.
### 스코프와 라이프타임
* 스코프는 해당 변수를 사용할 수 있는 영역범위
* 라이프타임은 해당 변수가 메모리에 언제까지 살아있느냐를 의미.
* 변수의 스코프에 따라 인스턴스변수, 클래스 변수, 로컬 변수로 나뉨

### 인스턴스 변수
* 클래스 안에 선언되어 있고, 따로 method, block안에서 선언되지 않은 변수
* scope : static method를 제외한 전체
* lifetime  : 인스턴스 생성 ~ 클래스를 인스턴스화한 객체가 메모리에서 사라질 때 까지

### 클래스 변수
* 클래스 안에 선언되어 있고, 어떠한 메서드나 블럭 안에서 선언되지 않았으며 static 키워드가 포함되어 있는 변수
* JVM 클래스로딩 시점에 메모리에 입력(클래스가 메모리에 올라갈 때)
* scope : 클래스 전체
* lifetime : 클래스가 메모리에 올라갈 때 ~ 프로그램 종료시 까지 

### 로컬 변수
* 인스턴스 변수, 클래스 변수가 아닌 모든 변수
* scope : 변수가 선언된 block 내부
* lifetime : 변수가 선언된 block 내부에서 작동하는 동안.
```JAVA
public class ScopeAndLifetime {
    int num1, num2;             // Instance Var
    static int result;          // Class Var
    int add(int a, int b){      // Local Var
        num1 = a;
        num2 = b;
        return a+b;
    }
}
```