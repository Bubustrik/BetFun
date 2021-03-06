        <%@page contentType="text/html; charset=UTF-8" %>
        <!-- Import header -->
        <%@include file="templates/header.jsp" %>

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
                                        BetFun vous permettra de miser de petits objets, des corvés,
                                        des petits pains... Ici, vous pouvez vous permettre d'être
                                        créatif et de parier sur la chemise que va porter un collègue
                                        le lundi suivant.
                                    </p>
                                </div>
                                <br />
                            </div>
                            <div class="col-lg-3">
                            </div>
                            <div class="col-lg-3 homeInscription">
                                <h2>Connexion</h2>
                                <hr>
                                <div class="col-lg-12" style="margin: 0; padding: 0;">
                                    <label>Pseudo : </label>
                                    <input />
                                </div>
                                <div class="col-lg-12" style="margin: 0; padding: 0;">
                                    <label>Password : </label>
                                    <input />
                                </div>

                                <a class="btn" style="margin-bottom: 8px;">Se connecter</a>

                                <input type="checkbox" id="stayConnected" style="padding-top: 5px;">
                                <label for="stayConnected">Restez connecté</label>

                                <hr id="InscriptSecondHr">
                                <a id="inscription" href="#">Se créer un compte</a>
                                <br />
                                <br />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
        
        
        

        <!--   Insert bootstrap.min.js from internet   -->    
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
        
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" 
        integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" 
        crossorigin="anonymous"></script>

        <script>
            $('a[href^="#"]').click(function(){
                var the_id = $(this).attr("href");

                $('html, body').animate({
                        scrollTop:$(the_id).offset().top
                }, 'slow');
                return false;
            });
        </script>
        
        <!-- Import footer -->
        <%@include file="templates/footer.jsp" %>
