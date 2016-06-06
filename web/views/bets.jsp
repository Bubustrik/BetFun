        <%@page import="model.Bet"%>
        <%@page import="frontOffice.AllParisAction"%>
        <!-- Import header -->
        <%@include file="templates/header.jsp" %>
        <script>
            toastr.success('Vous êtes connecté!');
        </script>
        <section id="2ndSect" class="homeSection">
            <div class="container windowBets">
                <div class="row">
                    <div class="col-lg-6">
                        <h1 class="col-lg-6">LES PARIS</h1>
                    </div>
                    <div class="col-lg-6">
                        <a href="/BetFun/CreateMatch" class="btn">Créer un nouveau Paris</a>
                    </div>

                    <div class="betsContent col-lg-12">
                        <s:iterator value="allMatchs">
                            <div class="betsEncart">
                                <div class="col-lg-6 betsData">
                                    <label>Date d'ouverture : &nbsp;</label>
                                    <p><s:property value="startDate"/></p>
                                </div>
                                <div class="col-lg-6 betsData">
                                    <label>Date de fin : &nbsp;</label>
                                    <p><s:property value="endDate"/></p>
                                </div>
                                <hr class="betsHr">
                                <div class="col-lg-12 betsData">
                                    <label>Paris : &nbsp;</label>
                                    <p><s:property value="name"/></p>
                                </div>
                                <div class="col-lg-12">
                                    <label>Description : &nbsp;</label>
                                    <p><s:property value="description"/></p>
                                </div>
                                <input type="submit" value="Parier" class="validBetBut"/>
                            </div>
                            <div class="clear"></div>
                        </s:iterator>
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Import footer -->
        <%@include file="templates/footer.jsp" %>