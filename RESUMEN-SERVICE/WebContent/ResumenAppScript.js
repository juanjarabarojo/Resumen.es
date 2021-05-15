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
                var index = 
                
                "<div class='libro' id='index'>" +
                   "<div class='libro-img'>" +
                        "<a href='libros/libro"+Id+".html'><img class='show' data-my-id='"+Id+"' src='"+Imagen+"'/></a>" +
                   "</div>" +
                   "<div class='title'>" +
                       Titulo +
                   "</div>" +
                   "<div class='actions'>" +
                        "<a class='show' data-my-id='"+Id+"'href='libros/libro"+Id+".html'>"  + 'Leer' + "</a>"+
                        "<a class='edit' data-my-id='"+Id+"'>" + 'Favorito' + "</a>" +
                    "</div>" +
                "</div>";

                $("#cuerpo").append(index);

            }
            
            
             
            for(var i=0; i<len; i++){
                var Id = response[i].id;
                var Titulo = response[i].title;
                var Autor = response[i].author;
                var document = response[i].document;
                var Imagen = response[i].image;
                
            	
                var library = 
                
                "<div class='libro' id='index'>" +
                   "<div class='libro-img'>" +
                        "<a href='libros/libro"+Id+".html'><img class='show' data-my-id='"+Id+"' src='"+Imagen+"'/></a>" +
                   "</div>" +
                   "<div class='title'>" +
                       Titulo +
                   "</div>" +
                   "<div class='actions'>" +
                        "<a class='show' data-my-id='"+Id+"' href='libros/libro"+Id+".html'>"  + 'Leer' + "</a>"+
                        "<a class='edit' data-my-id='"+Id+"'>" + 'Favorito' + "</a>" +
                    "</div>" +
                "</div>";

                $("#cuerpo1").append(library); 
                
            } 
            
            
            
            
            
            $(".search").click(function(){
            
            		for(var i=0; i<len; i++){
		                var Id = response[i].id;
		                var Titulo = response[i].title;
		                var Autor = response[i].author;
		                var document = response[i].document;
		                var Imagen = response[i].image;
                
		                var input = $(".ilupa").val();
		                
		                if(input == Titulo){
		                
						location.replace("libros/libro"+i+".html");
						break;
						} else{
							alert('ALGO NO FUNCIONAAAAA')
						}
					}
				}); 
				

			
			
        }

    });
    

    


});