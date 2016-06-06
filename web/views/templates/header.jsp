<!DOCTYPE html>
<html>
    <head>
        <title>BetFun</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="resources/css/bootstrap.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="resources/css/bootstrap-theme.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="resources/css/common.less" type="text/css" media="screen" />
        <link rel="stylesheet" href="resources/css/about.less" type="text/css" media="screen" />
        <link rel="stylesheet" href="resources/css/policy.less" type="text/css" media="screen" />
        <link rel="stylesheet" href="resources/css/sitemap.less" type="text/css" media="screen" />
        <link rel="stylesheet" href="resources/css/account.less" type="text/css" media="screen" />
        <link rel="stylesheet" href="resources/css/bets.less" type="text/css" media="screen" />
        <link rel="stylesheet" href="resources/css/ranking.less" type="text/css" media="screen" />
        <link rel="stylesheet" href="resources/css/tournaments.less" type="text/css" media="screen" />
        <link rel="stylesheet" href="resources/css/toastr.css" type="text/css" media="screen" />
        <script src="resources/js/jquery-1.12.4.min.js"></script>
        <script src="resources/js/toastr.js"></script>
        <link rel="icon" type="image/x-icon" href="resources/images/betfunFlav.png" />
        
        <meta name="keywords" content="Bet BetFun Paris Concours Tournois">
        
        <%@ taglib prefix="s" uri="/struts-tags" %>
    </head>

    <body>

        <header>
            <div class="navbar navbar-fixed-top menu-top" role="navigation">
                <div class="container contMenu">
                    <ul class="nav navbar-nav">
                        <li class="imageMenu">
                            <a href="/BetFun/" class="logo">
                                <img src="resources/images/betfun.png"/>
                            </a>
                        </li>
                        <li>
                            <a class="btn" href="/BetFun/Paris">Paris</a>
                        </li>
                        <li>
                            <a class="btn" href="/BetFun/Tournament">Tournois</a>
                        </li>
                        <li>
                            <a class="btn" href="/BetFun/Classement">Classement</a>
                        </li>
                    </ul>
                    <div class="dropdown headerSelect">
                        <a class="btn dropdown-toggle headerBettun" type="button" data-toggle="dropdown">Mon Compte
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu dropdown-menu-right headerBetEncart">
                            <li><a href="/BetFun/Account">Mon Profile</a></li>
                            <hr style="margin: 5px;">
                            <li><a href="/BetFun/Logout">Déconnexion</a></li>
                        </ul>
                    </div>                    
                </div>
                <div class="clear"></div>
            </div>
        </header>