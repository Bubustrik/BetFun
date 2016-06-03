        <%@page import="model.Bet"%>
<%@page import="frontOffice.AllParisAction"%>
<!-- Import header -->
        <%@include file="templates/header.jsp" %>
        
        <section id="2ndSect" class="homeSection">
            <div class="absoluTitle">
                <h2>PARIS EN COURS</h2>
            </div>
            <div class="container">
                <div class="homeContent">
                    <s:iterator value="allParis">
                    <div class="">
                        <div class="col-lg-3 col-md-6 col-sm-6 col-xs-6 homeEncartMiddle">
                            <div class="homeEncardParis">
                                <p class="first"><s:property value="matchs"/></p>
                                <a href="#">PARIER</a>
                                <p class="second"><s:property value="users"/></p>
                            </div>
                        </div>
                    </div>
                                
                    </s:iterator>
                </div>
            </div>
        </section>
        
        <!-- Import footer -->
        <%@include file="templates/footer.jsp" %>