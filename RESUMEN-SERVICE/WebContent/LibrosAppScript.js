$(document).ready(function(){

    $.ajax({

        url: '/RESUMEN-SERVICE/rest/resumenes',

        type: 'get',

        dataType: 'JSON',

        success: function(response){
        
                var index = 
                
                "<div class='libro-img'>" +
                            "<img class='portada' src='../"+response[0].image+"' width='320px' height='550px'/>"+
                            
                    "</div>"+
                    
               " </p>" +
                "<p>" +
                    "<div class='field'>" +
                        "<h2>Título</h2>" +
                        "<h3  type='text' id='titulo' placeholder='Título'>" 
                                +response[0].title+"</h3>" +
                        "</div>" +
                        "<div class='field'>" +
                            "<h2>Autor</h2> " +
                        "<h3  type='text' id='director' placeholder='Autor'>" 
                               +response[0].author+ "</h3> " +
                    "</div>" +
                    "<p>"+response[0].synopsis+"</p>"+
                    
                
                
                "</p>"+
                
                "<a class='show'>Favorito</a>" +
                "<a class='show'>Comentar</a>" +
                "<a class='show' href='leer0.html'>Leer</a>" +
                "<a class='show' href='../index.html' >Volver</a>"
                
                

                $("#infolibro").append(index);
                
                var index1 = 
                
                "<div class='libro-img'>" +
                            "<img class='portada' src='../"+response[1].image+"' width='320px' height='550px'/>"+
                            
                    "</div>"+
                    
               " </p>" +
                "<p>" +
                    "<div class='field'>" +
                        "<h2>Título</h2>" +
                        "<h3  type='text' id='titulo' placeholder='Título'>" 
                                +response[1].title+"</h3>" +
                        "</div>" +
                        "<div class='field'>" +
                            "<h2>Autor</h2> " +
                        "<h3  type='text' id='director' placeholder='Autor'>" 
                               +response[1].author+ "</h3> " +
                    "</div>" +
                    "<p>"+response[1].synopsis+"</p>"+
                
                "</p>"+
                "<a class='show'>Favorito</a>" +
                "<a class='show'>Comentar</a>" +
                "<a class='show' href='leer1.html'>Leer</a>" +
                "<a class='show' href='../index.html' >Volver</a>"
                

                $("#infolibro1").append(index1);
                
                var index2 = 
                
                "<div class='libro-img'>" +
                            "<img class='portada' src='../"+response[2].image+"' width='320px' height='550px'/>"+
                            
                    "</div>"+
                    
               " </p>" +
                "<p>" +
                    "<div class='field'>" +
                        "<h2>Título</h2>" +
                        "<h3  type='text' id='titulo' placeholder='Título'>" 
                                +response[2].title+"</h3>" +
                        "</div>" +
                        "<div class='field'>" +
                            "<h2>Autor</h2> " +
                        "<h3  type='text' id='director' placeholder='Autor'>" 
                               +response[2].author+ "</h3> " +
                    "</div>" +
                    "<p>"+response[2].synopsis+"</p>"+
                    
                     "<audio controls>"+
    				"<source src='../"+response[2].audio+"' type='audio/mp3'>"+
					"</audio>"+
                
                "</p>"+
                "<a class='show'>Favorito</a>" +
                "<a class='show'>Comentar</a>" +
                "<a class='show' href='leer2.html'>Leer</a>" +
                "<a class='show' href='../index.html' >Volver</a>"
                

                $("#infolibro2").append(index2);
                
                var index3 = 
                
                "<div class='libro-img'>" +
                            "<img class='portada' src='../"+response[3].image+"' width='320px' height='550px'/>"+
                            
                    "</div>"+
                    
               " </p>" +
                "<p>" +
                    "<div class='field'>" +
                        "<h2>Título</h2>" +
                        "<h3  type='text' id='titulo' placeholder='Título'>" 
                                +response[3].title+"</h3>" +
                        "</div>" +
                        "<div class='field'>" +
                            "<h2>Autor</h2> " +
                        "<h3  type='text' id='director' placeholder='Autor'>" 
                               +response[3].author+ "</h3> " +
                    "</div>" +
                    "<p>"+response[3].synopsis+"</p>"+
                
                "</p>"+
                "<a class='show'>Favorito</a>" +
                "<a class='show'>Comentar</a>" +
                "<a class='show'>Leer</a>" +
                "<a class='show' href='../index.html' >Volver</a>"
                

                $("#infolibro3").append(index3);
                
                var index4 = 
                
                "<div class='libro-img'>" +
                            "<img class='portada' src='../"+response[4].image+"' width='320px' height='550px'/>"+
                            
                    "</div>"+
                    
               " </p>" +
                "<p>" +
                    "<div class='field'>" +
                        "<h2>Título</h2>" +
                        "<h3  type='text' id='titulo' placeholder='Título'>" 
                                +response[4].title+"</h3>" +
                        "</div>" +
                        "<div class='field'>" +
                            "<h2>Autor</h2> " +
                        "<h3  type='text' id='director' placeholder='Autor'>" 
                               +response[4].author+ "</h3> " +
                    "</div>" +
                    "<p>"+response[4].synopsis+"</p>"+
                
                "</p>"+
                "<a class='show'>Favorito</a>" +
                "<a class='show'>Comentar</a>" +
                "<a class='show'>Leer</a>" +
                "<a class='show' href='../index.html' >Volver</a>"
                

                $("#infolibro4").append(index4);
                
                var index5 = 
                
                "<div class='libro-img'>" +
                            "<img class='portada' src='../"+response[5].image+"' width='320px' height='550px'/>"+
                            
                    "</div>"+
                    
               " </p>" +
                "<p>" +
                    "<div class='field'>" +
                        "<h2>Título</h2>" +
                        "<h3  type='text' id='titulo' placeholder='Título'>" 
                                +response[5].title+"</h3>" +
                        "</div>" +
                        "<div class='field'>" +
                            "<h2>Autor</h2> " +
                        "<h3  type='text' id='director' placeholder='Autor'>" 
                               +response[5].author+ "</h3> " +
                    "</div>" +
                    "<p>"+response[5].synopsis+"</p>"+
                
                "</p>"+
                "<a class='show'>Favorito</a>" +
                "<a class='show'>Comentar</a>" +
                "<a class='show'>Leer</a>" +
                "<a class='show' href='../index.html' >Volver</a>"
                

                $("#infolibro5").append(index5);
                
                
			
            
        }
        
        
        
       
            
            
           
        
        
        


    });
    
    
    
    


});