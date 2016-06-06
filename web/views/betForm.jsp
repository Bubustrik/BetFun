        <!-- Import header -->
        <%@include file="templates/header.jsp" %>
        
            <section class="signUpSect">
                <div class="betsPict">
                    <div class="container window">
                        <div class="col-lg-3">
                        </div>
                        <div class="col-lg-9">
                            <div class="col-lg-8 homeInscription" style="margin-top: 100px;">
                                <form action="CreateMatch" method="POST">
                                    <h2>Création de Paris</h2>
                                    <hr>
                                    <div class="col-lg-12" style="margin: 0; padding: 0;">
                                        <label>Titre du Paris : </label>
                                        <input type="text" name="name"/>
                                    </div>
                                    <div class="col-lg-12" style="margin: 0; padding: 0;">
                                        <label>Description du Paris : </label>
                                        <input type="text" name="description"/>
                                    </div>
                                    
                                    <input class="validBut" type="submit" value="Créer un Paris">
                                    
                                    <br />
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        
        <!-- Import footer -->
        <%@include file="templates/footer.jsp" %>