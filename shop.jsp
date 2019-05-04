<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- Mirrored from 0effortthemes.com/soccerclubv2/shop.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2016 13:04:39 GMT -->
<head>
<meta charset=utf-8>
<meta name=description content="">
<meta name=viewport content="width=device-width, initial-scale=1">
<title>EntroMania</title>
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
		<%@include file="header.jsp" %>
		<div class=innerbannerwrap>
			<div class=content></div>
			<div class=innerbanner>
				<h2 class=bannerHeadline>
					our <span>shop</span>
				</h2>
			</div>
		</div>
		<section class=innerpage_all_wrap>
			<div class=container>
				<div class=row>
					<h2 class=heading>
						best soccer <span>accessories shop</span>
					</h2>
					<p class=headParagraph>Lorem ipsum dolor sit amet, consectetur
						adipisicing elit. Fugiat quisquam reprehenderit, blanditiis nam
						debitis libero facilis illum repudiandae eveniet voluptatibus
						quibusdam illo ea nisi ipsa accusantium nobis animi asperiores
						quaerat ,Lorem ipsum dolor sit amet, consectetur adipisicing elit.
						Fugiat quisquam reprehenderit, blanditiis nam debitis libero
						facilis illum repudiandae eveniet voluptatibus quibusdam illo ea
						nisi ipsa accusantium nobis animi asperiores quaerat .</p>
					<div class=innerWrapper>
						<aside class="widgetinner clearfix">
							<div class=widgetinfowrap>
								<div class=bg-blackimg>short by</div>
								<ul class="widgetinfo info01">
									<li>clothing</li>
									<li>accesories</li>
									<li>bags</li>
									<li>shoes</li>
									<li>fashion</li>
								</ul>
								<a href=# class=blacklrnmore>learn more</a>
							</div>
							<div class=widgetinfowrap>
								<div class=bg-blackimg>manufacturer</div>
								<ul class="widgetinfo info01">
									<li>clothing</li>
									<li>accesories</li>
									<li>bags</li>
									<li>shoes</li>
									<li>fashion</li>
								</ul>
								<a href=# class=blacklrnmore>learn more</a>
							</div>
							<div class=widgetinfowrap>
								<div class=bg-blackimg>colour</div>
								<div class=sizepic>
									<a href=# class=bg-bluecolor></a> <a href=# class=bg-redcolor></a>
									<a href=# class=bg-green></a> <a href=# class=bg-lblack01></a>
								</div>
							</div>
							<div class=widgetinfowrap>
								<div class=bg-blackimg>natinal football teams</div>
								<div class=sizepic>
									<a href=#>XS</a> <a href=#>S</a> <a href=#>M</a> <a href=#>L</a>
								</div>
							</div>
						</aside>
						<aside class=contentinner>
							<div class="bg-red shop_select clearfix">
								<div class=select_shopping>
									<form>
										<div class=form-group>
											<label class=headline01>sort by</label><select
												class=form-control><option>1</option>
												<option>2</option>
												<option>3</option>
												<option>4</option>
												<option>5</option></select>
										</div>
										<div class=form-group>
											<label class=headline01>per price</label><select
												class=form-control><option>1</option>
												<option>2</option>
												<option>3</option>
												<option>4</option>
												<option>5</option></select>
										</div>
									</form>
								</div>
							</div>
							<div class="shop-wrap-slider clearfix">
								<div class=shop_detais>
								<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
								<c:forEach items="${sessionScope.loadProduct}" var="p">
									<div class="shop01 clearfix">
										<div class=shop-img>
											<div class=bgimg>
											<input type="hidden" name="productId" value="${p.productId}">
												<img src="${pageContext.request.contextPath }/doc/${p.attachmentVo.encryptedFileName}"></div>
										</div>
										<div class=shop_info>
											<h4 class=headline01>
												<a href=product-details.html>${p.productName}</a>
											</h4>
											<div class=star>
												<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i>
											</div>
											<p>${p.productDescription}</p>
											<div class=headline01>INR. ${p.productPrice}</div>
											<div class=addcart-wrap>
												<a href="<%=request.getContextPath()%>/AddToCartCo?productId=${p.productId}&flag=addItem" class="btn-addcart"
													data-productid=1 data-productname="${p.productName}"
													data-productprice="${p.productPrice}"
													data-productimage="${pageContext.request.contextPath }/doc/${p.attachmentVo.encryptedFileName}">add to
													cart</a>
											</div>
										</div>
									</div>
									</c:forEach>
								</div>
							</div>
						</aside>
					</div>
				</div>
			</div>
		</section>
		<%@include file="footer.jsp" %>
	</div>
	<script src=js/vendor/vendor.js></script>
	<script src=js/main.js></script>
</body>
<!-- Mirrored from 0effortthemes.com/soccerclubv2/shop.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2016 13:04:40 GMT -->
</html>