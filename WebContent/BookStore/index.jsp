<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Book Store</title>
<link rel="stylesheet" type="text/css" href="BookStore/style.css" />
</head>
<body>
<div id="wrap">
  <div class="header">
    <div class="logo"><a href="BookStore/index.jsp"><img src="BookStore/images/logo.gif" alt="" title="" border="0" /></a></div>
    <div id="menu">
      <ul>
        <li><a href="BookStore/index.jsp">home</a></li>
        <li><a href="BookStore/about.jsp">about us</a></li>
        <li><a href="BookStore/category.jsp">books</a></li>
        <li><a href="BookStore/specials.jsp">specials books</a></li>
        <li><a href="BookStore/login.jsp">login</a></li>
        <li><a href="BookStore/register.jsp">register</a></li>
        <li><a href="BookStore/details.jsp">prices</a></li>
        <li><a href="admin/login.jsp">admin</a></li>

      </ul>
    </div>
  </div>
  <div class="center_content">
    <div class="left_content">
      <div class="title"><span class="title_icon"><img src="BookStore/images/bullet1.gif" alt="" title="" /></span>Featured books</div>
      <div class="feat_prod_box">
        <div class="prod_img"><a href="BookStore/details.jsp"><img src="BookStore/images/prod1.gif" alt="" title="" border="0" /></a></div>
        <div class="prod_det_box">
          <div class="box_top"></div>
          <div class="box_center">
            <div class="prod_title">Product name</div>
            <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
            <a href="BookStore/details.jsp" class="more">- more details -</a>
            <div class="clear"></div>
          </div>
          <div class="box_bottom"></div>
        </div>
        <div class="clear"></div>
      </div>
      <div class="feat_prod_box">
        <div class="prod_img"><a href="BookStore/details.jsp"><img src="BookStore/images/prod2.gif" alt="" title="" border="0" /></a></div>
        <div class="prod_det_box">
          <div class="box_top"></div>
          <div class="box_center">
            <div class="prod_title">Product name</div>
            <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
            <a href="BookStore/details.jsp" class="more">- more details -</a>
            <div class="clear"></div>
          </div>
          <div class="box_bottom"></div>
        </div>
        <div class="clear"></div>
      </div>
      <div class="title"><span class="title_icon"><img src="BookStore/images/bullet2.gif" alt="" title="" /></span>New books</div>
      <div class="new_products">
        <div class="new_prod_box"> <a href="BookStore/details.jsp">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="BookStore/images/new_icon.gif" alt="" title="" /></span> <a href="details.jsp"><img src="BookStore/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a> </div>
        </div>
        <div class="new_prod_box"> <a href="BookStore/details.jsp">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="BookStore/images/new_icon.gif" alt="" title="" /></span> <a href="details.jsp"><img src="BookStore/images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a> </div>
        </div>
        <div class="new_prod_box"> <a href="BookStore/details.jsp">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="BookStore/images/new_icon.gif" alt="" title="" /></span> <a href="details.jsp"><img src="BookStore/images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a> </div>
        </div>
      </div>
      <div class="clear"></div>
    </div>
    <!--end of left content-->
    <div class="right_content">
      <div class="languages_box"> <span class="red">Languages:</span> <a href="#" class="selected"><img src="BookStore/images/gb.gif" alt="" title="" border="0" /></a> <a href="#"><img src="BookStore/images/fr.gif" alt="" title="" border="0" /></a> <a href="#"><img src="BookStore/images/de.gif" alt="" title="" border="0" /></a> </div>
      <div class="currency"> <span class="red">Currency: </span> <a href="#">GBP</a> <a href="#">EUR</a> <a href="#" class="selected">USD</a> </div>
      <div class="cart">
        <div class="title"><span class="title_icon"><img src="BookStore/images/cart.gif" alt="" title="" /></span>My cart</div>
        <div class="home_cart_content"> 3 x items | <span class="red">TOTAL: 100$</span> </div>
        <a href="BookStore/cart.jsp" class="view_cart">view cart</a> </div>
      <div class="title"><span class="title_icon"><img src="BookStore/images/bullet3.gif" alt="" title="" /></span>About Our Store</div>
      <div class="about">
        <p> <img src="BookStore/images/about.gif" alt="" title="" class="right" /> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. </p>
      </div>
      <div class="right_box">
        <div class="title"><span class="title_icon"><img src="BookStore/images/bullet4.gif" alt="" title="" /></span>Promotions</div>
        <div class="new_prod_box"> <a href="BookStore/details.jsp">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="BookStore/images/promo_icon.gif" alt="" title="" /></span> <a href="BookStore/details.jsp"><img src="BookStore/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a> </div>
        </div>
        <div class="new_prod_box"> <a href="BookStore/details.jsp">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="BookStore/images/promo_icon.gif" alt="" title="" /></span> <a href="BookStore/details.jsp"><img src="BookStore/images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a> </div>
        </div>
        <div class="new_prod_box"> <a href="BookStore/details.jsp">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="BookStore/images/promo_icon.gif" alt="" title="" /></span> <a href="BookStore/details.jsp"><img src="BookStore/images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a> </div>
        </div>
      </div>
      <div class="right_box">
        <div class="title"><span class="title_icon"><img src="BookStore/images/bullet5.gif" alt="" title="" /></span>Categories</div>
        <ul class="list">
          <li><a href="#">accesories</a></li>
          <li><a href="#">books gifts</a></li>
          <li><a href="#">specials</a></li>
          <li><a href="#">hollidays gifts</a></li>
          <li><a href="#">accesories</a></li>
          <li><a href="#">books gifts</a></li>
          <li><a href="#">specials</a></li>
          <li><a href="#">hollidays gifts</a></li>
          <li><a href="#">accesories</a></li>
          <li><a href="#">books gifts</a></li>
          <li><a href="#">specials</a></li>
        </ul>
        <div class="title"><span class="title_icon"><img src="BookStore/images/bullet6.gif" alt="" title="" /></span>Partners</div>
        <ul class="list">
          <li><a href="#">accesories</a></li>
          <li><a href="#">books gifts</a></li>
          <li><a href="#">specials</a></li>
          <li><a href="#">hollidays gifts</a></li>
          <li><a href="#">accesories</a></li>
          <li><a href="#">books gifts</a></li>
          <li><a href="#">specials</a></li>
          <li><a href="#">hollidays gifts</a></li>
          <li><a href="#">accesories</a></li>
        </ul>
      </div>
    </div>
    <!--end of right content-->
    <div class="clear"></div>
  </div>
  <!--end of center content-->
  <div class="footer">
    <div class="left_footer"><img src="BookStore/images/footer_logo.gif" alt="" title="" /><br />
      </div>
    <div class="right_footer"> <a href="#">home</a> <a href="#">about us</a> <a href="#">services</a> <a href="#">privacy policy</a> <a href="#">contact us</a> </div>
  </div>
</div>
<div style="text-align:center;">
<p>&#26469;&#28304;:<a href="http://www.mycodes.net/" target="_blank">&#28304;&#30721;&#20043;&#23478;</a></p>
</div>
</body>
</html>
