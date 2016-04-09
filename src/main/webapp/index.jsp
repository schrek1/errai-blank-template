<!DOCTYPE html>
<%
   String contextPath = getServletContext().getContextPath();
%>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="A simple Errai/GWT CRUD Application.">

  <title>elBooker CRM</title>

  <!-- Bootstrap Core CSS -->
  <link href="css/bootstrap.min.css" rel="stylesheet">

  <script type="text/javascript">
    erraiJaxRsApplicationRoot = "rest";
  </script>
  <script type="text/javascript" src="<%=contextPath%>/app/app.nocache.js"></script>

</head>

<body>
  <div id="rootPanel" class="container"></div>

  <iframe src="javascript:''" id="__gwt_historyFrame" style="width: 0; height: 0; border: 0"></iframe>
  <script src="js/jquery.js"></script>
  <script src="<%=contextPath%>/js/bootstrap.min.js"></script>
</body>
</html>
