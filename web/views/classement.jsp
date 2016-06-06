
        <!-- Import header -->
        <%@include file="templates/header.jsp" %>


        <section class="aboutSect">
            <div class="rankingPict">
                <div class="container rankingCont">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1>Classement g�n�ral</h1>
                        </div>
                        <div class="col-lg-12 rankingTable">
                            <table class="rankingTab">
                                <tr>
                                    <th class="col-lg-4">Nom</th>
                                    <th class="col-lg-4">Pr�nom</th>
                                    <th class="col-lg-4">Points</th>
                                </tr>
                                <tr>
                                    <td class="tdNone col-lg-4"></td>
                                    <td class="tdNone col-lg-4"></td>
                                    <td class="tdNone col-lg-4"></td>
                                </tr>
                                <s:iterator value="allUsers">
                                <tr>
                                    <td class="col-lg-4"><p> <s:property value="Lastname"/> </p></td>
                                    <td class="col-lg-4"><p> <s:property value="Firstname"/> </p></td>
                                    <td class="col-lg-4"><p> <s:property value="Scores"/> </p></td>
                                </tr>      
                                </s:iterator>

                            </table>     
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- Import footer -->
        <%@include file="templates/footer.jsp" %>