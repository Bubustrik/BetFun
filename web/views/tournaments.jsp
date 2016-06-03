        <%@page import="model.Tournaments"%>
<!-- Import header -->
        <%@include file="templates/header.jsp" %>
        
        <section id="3rdSect" class="homeSection">
            <div class="homePict2">
                <div class="container homeContSecond">
                    <div class="row">
                        <div class="col-lg-12">
                            <h2>LES TOURNOIS</h2>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6">

                            <s:iterator value="allTournaments">
                                <div class="homeEncardTournois">

                                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-4">
                                        <p>
                                            <s:property value="name"/>
                                        </p>
                                        <p>
                                            Team :
                                        </p>
                                    </div>
                                    <div class="col-lg-6  col-md-4 col-sm-4 col-xs-4" style="padding-top: 33px;">
                                        <a href="#">PARIER</a>
                                    </div>
                                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-4">
                                        <p>
                                            JOUEUR 2
                                        </p>
                                        <p>
                                            Team :
                                        </p>
                                    </div>
                                </div>
                                <div class="homeEncardTournois">
                                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-4">
                                        <p>
                                            <s:property value="description"/>
                                        </p>
                                        <p>
                                            Team :
                                        </p>
                                    </div>
                                    <div class="col-lg-6  col-md-4 col-sm-4 col-xs-4" style="padding-top: 33px;">
                                        <a href="#">PARIER</a>
                                    </div>
                                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-4">
                                        <p>
                                            JOUEUR 2
                                        </p>
                                        <p>
                                            Team : 
                                        </p>
                                    </div>
                                </div>
                            </s:iterator>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Import footer -->
        <%@include file="templates/footer.jsp" %>