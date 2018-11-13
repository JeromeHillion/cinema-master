<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <%@ page contentType="text/html; charset=UTF-8" %>
</head>
<body>
<h2></h2>
<a href="/liste"> Liste des films</a>
<div class="container" style="margin-top: 8%;">
    <div class="col-md-6 col-md-offset-3">
        <div class="row">
            <div id="logo" class="text-center">
                <h1>Le cinema de Tomcat</h1><p>rechercher un film</p>
            </div>
            <form role="form" id="form-buscar" method="post" action="/recherche">
                <div class="form-group">
                    <div class="input-group">
                        <input id="1" class="form-control" type="text" name="search" placeholder="Rechercher..." required/>
                        <span class="input-group-btn">
<button class="btn btn-success" type="submit">
<i class="glyphicon glyphicon-search" aria-hidden="true"></i> Rechercher
</button>
</span>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
