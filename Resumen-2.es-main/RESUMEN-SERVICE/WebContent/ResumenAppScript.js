$(document).ready(function(){

    $.ajax({

        url: '/RESUMEN-SERVICE/rest/resumenes',

        type: 'get',

        dataType: 'JSON',

        success: function(response){

            var len = response.length;

            for(var i=0; i<3; i++){
                var Id = response[i].id;
                var Titulo = response[i].title;
                var Autor = response[i].author;
                var document = response[i].document;
                var Imagen = response[i].image;
                var tr_str = 
                
                "<div class='libro' id='index'>" +
                   "<div class='libro-img'>" +
                        "<img class='show'data-my-id='Id' src='Imagen'/>" +
                   "</div>" +
                   "<div class='title'>" +
                       Titulo +
                   "</div>" +
                   "<div class='actions'>" +
                        "<button class='show' data-my-id='Id'>"  + 'Leer' + "</button>"+
                        "<button class='edit' data-my-id='Id'>" + 'Favorito' + "</button>" +
                    "</div>" +
                "</div>";

                $("#cuerpo").append(tr_str);

            }
            
            for(var i=0; i<len; i++){
                var Id = response[i].id;
                var Titulo = response[i].title;
                var Autor = response[i].author;
                var document = response[i].document;
                var Imagen = response[i].image;
                var tr_str1 = 
                
                "<div class='libro' id='index'>" +
                   "<div class='libro-img'>" +
                        "<img class='show'data-my-id='Id' src='Imagen'/>" +
                   "</div>" +
                   "<div class='title'>" +
                       Titulo +
                   "</div>" +
                   "<div class='actions'>" +
                        "<button class='show' data-my-id='Id'>"  + 'Leer' + "</button>"+
                        "<button class='edit' data-my-id='Id'>" + 'Favorito' + "</button>" +
                    "</div>" +
                "</div>";

                $("#cuerpo1").append(tr_str1);

            }

        }

    });

});