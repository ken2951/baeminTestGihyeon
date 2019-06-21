<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style type="text/css">
.footer_menu{
	width : 100%;
	margin: 0 auto;
	background-color: #333;
	height : 230px;
	line-height : 55px;
}

.footer_menu ul{

	width : 100%;
	margin : 0 auto;
	list-style: none;
	align-content: center;
}

.footer_menu ul li{

	padding : 10px 10px 0px 10px;
	display : block;
	float : left;
	cursor:pointer;
}

.footer_menu img{
	width : 90px;
	
}

.footer_company>ul>li>a{cursor:pointer;}

.footer_company p{
	width: 100%;
	font-size : 11px;
	line-height : 21px;
	color : #616161;
}

.footer_menu>.footer_company>p>a.textLink{
	text-decoration: underline;
	color: #616161;
	font-weight: normal;
	cursor:pointer;
	
}
.footer_menu li a{
	font-size: 12px;
    color: #8b8b8b;
    font-weight: normal;
    font-weight: bold;
    text-decoration: none;
}
.footer_menu p{
	padding-top: 5px;
}

</style>
</head>

<div class="footer_menu">
	
	<div class="footer_company" style="margin:0 auto; width: 1000px;">
		<ul>
			<li><a href="#">이용안내</a></li>
			<li><a href="/finalproject/servicePrivate">개인정보처리방침</a></li>
			<li><a href="/finalproject/serviceAgreement">이용약관</a></li>
			<li><a href="#">공지사항</a></li>
		</ul>
		<div>
			<img src="../img/footerlogo.png" style="float:right; margin-top: 50px;">
		</div>
		
		<p>
		<br><br><br><br>
		(주)우아한형제들   |   
		대표 : 김봉진   |
		주소 : 서울시 송파구 위례성대로 2 (장은빌딩) 18층 <br>
		
		사업자등록번호 : 120-87-65763 
		<a href="#" class="textLink" id="companyNum">
		사업자정보확인  </a> |   통신판매업신고번호 : 2012-서울송파-0515   |  
		개인정보보호책임자 : 박성철 <br>
		
		고객센터 : 1670-9902   |
		팩스 : 050-6050-0400   |
		이메일 : <a href="#" class="textLink" id="footer_email"> baemin_store@woowahan.com </a> <br>
		
		호스팅제공 : 엔에이치엔고도(주)
		</p>
		
		<p >
		<span style="font-weight: 700;">고객님의 안전거래를 위해 현금 등으로 결제 시 NHN한국사이버결제(주)의 구매안전 서비스를 이용하실 수 있습니다.</span> 
		[<a href="#"  class="textLink"  id="serviceImg">서비스 가입사실 확인 </a>] <br>
		ⓒ Woowa Brothers in Song-pa
		</p>
	</div><!-- footer_company -->

</div><!-- footer_menu -->



<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
$('#companyNum').click(function(){
	window.open('http://www.ftc.go.kr/www/bizCommView.do?key=232&apv_perm_no=2012323019830200515&pageUnit=10&searchCnd=wrkr_no&searchKrwd=1208765763&pageIndex=1','','');
});
$('#footer_email').click(function(){
	window.open('/finalproject/sendEmail','','width=650, height=700, top=100, left=100, resizeable=no','true');
});
$('#serviceImg').click(function(){
	window.open('/finalproject/serviceImg','','');
});
</script>
