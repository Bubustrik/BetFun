<!-- Import header -->
<%@include file="templates/header.jsp" %>

<script>
    toastr.info('Bienvenue sur Betfun !');
</script>
<section class="homeSection">
    <div class="homePict">
        <div class="homefilter">
            <div class="container homeFirstCont">
                <div class="row" style="overflow: auto;">
                    <div class="col-lg-6">
                        <h1>BETFUN</h1>
                        <br />
                        <br />
                        <div class="homefirstEncart">
                            <p>
                                BetFun est un site de paris en ligne spécialement conçu
                                pour les entreprises. Il ne s'agit pas d'un site de paris
                                d'argent traditionnel.
                            </p>
                            <br />
                            <p>
                                BetFun vous permettra de miser de petits objets, des corv&eacute;s,
                                des petits pains... Ici, vous pouvez vous permettre d'être
                                cr&eacute;atif et de parier sur la chemise que va porter un collègue
                                le lundi suivant.
                            </p>
                        </div>
                        <br />
                    </div>
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-3 homeInscription">
                        <form id="fromConnexion" action="Login" method="POST">
                            <h2>Connexion</h2>
                            <hr>
                            <div style="margin: 0; padding: 0;">
                                <label>Email : </label>
                                <input type="text" name="email"/>
                            </div>
                            <div style="margin: 0; padding: 0;">
                                <label>Password : </label>
                                <input type="password" name="password"/>
                            </div>
                            
                            <input class="validBut" type="submit" value="Se connecter"/>
                            <hr id="InscriptSecondHr">

                            <a id="inscription" href="/BetFun/RecoverPass" style="padding-top: 2px;">Mot de passe oublié</a>
                            <a id="inscription" href="/BetFun/SignUp" style="padding-bottom: 12px;">Se créer un compte</a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


<!-- Import footer -->
<%@include file="templates/footer.jsp" %>