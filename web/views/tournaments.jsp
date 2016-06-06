        <%@page import="model.Tournaments"%>
<!-- Import header -->
        <%@include file="templates/header.jsp" %>
        
        <section id="3rdSect" class="homeSection">
            <div class="homePict2">
                <div class="container tournamentsCont">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1>LES TOURNOIS</h1>
                        </div>
                        <div class="col-lg-12 col-md-12 col-sm-12 mainDiv">

                            <s:iterator value="allTournaments">
                                <a href="#" type="button">
                                    <div class="encardTournois">
                                        <div class="col-lg-12 titleTournament">
                                            <h4>TOURNOIS : <s:property value="name"/></h4>
                                        </div>
                                        <div class="col-lg-12">
                                            <p><s:property value="description"/></p>
                                        </div>
                                        <div class="col-lg-12">
                                            <div class="col-lg-4">
                                                <p class="dateTourn">
                                                    Start Date : <s:property value="startDate"/>
                                                </p>
                                            </div>
                                            <div class="col-lg-4">
                                                <p class="dateTourn">
                                                    End Date : <s:property value="EndDate"/>
                                                </p>
                                            </div>
                                            <div class="col-lg-4">
                                                <p class="dateTourn">
                                                    Result Date : <s:property value="ResultDate"/>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </s:iterator>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Import footer -->
        <%@include file="templates/footer.jsp" %>