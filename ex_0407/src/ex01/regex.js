//한글, 영문 대/소문자만 허용하는 정규식
//한글 : 가-힣

//정규표현식
//주어진 문자열에서 특정 패턴을 찾거나 검사하거나 대체할 때 사용하는 
//특수한 문법이다.
//주로 무자열 유효성 검사,검색, 치환등에 쓰인다.

//정규표현식은 /정규표현식 의 모양으로 작성한다.
////^문자열$/ ->^&문자열이 정확히 패턴과 일치해야 한다.
//^ 문자열의 시작
//& -> 문자열의 끝

var regex = /abc/ //문자열 안에 abc가 있는지 찾는다.
regex.test("abc"); //true;
regex/("123abc456") //true;
//"Abc"가 문자열의 어디에 있는 포지 포함만 됨되면

var regex = /^abc$/;
regex.text("abc")//true; 
regex.test("123abc345"); //false;
//문자열이 정확히 abc인지 판별
//앞뒤로 다른 글자가 있으면flase]]

//. : 아무것문자 한 글자
//h(아무글자)t
var regex=/h.t/;
regex.test("hat"); //true
regex.test("hit"); //true
regex.text("hoot"); //false

//* : 바로앞의 문자가 0번이상 반복
var regx = /ab*c/
regex.test("abc") //true
regex.test("abbc") //true
regex.test("abbbc") //true

//+ : 바로 앞의 문자가 1번이상 반복
var regx = /ab+c/
regex.test("ac") //false
regex.test("abc") //true
regex.test("abbc") //true
regex.test("abbbc") //true

//? : 바로 앞의 문자가 0번 또는 1번만
var regx = /ab?c/
regex.test("ac") //true
regex.test("abc") //true
regex.test("abbc") //false

//{n} 정확히 n번 반복
var regex = /ab{3}c/
regex.test("abc"); //false
regex.test("abbc"); //false
regex.test("abbbc"); //true

//{n,m} : 바로 앞에 있는 문자를 n번이상 m번 이하 반복
var regex = /ab{2,4}c/
regex.test("abc"); //false
regex.test("abbc"); //true
regex.test("abbbc"); //true
regex.test("abbbbc"); //true
regex.test("abbbbbc"); //false

//[문자] : 문자를 포함해야한다.
//[abc] : a or b or c 가 포함되어있으면 true
var regex = /[abc]/
regex.test("a") //true
regex.test("ad") //true
regex.test("abcdddddddd") //true
regex.test("e") //false

//[^문자] : 문자를 포함하지 않아야 한다.
//[^abc] : a or b or c를 제외한 문자가 하나라도 있으면 true
//문자열 안에 조건에 맞는 문자가 하나라도 있는지 검사.
var regex = /[^abc]/
regex.test("a") //false
regex.test("ad") //true
regex.test("e") //true

//[0-9] : 0-9를 포함하고 있는지
// \d 랑 같은의미
//숫자만 포함되면 true
var regex = /\d/
var regex = /[0-9]/
regex.test("0")//true
regex.test("3")//true
regex.test("7")//true
regex.test("123abc")//true

var regex = /^[0-9]$/
var regex = /^\d$/
//정확하게 한글자 숫자일때만 true
var regex = /^[0-9][0-9]$/
//두글자 숫자일때만 true

//[a-z] : 소문자 a부터 소문자 z까지 포함.
var regex = /[a-z]/ 
regex.test("abc123") //true
regex.test("abc") //true
regex.test("123") //false

// [A-Z] : 대문자 A부터 대문자 Z까지
var regex = /[A-Z]/

// [가-힣] : 가부터 힣까지

// 특수문자는 []에 들어가는거 말고 /  \. \+ \-  /

//1. 한글 이름에 대한 유효성
//한글로만 이루어진 문자열
//길이는 2~5
var regex = /^[가-힣]{2,5}$/
regex.test("가나A")//false
regex.test("가나AAAA")//false
regex.test("가")//false
regex.test("가나다라")//true

//2. 영어소문자, 숫자만 허용하는 아이디
//길이는 4~12글자 
//[]안에 제약조건을 한번에 사용하면 동시 적요
var regex = /^[\w\d]{4,12}$/


//3. 이메일 형식 검사
//username@domain.com 형태
//username은 영문/숫자/./_포함가능
//domaing은 영문/숫자
//com은 영문/숫자, .com또는 .net
var regex =/^[com]$/
var regex =/^[\w\d._]+\@[\w\d]+\.(com | net)$/

//4. 휴대폰 번호 검사
//010으로 시작
//중간,  마지막 자리 숫자는 4자리
//전체 형식 010-xxxx-xxxx
var reges = /^010-[\d]{4}-[\d]{4}$/

//(com | net) : com 또는 net
// | 는 또는 이라는 뜻으로 사용되며
//() 안에 들어간 문자는 하나의 문자로 인식된다 ex)(com)

//그룹화
//[abc] -> a,b,c중 하나
//(abc) -> abc가 한 단어
var regex = /(ha)+/
regex.test("ha") //true
regex.test("haha") //true
regex.test("hahaha") //true


var regex = /h+a+/
regex.test("h")//false
regex.test("ha")//true
regex.test("haha")//true
regex.test("hhaa")//true
regex.test("haaa")//true

// | : or의 의미 그룹화랑 같이 사용
//정규식은 띄어쓰기도 정확하게 인식한다.

var regex = /I(like|love)you/
regex.test("I love you"); //true

//그룹에서 값을 빼오는것이  가능하다.
//match()
let str = "price:$300";
var result = str.match(/\$(\d+)/)
//result[0] : 정규식에 매칭된 전체 문자열
//result[1] : 첫 번째 그룹에 해당하는 값
