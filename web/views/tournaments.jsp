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
                        <div class="col-lg-12 col-md-12 col-sm-12 homeEncartSecond">

                            <s:iterator value="allTournaments">
                                <div class="homeEncardTournois">

                                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-4">
                                        <p style="color:red;font-weight : bold;">
                                            Tournoi : <br> 
                                        <p class="text-decoration: underline;"><s:property value="name"/></p>
                                                                          </div>
                                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-4">
                                        <p>
                                            <s:property value="description"/>
                                        </p>
                                    </div>
                                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-4">
                                        <p>
                                            Start Date : <s:property value="startDate"/><br>
                                            End Date : <s:property value="EndDate"/>
                                        </p>
                                    </div>
                                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-4">
                                        Result Date : <s:property value="ResultDate"/>
                                    </div>
                                    <div class="col-lg-12 col-md-4 col-sm-4 col-xs-4">
                                        <form action="#">
                                            <input class="btn-lg validBut" type="submit" value="Details">
                                        </form>
                                    </div>
                                    <br><br>
                                </div>
                               
                            </s:iterator>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Import footer -->
        <%@include file="templates/footer.jsp" %>