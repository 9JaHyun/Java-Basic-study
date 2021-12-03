# 타입 변환
* 두 변수의 타입이 다르다면, 상황에 따라 값을 저장할 수, 없을 수 있다.
* 이러한 방법을 타입 변환이라고 한다.

## 기본형 타입
* 기본적으로 같은 범위내에서 변환이 허용
* 정수형 <-> 정수형 / 실수형 <-> 실수형 ...

### 더 좁은 타입으로 형 변환 (Type Casting)
* 크기가 더 큰 자료형을 크기가 더 작은 자료형에 대입하는 것을 의미
* 어떻게 보면 크기가 큰 물건을 작은 공간에 구겨넣는 상식적이지 않은 행동이기 때문에 강제적으로 변환 명령이 필요하다 `타입 변수명 = (타입) 값`
* 이전의 데이터가 더 크기 때문에 변환과정에서 데이터의 손실이나 변형이 올 수 있다.
```JAVA
int a = 300;
byte b = (byte) a;
System.out.println(b); // 300이 overFlow 발생 -> 한바퀴 돌아 300-256
```

### 더 넓은 타입으로 형 변환 (Type Promotion)
* 타입 캐스팅과 반대로 크기가 작은 자료형에서 더 큰 자료형으로 대입하는 것을 의미
* 작은 물건을 큰 공간에 넣는 자연스러운 일이므로 명시적으로 `(타입)`을 사용하지 않아도 자동으로 변환이 가능하다.
```JAVA
int value = 10;
long value2= value;
```
* 아무 무리 없다.

### PLUS. 연산 도중 타입변환
* 서로 다른 두 타입이 연산중이라면, 둘 중 항상 큰 타입으로 변환이 이루어진다.
* 범위를 넘어서지 않도록 유지하기 위한 최소한의 안전장치.


## 참조 타입
* Inheritance(포함)관계에서만 가능하다. (상속, 구현 등...)

### UpCasting
* 서브클래스(child) -> 수퍼클래스(parent)로 변환하는 방식
* 모든 서브클래스들은 수퍼클래스들의 기능을 가지고 있기 때문에, 변환이 가능

### DownCasting
* 하지만, 수퍼클래스는 서브클래스의 기능을 가지고 있지 않을 수 있기 때문에 오류 발생 가능성이 높다.