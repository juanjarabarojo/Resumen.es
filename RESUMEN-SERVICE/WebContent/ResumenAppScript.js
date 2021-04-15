$(document).ready(function(){

    $.ajax({

        url: '/RESUMEN-SERVICE/rest/resumenes',

        type: 'get',

        dataType: 'JSON',

        success: function(response){

            var len = response.length;

            for(var i=0; i<len; i++){
                var Id = response[i].id;
                var Titulo = response[i].title;
                var Autor = response[i].author;
                var document = response[i].document;
                var tr_str = "<tr>" +

                    "<td align='center'>" + Id + "</td>" +

                    "<td align='center'>" + Titulo + "</td>" +

                    "<td align='center'>" + Autor + "</td>" +

                    "</tr>";

                $("#userTable tbody").append(tr_str);

            }

        }

    });

});