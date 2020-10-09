$("#loginBtn").on('click',()=>{ //.on 이벤트 트리거
    var data = {};
    //loginform 태그에 접근 후 직렬화 후 객체화
    $("form[name=loginform]").serializeArray().map(function(x){data[x.name] = x.value;});
    console.log(data)

    $.ajax({
        type: "POST", //fix
        dataType: "json", //fix
        contentType: "application/json; charset=utf-8;", //fix
        url: "/api/login",
        data: JSON.stringify(data), //fix ; 객체->트링
    }).done(function(data) {
        //로직 필요에 따라 변경
        if(data.status==200){
            alert("로그인 성공")
            document.location.href = '/';
        }
        else if(data.status==400){
            alert("로그인 실패! 아이디와 비밀번호를 다시 입력해주세요!")
        }
    })
})
