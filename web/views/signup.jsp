
<!-- Import header -->
<%@include file="templates/header.jsp" %>

    <section class="signUpSect">
        <div class="signUpPict">
            <div class="container window">
                <div class="col-lg-3">
                    <h1>
                        Inscription
                    </h1>
                </div>
                <div class="col-lg-9">
                    <div class="col-lg-8 homeInscription" style="margin-top: 100px;">
                        <form action="Account" method="POST">
                            <h2>Cr�er un compte</h2>
                            <hr>
                            <div class="col-lg-12" style="margin: 0; padding: 0;">
                                <label>Nom : </label>
                                <input type="text" name="lastname"/>
                            </div>
                            <div class="col-lg-12" style="margin: 0; padding: 0;">
                                <label>Pr�nom : </label>
                                <input type="text" name="firstname"/>
                            </div>
                            <div class="col-lg-12" style="margin: 0; padding: 0;">
                                <label>Email : </label>
                                <input type="text" name="email"/>
                            </div>
                            <div class="col-lg-12" style="margin: 0; padding: 0;">
                                <label>Password : </label>
                                <input type="text" name="password"/>
                            </div>
                            <div class="col-lg-12" style="margin: 0; padding: 0;">
                                <label>Confirmer password : </label>
                                <input type="text" name="password"/>
                            </div>

                            <a id="btnConnexion" class="btn" style="margin-bottom: 15px;" href="Login">S'inscrire</a>
                            <br />
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>

<!-- Import footer -->
<%@include file="templates/footer.jsp" %>