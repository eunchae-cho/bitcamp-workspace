# 11 - 클래스 필드와 클래스 메서드의 한계

**클래스 필드(스태틱 필드)** 는 클래스를 로딩할 때 생성된다.
클래스는 최초 사용 시점에 **한 번만 로딩** 되기 때문에 스태틱 필드도 **한 번만 생성**된다.

이번 훈련에서는 이런 스태틱 필드의 구동 특성을 이해하고 
그에 따른 한계가 무엇인지 알아 볼 것이다. 

## 훈련 목표

- 클래스 필드의 한계를 이해한다.
- 클래스 필드 상태에서 기능을 확장하는 방법과 그 문제점을 확인한다.

## 훈련 내용

- 프로젝트 참여자들이 의견을 나눌 게시판을 추가한다.
  - 게시글을 등록하고 목록을 조회한다.
- 여러 개의 게시판을 추가한다.
  - 질문/답변 게실판, 일반 게시판, 공지사항 등

## 실습

### 1단계 - 게시글 입력을 처리한다

다음과 같이 게시글을 입력하는 기능을 추가한다.

```console
명령> /board/add
[새 게시글]
번호? 1
제목? 제목입니다.
내용? 내용입니다.
작성자? 홍길동
게시글을 등록하였습니다.

명령>
```

- 게시글 관리 작업을 수행할 클래스 `BoardHandler`를 만든다.
- 게시글 데이터를 위한 새 데이터 타입 `Board`을 정의한다.
- 게시글 입력을 처리할 메서드 `add()`를 정의한다.
- App 클래스에 *게시글 입력 명령* `/board/add`에 대한 처리를 추가한다.

#### 작업 파일 

- com.eomcs.pms.handler.BoardHandler  클래스 추가
  - 백업: BoardHandler_a.java
- com.eomcs.pms.App 변경
  - 백업: App_a.java


### 2단계 - 게시글 목록 출력을 처리한다.

다음과 같이 게시물(번호, 제목, 등록일, 작성자, 조회수) 목록을 출력하는 기능을 추가한다.


```
명령> /board/list
[게시글 목록]
1, 제목1, 홍길동, 2020-01-10, 0
2, 제목2, 임꺽정, 2020-01-20, 12
3, 제목3, 유관순, 2020-01-30, 7
```

- 게시글에 등록일 `registeredDate`과 조회수 `viewCount` 필드를 추가한다.
- `add()`에서 게시글을 입력을 처리할 때 등록일과 조회수를 설정한다.
- 게시글 목록을 처리할 메서드 `list()`를 정의한다.
- App 클래스에 *게시글 목록 조회 명령* `/board/list`에 대한 처리를 추가한다.

#### 작업 파일 

- com.eomcs.pms.handler.BoardHandler.Board 중첩 클래스 변경 
  - 등록일 과 조회수를 저장할 필드를 추가한다
- com.eomcs.pms.handler.BoardHandler 클래스 변경
  - add() 메서드 변경
  - list() 메서드 추가
- com.eomcs.pms.App 변경
  - 백업: App_b.java


### 3단계 - 새 게시판을 추가한다.

`BoardHandler`의 `Board[]` 배열은 클래스 필드(스태틱 필드)이기 때문에 
한 개 게시판의 게시물 목록만 관리할 수 있다.
다른 게시판을 만들려면 새로 `BoardHandler`와 똑 같은 클래스를 만들어야 한다. 

다음과 같이 동작하도록 새 클래스를 정의한다.

```
명령> /board2/add
번호? 1
내용? 게시글1
저장하였습니다.

명령> /board2/add
번호? 2
내용? 게시글2
저장하였습니다.

명령> /board/add
번호? 100
내용? 게시글100
저장하였습니다.

명령> /board2/list
1, 게시글1                  , 2019-01-01, 0
2, 게시글2                  , 2019-01-01, 0

명령> /board/list
100, 게시글100              , 2019-01-01, 0
```

- `BoardHandler`를 복제하여 `BoardHandler2` 클래스를 정의한다.
- `/board2/add`와 `/board2/list` 명령을 처리하도록 App 클래스를 변경한다.

#### 작업 파일 

- com.eomcs.pms.handler.BoardHandler2 클래스 추가
- com.eomcs.pms.App 변경
  - 백업: App_c.java
  
### 4단계 - 새 게시판을 4개 더 추가한다.

다음과 같이 동작하도록 새 클래스를 정의한다.

```
명령> /board3/add
...
명령> /board4/add
...
명령> /board5/add
...
명령> /board6/add
...
명령> /board3/list
...
명령> /board4/list
...
명령> /board5/list
...
명령> /board6/list
...
```

#### 작업 파일 

- com.eomcs.pms.handler.BoardHandler3 클래스 추가
- com.eomcs.pms.handler.BoardHandler4 클래스 추가
- com.eomcs.pms.handler.BoardHandler5 클래스 추가
- com.eomcs.pms.handler.BoardHandler6 클래스 추가
- com.eomcs.pms.App 변경

## 실습 결과

- src/main/java/com/eomcs/pms/handler/BoardHandler.java 추가
- src/main/java/com/eomcs/pms/handler/BoardHandler2.java 추가
- com.eomcs.pms.handler.BoardHandler3 클래스 추가
- com.eomcs.pms.handler.BoardHandler4 클래스 추가
- com.eomcs.pms.handler.BoardHandler5 클래스 추가
- com.eomcs.pms.handler.BoardHandler6 클래스 추가
- src/main/java/com/eomcs/pms/App.java 변경







# 12 - 인스턴스 필드와 인스턴스 메서드가 필요한 이유

**인스턴스 필드(non-static field)는 new 명령을 통해 Heap 영역에 생성된다. 개별적으로 다뤄야할 값이라면 인스턴스 필드로 선언하라.

인스턴스 필드를 다루는 메서드는 **인스턴스 메서드(non-static method)** 로 선언한다. 인스턴스 메서드는 호출할 때 반드시 유효한 레퍼런스(인스턴스 주소)가 있어야 한다. 레퍼런스는 인스턴스 메서드의 내장(build-in) 로컬 변수인 this에 저장된다.

이번 훈련에서는 클래스 필드/메서드 대신 인스턴스 필드/메서드를 사용하여 여러 개의 게시글을 다루는 연습을 할 것이다.
이를 통해 인스턴스 필드/메서드의 쓰임새를 확인한다.

## 훈련 목표

- 인스턴스 필드와 인스턴스 메서드를 사용할 수 있다.
- 스태틱 필드와 인스턴스 필드의 차이점과 용도를 설명할 수 있다.
- 스태틱 메서드와 인스턴스 메서드의 차이점과 용도를 설명할 수 있다.

## 훈련 내용

- 여러 개의 게시판을 다루기 위해 BoardHandler의 필드와 메서드를 인스턴스 멤버로 전환한다. 
- 클래스 메서드와 인스턴스 차이점을 알고 다룬다.
- MemberHandler를 변경하고 ProjectHandler, TaskHandler 필드에 MemberHandler의 새로운 객체가 아닌 기존 정보를 담은 객체를 추가한다.

## 실습

### 1단계 - BoardHandler의 스태틱 멤버를 인스턴스 멤버로 전환한다.
- 게시글 목록(Board 인스턴스 목록)을 저장할 배열을 인스턴스 필드로 변경한다.
- 등록된 게시글 개수를 저장하는 변수를 인스턴스 필드로 변경한다.
- 게시글 등록과 목록 조회를 다루는 메서드를 인스턴스 메서드로 변경한다.

#### 작업

- com.eomcs.pms.handler.BoardHandler 변경

### 2단계 - BoardHandler의 인스턴스 멤버를 사용하여 게시글 등록/목록조회를 처리한다.
- 게시글을 보관할 인스턴스를 생성한다.
- 인스턴스를 가지고 등록과 목록조회를 처리한다.

### 작업
- com.eomcs.pms.App 변경

### 3단계 - 여러 개의 게시판을 다룰 때에도 BoardHandler를 사용한다.

- 각 게시판을 위한 인스턴스 변수를 따로 준비한다.
- 이전에 만들었던 BoardHandlerX 클래스를 삭제한다.

#### 작업
- com.eomcs.pms.App 변경
- com.eomcs.pms.handler.BoardHandler2 삭제
- com.eomcs.pms.handler.BoardHandler3 삭제
- com.eomcs.pms.handler.BoardHandler4 삭제
- com.eomcs.pms.handler.BoardHandler5 삭제
- com.eomcs.pms.handler.BoardHandler6 삭제

### 4단계 - 회원 관리와 프로젝트 관리, 작업 관리에도 향후 확장성을 고려해 인스턴스 멤버로 전환한다.
- MemberHandler의 스태틱멤버를 인스턴스 멤버로 전환한다.
- ProjectHandler의 스태틱멤버를 인스턴스 멤버로 전환한다.
- TaskHandler의 스태틱멤버를 인스턴스 멤버로 전환한다.

#### 작업
- com.eomcs.pms.App 변경
- com.eomcs.pms.handler.MemberHandler 변경
- ProjectHandler가 담을 의존객체 MemberHandler에 인스턴스를 가리킬 레퍼런스 추가한다.
- com.eomcs.pms.handler.ProjectHandler 변경
- Handler가 담을 의존객체 MemberHandler에 인스턴스를 가리킬 레퍼런스 추가한다.
- com.eomcs.pms.handler.TaskHandler 변경

## 실습 소스 및 결과

- src/main/java/com/eomcs/pms/handler/BoardHandler.java 변경
- src/main/java/com/eomcs/pms/handler/MemberHandler.java 변경
- src/main/java/com/eomcs/pms/handler/ProjectHandler.java 변경
- src/main/java/com/eomcs/pms/handler/TaskHandler.java 삭제
- src/main/java/com/eomcs/pms/handler/BoardHandler2.java 삭제
- src/main/java/com/eomcs/pms/handler/BoardHandler3.java 삭제
- src/main/java/com/eomcs/pms/handler/BoardHandler4.java 삭제
- src/main/java/com/eomcs/pms/handler/BoardHandler5.java 삭제
- src/main/java/com/eomcs/pms/handler/BoardHandler6.java 삭제
- src/main/java/com/eomcs/pms/App.java 변경




# 13 - 생성자가 필요한 이유

**생성자(contructor)** 는 인스턴스를 사용하는데 문제가 없도록
인스턴스 필드를 유효한 값으로 초기화시키는 일을 한다.

이번 훈련에서는 *생성자* 를 사용하지 않는 경우의 문제점을 확인하고
*생성자* 를 적용해야하는 상황을 경험해보자.


## 훈련 목표

- 인스턴스의 필드를 유효한 값으로 초기화시키지 않을 때 문제점을 확인한다.
- 생성자의 용도 이해한다.
- 생성자를 이용하여 인스턴스를 사용하기 전에 필요한 값들을 준비한다.

## 훈련 내용

- 생성자를 통해 의존객체를 강제로 주입하게 만든다.
- `ProjectHandler` 와 `TaskHandler` 에서 사용할 `MemberHandler` 를 강제로 주입하게 한다.


## 실습

### 1단계 - 의존객체를 주입하지 않았을 때 발생되는 문제를 확인한다. 

- `App` 클래스에서 `ProjectHandler` 을 생성할 때 의존 객체인 `MemberHandler` 를 처리하는 코드를 주석으로 처리한다. 
- `App` 클래스에서 `TaskHandler` 을 생성할 때 `MemberHandler` 를 처리하는 주석으로 처리한다.
-  *프로젝트 등록* 과 *작업 등록* 을 테스트하여 문제점을 확인한다.

#### 작업 파일
- com.eomcs.pms.App 변경

### 2단계 - 생성자를 이용하여 의존 객체를 강제로 주입하게 한다.
- `ProjectHandler` 의 인스턴스를 생성할 때 의존 객체를 반드시 주입하도록 기본 생성자 대신에 의존 객체를 파라미터로 받는 생성자를 추가한다.
- `TaskHandler` 의 인스턴스를 생성할 때 의존 객체를 반드시 주입하도록 기본 생성자 대신에 의존 객체를 파라미터로 받는 생성자를 추가한다.
- `App` 클래서에서 `ProjectHandler` 객체를 생성할 때 생성자 파라미터에 의존 객체를 넘겨준다.
- `App` 클래서에서 `TaskHandler` 객체를 생성할 때 생성자 파라미터에 의존 객체를 넘겨준다

#### 작업 파일
- com.eomcs.pms.App 변경
- com.eomcs.pms.Handler.ProjectHandler 생성자 추가
- com.eomcs.pms.Handler.TaskHandler 생성자 추가
- App_a 백업

## 실습 결과

- src/main/java/com/eomcs/lms/handler/BoardHandler.java 변경
- src/main/java/com/eomcs/lms/handler/LessonHandler.java 변경
- src/main/java/com/eomcs/lms/handler/MemberHandler.java 변경
- src/main/java/com/eomcs/lms/App.java 변경





# 14 - UI 처리하는 코드와 데이터 처리하는 코드를 분리하기

객체지향 프로그래밍을 할 때 다음 두 가지를 명심해야 한다.
- Low Coupling
- High Cohesion

**관계도를 낮추기(low coupling)** 란? 한 클래스가 많은 클래스에 의존하는 구조로 작성하면 의존 클래스가 변경될 때마다 영향을 받기 때문에 유지보수가 좋지 않다.
그래서 가능한 의존하는 클래스의 접점을 줄이는 구조로 만드는 것이 좋다.
(관계도 낮춤 -> 의존 클래스 변경에 둔감 -> 코드 변경이 줄어듦)

**응집력 강화(high cohesion)** 란? 한 클래스가 너무 다양한 역할을 수행하면 클래스의 코드가 커지고 변경 사항이 잦아지기 때문에 유지보수가 좋지 않다. 
그래서 가능한 한 클래스가 한 개의 역할을 수행하게 만드는 것이 유지보수에 좋다.
역할을 작게 쪼개게 되면 해당 클래스를 다른 프로젝트에서 재사용하기 쉽다.
(응집력 강화 -> 클래스 잘게 쪼갬 -> 교체 용이, 재사용성 높아짐) 

응집력 강화를 연습해본다. 기존의 XxxHandler 클래스는 사용자에게 출력하고 사용자의 입력을 받는 즉 사용자와 소통하는 역할을 수행할 뿐만 아니라 사용자가 입력한 데이터를 관리하는 일도 수행한다.
XxxHandler의 역할을 잘게 쪼개어 전문화시킬 것이다.
사용자의 소통을 담당하는 **UI 역할** 클래스와 데이터 처리를 담당하는 **DAO(Data Access Object) 역할** 클래스로 분리할 것이다.
이렇게 하면 추후 데이터 처리 부분을 다른 클래스로 교체하기 쉬워진다.
예를 들면 지금은 데이터를 배열에 보관하고 있지만 나중에는 파일이나 DBMS에 보관할 수도 있다. 또한 지금은 CLI(Command Line Interface) 방식으로 UI를 처리하고 있지만 나중에는 웹으로 처리하는 클래스로 교체하기가 쉬워진다.

## 훈련 목표

- 캡슐화 기법을 이용하여 데이터 처리 코드를 별개의 클래스로 분리할 수 있다.
- 배열 복제를 통해 배열의 크기를 늘릴 수 있다.
- 역할에 따라 클래스를 분리하는 방법과 이점을 이해한다.  

## 훈련 내용

- XxxHandler 클래스를 UI 처리와 데이터 처리 역할자로 분리한다.

## 실습

### 1단계 -BoardHandler에서 데이터 처리 코드를 분리하라.

- `BoardHandler` 에서 데이터 처리 코드를 분리하여 `BoardList` 클래스로 정의한다.
- `BoardList` 의 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.
- `BoardList`에 Board 객체를 등록하는 add()를 정의한다.
- `BoardList` 에 데이터 목록을 리턴하는 toArray() 메서드를 제공한다.
- `BoardHandler` 에서 `BoardList` 를 분리하여 입,출력을 따로 만든다.

#### 작업 파일
- com.eomcs.pms.handler.BoardList 클래스 추가
- 백업: BoardList.java.01
- com.eomcs.pms.handler.BoardHandler 클래스 변경
- 백업: BoardHandler.java.01

### 2단계 - Board 클래스를 패키지 멤버 클래스로 전환한다.

- 여러 클래스에서 공유하는 클래스는 중첩 클래스 정의하기 보다는 패키지 멤버 클래스로 정의하면 관리하기가 더 쉽다.
- BoardList 클래스에서 Board클래스로 분리하여 패키지 멤버 클래스로 만든다.
- Board나 Member 객체처럼 데이터 타입 역할을 하는 클래스를 ***도메인(domain)*** 클래스라 부른다.
- 도메일 클래스를 저장할 패키지를 따로 생성한다.

#### 작업 파일
- com.eomcs.pms.domain 패키지를 생성
- com.eomcs.pms.domain.Board 클래스 생성
- com.eomcs.pms.domain.BoardHandler 클래스 변경
- com.eomcs.pms.domain.BoardList 클래스 변경


### 3단계 - MemberHandler 클래스를 UI 처리와 데이터 처리 클래스로 분리한다.

- BoardHandler와 마찬가지로 데이터 처리 역할을 별도의 클래스로 분리한다.
- `Member` 도메인 클래스를 정의한다.
- `Member` 클래스를 추가하고 `MemberHanlder` 에서 데이터 처리 코드를 가져온다.
- `MemberHanlder` 클래스는 `MemberList` 에서 정보를 갖고 처리한다.


#### 작업 파일
- com.eomcs.pms.domain.Member 클래스 생성
- com.eomcs.pms.handler.MemberList 클래스 추가
- com.eomcs.pms.handler.MemberHandler 클래스 변경

### 4단계 - ProjectHandler 클래스에서 데이터 처리 코드를 별도의 클래스로 분리한다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/pms/domain/Board.java 추가
- src/main/java/com/eomcs/pms/domain/Member.java 추가
- src/main/java/com/eomcs/pms/domain/Project.java 추가
- src/main/java/com/eomcs/pms/handler/BoardHandler.java 변경
- src/main/java/com/eomcs/pms/handler/MemberHandler.java 변경
- src/main/java/com/eomcs/pms/handler/ProjectHandler.java 변경





# 15 - 인스턴스 연산자와 메서드, 그리고 세터(Setter)/게터(Getter)

**인스턴스 메서드** 는 인스턴스의 필드를 다루는 일을 한다.
즉 인스턴스 값을 다루는 **연산자(operator)** 역할을 수행한다.
그래서 OOA/D(Object-Oriented Analysis/Design)에서는 메서드를 오퍼레이터라고 부른다.

이번 훈련에서는 인스턴스 메서드를 **연산자** 관점에서 바라보고 이해해보자.
인스턴스 필드의 값을 외부에서 직접 접근하지 못하게 막고 대신 세터(setter), 게터(getter) 메서드를 통해 값을 조회하고 변경하자.

## 훈련 목표

- 변수와 연산자 관점에서 인스턴스와 메서드를 이해한다.
- 메서드를 활용하여 인스턴스 값을 다루는 연산자를 정의할 수 있다.
- 캡슐화의 의미를 이해하고, 셋터/겟터를 만들 수 있다.


## 훈련 내용

- 게시글, 회원 정보, 프로젝트 정보, 작업 정보를 다루는 세터/게터를 정의한다.
- 세터/게터를 사용하여 인스턴스 필드값을 조회하고 변경한다.


## 실습

### 1단계 - MemberHandler의 인스턴스 필드를 비공개로 전환한다.

- MemberHandler를 의존객체로 사용하는 클래스(ProjectHandler, TaskHandler)에서 MemberHandler의 필드 값을 임의로 조작할 수 없도록 필드를 비공개(private)로 전환한다.

#### 작업 파일
- com.eomcs.pms.handler.MemberHandler 변경

### 2단계 - Board 인스턴스의 값을 다룰 연산자를 정의한다.

- Board 클래스의 인스턴스 필드를 패키지 공개(default) 모드에서 비공개(private)모드로 전환한다.
- 대신 세터/게터를 정의하여 필드 값을 다룰 수 있도록 한다.

- Lesson.java
    - 인스턴스 변수(필드)를 비공개(private)로 전환한다.
    - 값을 설정하고 리턴해주는 세터/게터를 정의한다.
- LessonHandler.java
    - Lesson 인스턴스에 값을 넣고 꺼낼 때 세터/겟터를 사용한다.

### #작업 파일
- com.eomcs.pms.handler.BoardHandler$Board 클래스 변경
- com.eomcs.pms.handler.BoardHandler 클래스 변경


## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/domain/Lesson.java 변경
- src/main/java/com/eomcs/lms/domain/Member.java 변경
- src/main/java/com/eomcs/lms/domain/Board.java 변경
- src/main/java/com/eomcs/lms/handler/LessonHandler.java 변경
- src/main/java/com/eomcs/lms/handler/MemberHandler.java 변경
- src/main/java/com/eomcs/lms/handler/BoardHandler.java 변경
