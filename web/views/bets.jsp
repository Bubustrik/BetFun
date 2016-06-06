        <%@page import="model.Bet"%>
<%@page import="frontOffice.AllParisAction"%>
<!-- Import header -->
        <%@include file="templates/header.jsp" %>
        
        <section id="2ndSect" class="homeSection">
            <div class="container windowBets">
                <div class="row">
                    <h1>LES PARIS</h1>

                    <div class="betsContent">
                        <s:iterator value="allMatchs">
                            <div class="col-lg-12 betsEncart">
                                <label>Date d'ouverture : </label>
                                <p><s:property value="matchs.startDate"/></p>
                                <label>Date de fin : </label>
                                <p><s:property value="matchs.endDate"/></p>
                                <label>Paris : </label>
                                <p><s:property value="matchs.name"/></p>
                                <label>Description : </label>
                                <p><s:property value="matchs.description"/></p>
                                <label>Créé par : </label>
                                <p><s:property value="matchs.users"/></p>
                                <hr>
                                <input type="submit" value="Parier"/>
                            </div>
                        </s:iterator>
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Import footer -->
        <%@include file="templates/footer.jsp" %>