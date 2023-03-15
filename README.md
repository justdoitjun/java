# <과제>
## java
### java

***

- ## 기술 스택
  - ### Back-end
    - 자바 11
    - 오라클 버전
    - GIT
    
    ***


## 단계별 
1. ##first
        1. first
        2. second
        3. third
2. ##second
3. ##third

## 밑줄/ 기울기
*single asterisks* \n
_single underscores_ \n
**double asterisks** \n 
__double underscores__ \n

## 코드 넣는 방법
<pre>
<code>
    	@Override
	public Cust login(String id, String pwd)  throws Exception{
		Cust cust = null;
		cust = custDao.select(id);
		if(cust != null) {
			if(cust.getPwd().equals(pwd)) {
				System.out.println("Successful Login");
			}else{
				throw new Exception("Login Failed");
			}
		}else {
			throw new Exception("LoginFail");
		}
		return cust;
	}
</code>
</pre>

##링크
[Look over google websites! Just Google!](https://google.com, "google link")

##이미지
https://github.com/justdoitjun/java/blob/assignments/IMG_9342.JPG

(1) ws0228 : 2월 28일 과제는 Assignment 레퍼지토리와 구글 드라이브에 모두 올렸으나...업로드 경로가 올바르지 않아서 Java/Assignment 브랜치에 다시 올립니다...

(2) ws0309 : 3월 9일 과제는 Assignment 외에도 while문을 이용해서 심심해서 한번 더 기능을 추가해보았습니다. (게임을 반복시키는 것)

(3) ws0314 : 3월 14일 과제는 Cart 관련 DAO,Impl,DTO,SQL을 만들었습니다. \n
각각의 Test에서 중점적으로 Test하여 예외처리한 점은 다음과 같습니다. \n
    (1) Insert Test : a) 수량이 0이거나 음수인 경우 에러 b) 네트워크 오류 \n
    (2)SelectAll  Test : a) 불러올 내용이 없는 경우 오류처리  b) 네트워크 오류(존재하지 않는 ip주소) \n
    (3)Delete Test : a) 카트ID가 없는 경우 에러처리  b) 네트워크 오류(존재하지 않는 ip주소) (edited) \n
    등 입니다.
   

========과제 내용=======

ws0307
package 명: ws0307(또는 bank)
public class Account{
  private String accNo;
  private String name;
  private String accHolder;
  private String balance;
  //Constructor - 음수 예외 상황
  //계좌 정보 조회
  //잔액 조회
  //입금 - 음수 예외 상황
  //출금 - 잔액 부족 예외 상황, 음수 예외 상황
}
public class App {
  // 계좌 생성
  // 계좌 정보 조회
  // 계좌 입금
  // 계좌 출금
}
위의 내용을 구현 하시오

ws0309
UML을 기반으로 lotto 프로그램을 작성 하시오
1. 변수 설명
winningNum: HashSet<Integer>
당참 번호 1~25까지의 숫자 중 3개를 선정
prizeMoney: double
당첨 금액 랜덤하게 생성 ( 1 ~ 2000000000)
2 함수 설명
makeWinningNumberMoney(): void
당첨 번호와 당첨금을 생성 한다.
checkRanking(myNum: ArrayList<Integer>): int
본인이 입력한 숫자 3개를 argument로 입력 하면
몇개가 일치한지를 check 한후 등수를 리턴
등수는 자유롭게 설정
prizeMoney(grade: int): double
등수 정보를 입력 하면 당첨 금액을 리턴
당첨 금액 비율은 자유롭게 설정


ws0314
cart 테이블을 작성 하시고
CRUD 프로그램을 완성 하시오
cart 테이블 구조는 다음과 같습니다.
id, user_id, item_id, cnt, regdate
id는 자동 생성 됨
user_id는 cust id가 입력 됨
item_id는 상품의 id가 입력 됨
cnt는 개수
regdate는 등록 일자
