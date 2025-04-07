//html의 모든 요소가 로딩되었을 때 실행
//document : body를 의미하는 js 객체
document.addEventListener("DOMContentLoaded",function(){
    
    //아이디에 대한 이벤트 처리

    //조건검사 대상
    let usernameInput = document.querySelector("#username");
    //이벤트처리 대상(결과반영)
     let message = document.querySelector("#usernamemsg");

    //usernameInput 변수에 값이 들어있다면
    if(usernameInput){
        //포커스를 줘라
        // usernameInput.focus();
    }

    //아이디 입력란에 "입력" 이벤트가 발생했을 때
    usernameInput.addEventListener("input",function(){
        //아이디 입력란의 값 가져오기
        let value = usernameInput.value;

        let hasLowerCase = false;
        let hasNumber = false;
        let isValid = true;

        //길이검사
        if(value.length < 4 || value.length >20){
            isValid = false;
        }

        //문장검사하기
        //정규식을 사용하지 않으면 문자열을 하나씩 잘라서 검사해야한다.

        //순회한다 -> 반복문 (for, while)

        //검사한다 -> 조건문(if, switch)

        //문자열 전체를 순회한다.
        for(let i=0;i<value.length;i++){
            const ch = value[i];//한글자를 담는다.
            if(ch>='a'&&ch<='z'){//소문자인지 판별
                hasLowerCase = true;
            }
            else if(ch>='0'&&ch<='9'){//숫자인지 판별
                hasNumber =true;
            }
            else{
                isValid = false; //다른 문자 포함시 무효
            }
        }

        //메시지를 표시
        //영어 소문자,숫자를 포함한 4글자 이상의 단어
        if(!isValid||!hasLowerCase||!hasNumber){//조건에 맞지 않는 경우지만 if문으로 들어
            message.textContent = "아이디는 소문자/숫자 4자 이상 사용 가능합니다";
            message.style.color="red";
        }
        else{
            message.textContent = "올바른 형식입니다";
            message.style.color="green";
        }
    
        

    })//end usernameInput function



    //비밀번호
    //비밀번호 입력란
    let passwordInput = document.querySelector("#pwd");
    //비밀번호 이벤트 처리대상
    let passwordMessage = document.querySelector("#userpwdmsg");

    passwordInput.addEventListener("blur",function(){
        let value = passwordInput.value

        //대문자, 소문자, 숫자, 특수문자를 포함시키는지 검사
        var regex =/^[A-Za-z0-9!@#$%^&*]{8,19}$/

        if(!regex.test(value)){
            passwordMessage.textContent = "8~20 자 사이로 작성해주세요";
            passwordMessage.style.color = "red"
        }
        else{
            passwordMessage.textContent="올바른 형식입니다."
            passwordMessage.style.color="green";
        }

        

        // let secialChars = "!@#$%^&*";

        // let hasUpperCase = false; //대문자 있는지
        // let hasLowerCase = false; //소문자 있는지
        // let hasNumber = false; // 숫자가 있는지
        // let hasSpecial = false; // 특수문자가 있는지
        // let isValid = true; //유효성검사가 완벽한지

        // if(value.length < 8||value.length > 20){
        //     isValid = false;
        // }

        // for(let i =0; i < value.length; i++){
        //     let char = value[i];
        //     if(char>='a'&&char<='z'){
        //         hasLowerCase = true;
        //     }
        //     else if(char>='A'&&char<="Z"){
        //         hasUpperCase = true;
        //     }
        //     else if (char>='0'&&char<="9"){
        //         hasNumber=true;
        //     }
        //     else if(secialChars.includes(char)){
        //         hasSpecial=true;
        //     }
        //     else{
        //          isValid = false;//허용되지 않은 문자 포함시 무효
        //     }
        // }

        // //포함된 조건 수 계산
        // //조건에 맞는 문자가 들어가면 +1만 된다.
        // //최대 trypesCount = 4;
        // let typesCount = 0;
        // if(hasLowerCase)typesCount++;
        // if(hasNumber)typesCount++;
        // if(hasSpecial)typesCount++;
        // if(hasUpperCase)typesCount++;

        // if(!isValid||typesCount<3){
        //     passwordMessage.textContent="비밀번호는 8~20자의 영문 대/소문자,숫자,특수문자 등 3종류의 조합으로 이루어 져야합니다."+typesCount
        //     passwordMessage.style.color="red";
        // }
        // else{
        //     passwordMessage.textContent="올바른 형식입니다."
        //     passwordMessage.style.color="green";
        // }


    })//end passInput 
    


    //이름에 대한 유효성 검사
    let nameInput = document.querySelector("#name");
    let nameMessage = document.querySelector("#namemsg");

    //이름에 대한 유효성 검증을 하는 함수
    function validateName(){
        //이름값 가져오기 +혹시모를 띄어쓰기때문에 trim주기
        let value = nameInput.value.trim();

        //1. 이름을 입력하지 않았을 때
        if(value.length === 0){
            nameMessage.textContent = "이름을 작성해주세요"
            nameMessage.style.color = "red";
        }

        //2. 이름이  30글자가 넘었을 때
        if(value.length>30){
            nameMessage.textContent = "이름은 1~30자 사이로 입력해 주세요"
            nameMessage.style.color = "red";
            return;
        }

        //한글, 영문 대/소문자만 허용하는 정규식
        //한글 : 가-힣

        let nameRegex = /^[가-힣a-zA-Z]{2,30}$/

        if(nameRegex.test(value)){
            nameMessage.textContent="사용가능한 이름입니다"
            nameMessage.style.color="green"
        }
        else{
            nameMessage.textContent="이름은 한글, 영어 대/소문자만 사용해주세요"
            nameMessage.style.color="red"
        }
    }
    //입력할때 실시간으로 검증
    nameInput.addEventListener("input",validateName)//end input EventListener
    //포커스가 빠질때 검증
    nameInput.addEventListener("blur",validateName)//end blur EventListener




    //이메일에 대한 유효성 검사
    //(1)이메일 형식을 올바른지 점검할 수 있도록 개선하시오
    //(2)이메일을 입력할 때와 입력이 끝난 뒤 벗어날 때 모두 점검하시오.
    let emailInput = document.querySelector("#email");
    let emailMessage = document.querySelector("#emailmsg");

    function vaildateEmail(){
        let value = emailInput.value;
        let emailregex = /^[\w\d._]+\@[\w\d]+\.(com|net)$/

        //1. 이메일을 입력하지 않았을 때
        //"이메일을 입력해주세요"
        if(value.length === 0 ){
            emailMessage.textContent="이메일을 입력해주세요";
            emailMessage.style.color = "red";
        }

        //2. 이메일 형식 검사하기
        //"이메일 형식이 올바르지 않습니다"
        if(emailregex.test(value)){
          emailMessage.textContent = "올바른 이메일 입니다";
          emailMessage.style.color = "green";
        }
        else{
            emailMessage.textContent = "이메일 형식이 올바르지 않습니다";
            emailMessage.style.color = "red";
        }
        //모두 통과시
        //"올바른 이메일 입니다"

    }

    //입력할때 실시간으로 검증
    emailInput.addEventListener("input",vaildateEmail)
    //포커스가 빠찔때 검증
    emailInput.addEventListener("blur",vaildateEmail)

    //form 태그의 정보 가져오기
    let form = document.querySelector("form");

    //submit 이벤트가 발생했을 때
    form.addEventListener("submit",function(){
        //confirm 창을 띄운다.
        let confirmed = confirm("가입을 완료하시겠습니까?")
        if(!confirmed){
            preventDefault();//form의 내용의 전송을 막는다.
        }
    })
    
})//end DOMContentLoaded