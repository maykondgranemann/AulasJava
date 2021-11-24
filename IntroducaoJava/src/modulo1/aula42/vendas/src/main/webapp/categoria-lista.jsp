<%@ page import="java.util.ArrayList, com.zuplae.vendas.models.Categoria" %>

<%
    ArrayList<Categoria> categorias = (ArrayList<Categoria>)request.getAttribute("categorias");
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Categoria-Lista</title>
    <link rel="stylesheet" href="../css/styles.css">
</head>
<body>
    <h1>Lista de categorias</h1>
    <form action="/vendas-1/categoria/listar" method="get">
        Nome:<input type="text" name="nome" id="nome">
        <input type="submit" value="Filtrar">
    </form>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <% for (Categoria model : categorias) { %>
                <tr>
                    <td><%= model.getId() %></td>
                    <td><%= model.getNome() %></td>
                    <td>
                        <a href="/vendas-1/categoria/carregar?id=<%= model.getId() %>">Alterar</a> |
                        <a href="/vendas-1/categoria/deletar?id=<%= model.getId() %>">Deletar</a>
                    </td>
                </tr>
            <%}%>
        </tbody>
    </table>
</body>
</html>