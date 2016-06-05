<!-- Import header -->
<%@include file="templates/header.jsp" %>

    <section class="signUpSect">
        <div class="signUpPict">
            <div class="container window">
                <div class="col-lg-3">
                </div>
                <div class="col-lg-9">
                    <div class="col-lg-8 homeInscription" style="margin-top: 100px;">
                        <form action="Account" method="POST">
                            <h2>Modifier mon mot de passe</h2>
                            <hr>
                            <div class="col-lg-12" style="margin: 0; padding: 0;">
                                <label>Ancien mot de passe : </label>
                                <input type="text" name="password"/>
                            </div>
                            <div class="col-lg-12" style="margin: 0; padding: 0;">
                                <label>Nouveau mot de passe : </label>
                                <input type="text" name="password"/>
                            </div>
                            <div class="col-lg-12" style="margin: 0; padding: 0;">
                                <label>Confirmer votre nouveau mot de passe : </label>
                                <input type="text" name="password"/>
                            </div>

                            <a id="btnConnexion" class="btn" style="margin-bottom: 15px;" href="Login">Changer mon mot de passe</a>
                            <br />
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>

<!-- Import footer -->
<%@include file="templates/footer.jsp" %>