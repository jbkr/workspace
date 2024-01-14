<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="resPath" value="/resources" />
<c:url var="context" value="/" />
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Work Space</title>
<link rel="stylesheet" href="${resPath}/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
<link rel="stylesheet" href="${resPath}/css/process/documentBox.css">
<link rel="icon" href="${resPath}/image/favicon.ico" type="image/x-icon">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
</head>

<body>
	<%@ include file="./header.jsp"%>
	<%@ include file="./sider.jsp"%>
	<div class="container mb-5">
		<h2 class="mb-4" style="color: #1E9CE3; font-weight: bold; font-size: 25px;">
			<i class="bi bi-archive me-3"></i>내 결재함
		</h2>
		<div class="row">
			<div class="col-12">
				<div class="card card-margin">
					<div class="card-body shadow-sm">
						<div class="row search-body">
							<div class="col-lg-12">
								<div>
									<div class="result-body">
										<!-- 바디 내용 들어갈 곳 -->
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

</html>