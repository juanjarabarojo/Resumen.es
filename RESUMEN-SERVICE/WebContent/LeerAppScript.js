$(document).ready(function(){

    $.ajax({

        url: '/RESUMEN-SERVICE/rest/resumenes',

        type: 'get',

        dataType: 'JSON',

        success: function(response){

           
            
            var pdf0 = "<p>"+
             "<embed src='../"+response[0].document+"'  width='100%' height='800px' />" +
                
             "</p>"
            $("#leerlibro0").append(pdf0);
            
            var pdf1 = "<p>"+
             "<embed src='../"+response[1].document+"'  width='100%' height='800px' />" +
                
             "</p>"
            $("#leerlibro1").append(pdf1);
            
            var pdf2 = "<p>"+
             "<embed src='../"+response[2].document+"'  width='100%' height='800px' />" +
                
             "</p>"
            $("#leerlibro2").append(pdf2);
            
           
        }
        
        
        


    });
    


});