<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- Mirrored from 0effortthemes.com/soccerclubv2/bookTicket.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2016 13:04:39 GMT -->
<head>
<meta charset=utf-8>
<meta name=description content="">
<meta name=viewport content="width=device-width, initial-scale=1">
<title>Matches</title>
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
		<%@ include file="header.jsp" %>
		<div class=innerbannerwrap>
			<div class=content></div>
			<div class=innerbanner>
				<h2 class=bannerHeadline>
					book <span>match</span>
				</h2>
			</div>
		</div>
		<section class="innerpage_all_wrap bg-white">
			<div class=container>
				<div class=row>
					<h2 class=heading>
						premium league <span>tickets the official way</span>
					</h2>
					<p class=headParagraph>
					EntroMania will help you to book currenctly playing cricket matches 
							all over india. You have to pay online for ticket booking. it is 100%
							secure.</p>
					<div class=innerWrapper>
					<aside class="widgetinner clearfix">
					<div class=widgetinfowrap>
						<div class=bg-blackimg>why book with us?</div>
						<ul class="widgetinfo info01">
							<li>100% MONEY BACK GURANTEE</li>
							<li>REAL TIME INVENTory</li>
							<li>friendly customer service</li>
							<li>secure payment</li>
							<li>last minute bookings</li>
							<li>7 years online swering fans</li>
						</ul>
					</div>
					<div class=widgetinfowrap>
						<div class=bg-blackimg>english memebership</div>
						<ul class="widgetinfo info02">
							<li>liverpool ticket</li>
							<li>arsenasl ticket</li>
							<li>barcelona ticket</li>
							<li>real madrid 04</li>
						</ul>
					</div>
					<div class=widgetinfowrap>
						<div class=bg-blackimg>T20 world cup</div>
						<ul class="widgetinfo info02">
							<li>warm up match</li>
							<li>qualify match</li>
						</ul>
					</div>
					<div class=widgetinfowrap>
						<div class=bg-blackimg>World cup</div>
						<ul class="widgetinfo info02">
							<li>Match tickets</li>
						</ul>
					</div>
					<div class=widgetinfowrap>
						<div class=bg-blackimg>national cricket teams</div>
						<ul class="widgetinfo info02">
							<li>India</li>
							<li>australia</li>
							<li>new zeland</li>
							<li>south africa</li>
						</ul>
					</div>
					</aside>
					<aside class=contentinner>
					<div class="bg-red headline01">most popular match ticket</div>
					<ul class=ticketInfo>
						<c:forEach var="m" items="${sessionScope.loadmatch}">
							<li><ul class="t_info headline01 clearfix">
									<li>${m.m_id}</li>
									<li><div class="headline01 clearfix">
											<span>${m.team1}</span><span class=vs>vs</span> <span>${m.team2}</span>
										</div>
										<div class="ticketInner_info paragraph02 clearfix">
											<span>
												<%-- <fmt:formatDate value="${m.date}" pattern="yyyy-MM-dd"/> --%>${m.date }</span>
											<span>${m.time}</span> <span class=capitalize01>${m.stadiumvo.stadium}</span>
										</div></li>
									<li><a
										href="<%=request.getContextPath()%>/ticketCo?id=${m.m_id}&match=${m.title}&date=${m.date}&time=${m.time}&stadium=${m.stadiumvo.stadium}&stadiumId=${m.stadiumvo.s_id}&flag=viewtickets"
										class="btn-small01 btn-green">book tickets</a></li>
								</ul></li>
						</c:forEach>
					</ul>
					<div class=center>
						<a href=# class=vm-book>view more</a>
					</div>
					<div class=buymatchticket>
						<div class=bg-red>
							<h5>how buy a match ticket</h5>
						</div>
						<div class=ticktbody>
							<p>First of al register with us than go to cricket menu on header than 
							select any match that you want to book tickets than selct your tickets
							than procees to payment.</p>
							<p></p>
							<p></p>
							<div class=socialTicket>
								<a href=https://www.facebook.com/vrl.soni
									class="social_link facebook"><i class="fa fa-facebook"></i></a>
								<a href=https://twitter.com/vrl_soni
									class="social_link twitter"><i class="fa fa-twitter"></i></a> <a
									href=https://www.behance.net/vrlsoni class="social_link behance"><i
									class="fa fa-behance"></i></a>
							</div>
						</div>
					</div>
					</aside>
				</div>
				</div>
			</div>
		</section>
		<%@ include file="footer.jsp" %>
	</div>
	<script src=js/vendor/vendor.js></script>
	<script src=js/main.js></script>
</body>
<!-- Mirrored from 0effortthemes.com/soccerclubv2/bookTicket.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2016 13:04:39 GMT -->
</html>