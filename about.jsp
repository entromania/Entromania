<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- Mirrored from 0effortthemes.com/soccerclubv2/about.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2016 12:59:40 GMT -->
<head>
<base href="${pageContext.request.contextPath}/User/">
<meta charset=utf-8>
<meta name=description content="">
<meta name=viewport content="width=device-width, initial-scale=1">
<title>About Us</title>
<link rel="shortcut icon" href=favicon.ico>
<link rel=stylesheet href=vendor.css>
<link rel=stylesheet href=style.css>
<link rel=stylesheet type=text/css href=css/layerslider.css>
<script src=js/vendor/modernizr.js></script>
</head>
<body>
	<!--[if lt IE 10]>
 <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
 <![endif]-->
	<div class=wrapper>
		<%@include file="header.jsp"%>
		<div class=innerbannerwrap>
			<div class=innerbanner>
				<h2 class=bannerHeadline>
					about <span>us</span>
				</h2>
			</div>
		</div>
		<section class="matchSchedule countryclub">
		<div class=container>
			<div class=row>
				<h2 class="heading small">
					EntroMania <span>country club</span>
				</h2>
				<p class=headParagraph>EntroMania is India's biggest online
					sports and events ticketing brand. The website caters to ticket
					sales for concerts and sporting events via the
					online platform. Launched in 2016, it is headquartered in Ahmedabad,
					Gujarat.</p>
			</div>
		</div>
		</section>
		<section class="sponsors bg-smallwhite">
		<div class=container>
			<div class=row>
				<h2 class=heading>
					spon<span>sers</span>
				</h2>
				<ul class="client clearfix">
				<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
				<c:forEach items="${sessionScope.loadSponser}" var="p">
					<li><img src="${pageContext.request.contextPath}/doc/${p.attachmentVo.encryptedFileName}"
							alt=image></li>
				</c:forEach>
				</ul>
			</div>
		</div>
		</section>
		
		<section class=players>
		<div class=container>
			<div class=row>
				<h2 class=heading>
					board <span>members</span>
				</h2>
				<p class=headParagraph>
				The Board Members of EntroMania
				</p>
				<div class="wrapplayer clearfix">
					<a class="prv prev-player"></a> <a class="nxt next-player"></a>
					<ul class="boardmember clearfix">
						<li class=clearfix><div>
								<div>
									<div class=fig01>
										<div class=memberimg
											style="background: url(images/boardMember/boardMember01.jpg) no-repeat top center"></div>
									</div>
									<div class="bg-black01 fig02">
										<h6 class=paragraph02>Priyanka Munjapara</h6>
										<p class="uppercaseheading red">CEO</p>
										<p>
										 	Priyanka Munjapara is an
											Indian computer programmer, Internet entrepreneur, and
											philanthropist. He is the chairman, chief executive, and
											co-founder of the  website EntroMania.</p>
									</div>
									<div class="bg-black fig02">
										<p>Priyanka and her team launched EntroMania from his Gandhinagar Institute Of Technology
										on April 19, 2016.</p>
									</div>
									<div class="bg-redcolor fig02">
										<p>BORN 07 September 1994, Ahmedabad</p>
									</div>
								</div>
							</div></li>
						<li><div>
								<div>
									<div class=fig01>
										<div class=memberimg
											style="background: url(images/boardMember/boardMember02.jpg) no-repeat top center"></div>
									</div>
									<div class="bg-black01 fig02">
										<h6 class=paragraph02>Viral Soni</h6>
										<p class="uppercaseheading red">ceo</p>
										<p> Viral H Soni is an
											Indian computer programmer, Internet entrepreneur, and
											philanthropist. He is the chairman, chief executive, and
											co-founder of the  website EntroMania.
											</p>
									</div>
									<div class="bg-black fig02">
										<p> Viral and his team launched EntroMania from his Gandhinagar Institute Of Technology
										on April 19, 2016.</p>
									</div>
									<div class="bg-redcolor fig02">
										<p>BORN 07 October 1994, Visnagar</p>
									</div>
								</div>
							</div></li>
						<li><div>
								<div>
									<div class=fig01>
										<div class=memberimg
											style="background: url(images/boardMember/boardMember03.jpg) no-repeat top center"></div>
									</div>
									<div class="bg-black01 fig02">
										<h6 class=paragraph02>Manushi Vakharia</h6>
										<p class="uppercaseheading red">ceo</p>
										<p>	Manushi Vakharia is an
											Indian computer programmer, Internet entrepreneur, and
											philanthropist. He is the chairman, chief executive, and
											co-founder of the  website EntroMania.</p>
									</div>
									<div class="bg-black fig02">
										<p>Manushi and her Team launched EntroMania from his Gandhinagar Institute Of Technology
										on April 19, 2016.</p>
									</div>
									<div class="bg-redcolor fig02">
										<p>BORN 14 April 1975, England</p>
									</div>
								</div>
							</div></li>
					
					</ul>
				</div>
			</div>
		</div>
		</section>		
		<%@include file="footer.jsp"%>
	</div>
	<script src=js/vendor/vendor.js></script>
	<script src=js/main.js></script>
</body>
<!-- Mirrored from 0effortthemes.com/soccerclubv2/about.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2016 12:59:56 GMT -->
</html>