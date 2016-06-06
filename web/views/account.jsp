<%@include file="templates/header.jsp" %>


    <section class="accountSect">
        <div class="accountPict">
            <div class="container accountCont">
                <div class="row">
                    <h2 class="col-lg-12">Mon Compte</h2>
                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12 accountData">
                        <h3>Mes informations</h3>
                        <br />
                        <hr id="InscriptSecondHr">
                        <br />
                        <label>Nom :</label>
                        <p><s:property value="user.Lastname"/></p>
                        <label>Prénom :</label>
                        <p><s:property value="user.Firstname"/></p>
                        <label>Email :</label>
                        <p><s:property value="user.Email"/></p>
                        <label>Mon score :</label>
                        <p><s:property value="user.Scores"/> pts</p>
                        <br />
                        <hr id="InscriptSecondHr">
                        <a id="inscription" href="/BetFun/ChangePass" style="padding-top: 2px;">Changer mon mot de passe</a>
                    </div>
                    
                    <div class="col-lg-1 col-md-1 col-sm-0 col-xs-0"></div>

                    <div class="col-lg-7 col-md-7 col-sm-12 col-xs-12 accountData">
                        <div class="accoutBets">
                            <h4>Mes Paris :</h4>
                        </div>
                        <hr id="InscriptSecondHr">
                        <div class="accountGroup">
                            <h4>Mes Groupes :</h4>
                        </div>
                        <hr id="InscriptSecondHr">
                        <div class="accoutTournaments">
                            <h4>Mes Tournois :</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>


<!-- Import footer -->
<%@include file="templates/footer.jsp" %>