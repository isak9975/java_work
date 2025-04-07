document.addEventListener("DOMContentLoaded",()=>{

    let form = document.forms[0]

    let img = document.querySelector("#img img")

    let id = form.m_id
    let pwd = form.m_pwd
    let email = form.m_email
    let name = form.m_name
    let button = document.querySelector("#button")
    
    //아이디 
    id.addEventListener("input",()=>{
        let idconfig = /\w.+{4-20}/
        console.log(form.m_id.value.length);

        if(id.value==idconfig){
            document.querySelector("#idinput").innerHTML = `<span style=color:greenyellow;>올바른 형식입니다</span>`;
        }else{
            document.querySelector("#idinput").innerHTML = `<span style=color:red>아이디는 소문자/숫자 4자 이상 사용가능합니다.</span>`;
        }

    })

    //비밀번호
    function pwdconfig(){
        // let pwdconfig = //

        if(pwd.value = ""){
            document.querySelector("#pwdinput").innerHTML = `<span style=color:greenyellow;>사용 가능한 비밀번호 입니다.</span>`;
        }else{
            document.querySelector("#pwdinput").innerHTML = `<span style=color:red>비밀번호는 8~20자의 대소문자, 숫자, 특수문자 등 3종료 이상으로 조합해주세요</span>`;
        }

    }

    //이름
    name.addEventListener("input",()=>{
        
        let nameconfig = /[\w]{1-30}/

        if(name.value==nameconfig){
            document.querySelector("#nameinput").innerHTML = `<span style=color:greenyellow;>사용 가능한 이름입니다.</span>`;
        }else if(name.value==" "){
            document.querySelector("#nameinput").innerHTML = `<span style=color:red>이름을 입력해주세요</span>`;
        }
        else{
            document.querySelector("#nameinput").innerHTML = `<span style=color:red>이름은 한글, 영문 대소문자만 사용해 주세요.</span>`;
        }
        
    })

    //이메일
    email.addEventListener("input",()=>{
        let emailconfig = /[\w.+]@[\w.+]\.\w.+/

        if(email.value == emailconfig){
            document.querySelector("#emailinput").innerHTML = `<span style=color:greenyellow;>올바른 이메일 형식입니다.</span>`;
        }
        else{
            document.querySelector("#emailinput").innerHTML = `<span style=color:red>올바른 형식의 이메일을 입력해 주세요</span>`;
        }
    })

    //버튼
    button.addEventListener("click",()=>{
        
        if(confirm("가입할까요?")){
            form.submit
            alert("가입완료")
        }
        else{
            alert("가입취소")
        }

    })
})