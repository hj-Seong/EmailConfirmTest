<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form class="upload-form" action="/image" method="post" enctype="multipart/form-data">
		<input type="file" name="file" onchange="imageChoose(this)" />
		<div class="upload-img">
			<img src="/images/cat.jpg" alt="" id="imageUploadPreview" />
		</div>

		<!--사진설명 + 업로드버튼-->
		<div class="upload-form-detail">
			<input type="text" placeholder="사진설명" name="caption" />
			<button class="cta blue">업로드</button>
		</div>
		<!--사진설명end-->

	</form>
</body>
</html>