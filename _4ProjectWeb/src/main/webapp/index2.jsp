<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
<h1>MOHAJIMO</h1>
<h1>GALLERY</h1>
</header>


<figure>
    <img src="#" >
    <img src="#" >
    <img src="#" >
    <img src="#" >
    <img src="#" >
    <img src="#" >
    <img src="#" >
    <img src="#" >


<!-- 모달 팝업 -->
<div id="myModal" class="modal">
  <span class="close">&times;</span>
  <img class="modal-content" id="img01">
</div>

<script>
    // 이미지 요소들을 가져옴
    const images = document.querySelectorAll('.img-thumbnail');

    // 각 이미지에 이벤트 추가
    images.forEach(image => {
        // 마우스를 가져다 대었을 때
        image.addEventListener('mouseover', function() {
            this.style.transform = 'scale(1.2)'; // 이미지 크기를 확대
        });

        // 마우스가 벗어났을 때
        image.addEventListener('mouseout', function() {
            this.style.transform = 'scale(1)'; // 이미지 크기를 원래 크기로
        });

        // 이미지 클릭 시
        image.addEventListener('click', function() {
            // 모달 팝업 보여주기
            const modal = document.getElementById('myModal');
            const modalImg = document.getElementById('img01');
            modal.style.display = 'block';
            modalImg.src = this.src;

            // 이미지를 윈도우의 1/3 크기로 설정
            modalImg.style.width = '500px';
            modalImg.style.height = '700px';

            // 모달을 화면 중앙으로 이동
            modal.style.top = '50%';
            modal.style.left = '50%';
            modal.style.transform = 'translate(-50%, -50%)';
        });
    });

    // 모달 닫기 버튼
    const closeBtn = document.querySelector('.close');
    closeBtn.addEventListener('click', function() {
        const modal = document.getElementById('myModal');
        modal.style.display = 'none';
    });
</script>
<button type="submit" id="searchbutton" >write</button>
<form action="#">
<input type="text" id= "search" placeholder="TitleContent">
<button id="searchbutton" >search</button>
</form>
</figure>
</body>
</html>