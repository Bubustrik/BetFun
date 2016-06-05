<!-- Import header -->
<%@include file="templates/header.jsp" %>

    <section class="signUpSect">
        <div class="signUpPict">
            <div class="container window">
                <div class="col-lg-3">
                </div>
                <div class="col-lg-9">
                    <div class="col-lg-8 homeInscription" style="margin-top: 100px;">
                        <form action="RecoverPass" method="POST">
                            <h2>Récupérer mon mot de passe</h2>
                            <hr>
                            <div class="col-lg-12" style="margin: 0; padding: 0;">
                                <label>Votre adresse email : </label>
                                <input type="text" name="emailTo"/>
                            </div>
                            <input class="validBut" type="submit" value="Récupérer mon mot de passe">
                            <!--<a id="btnConnexion" class="btn" style="margin-bottom: 15px;" href="Login">Récupérer mon mot de passe</a>-->
                            <br />
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>

<!-- Import footer -->
<%@include file="templates/footer.jsp" %>