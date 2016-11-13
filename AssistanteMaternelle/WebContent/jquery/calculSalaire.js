$(document).ready(function()
	{
		$('#titre').fadeTo("slow", 0.5);
						
		$('#dateEmbauche').on('focus' , function()
				{$('#commentaire').html('Pour assurer au salari&eacute; un salaire r&eacute;gulier quel que soit la p&eacute;riode d\'activit&eacute; \(Compl&egrave;te ou incompl&egrave;te\), le salaire de base est mensualis&eacute;. Il est calcul&eacute; sur 12 mois &agrave; compter de la date d\'embauche.');});
     	$('#dateEmbauche').on('blur' , function()
				{$('#commentaire').text('');});
     	
     	if ($(':radio#radio1:checked').val()) 
     		{ $('#nbrSemaineAcceuilParAn').hide();
     		  $('#nbrSemaineAcceuilParAnLabel').hide();
     		};
     	if ($(':radio#radio2:checked').val()) 
			{$('#nbrSemaineAcceuilParAn').show();
	 		 $('#nbrSemaineAcceuilParAnLabel').show();
	    	 };	
     	$(':radio#radio1').on('click', function ()
    			    		{$('#nbrSemaineAcceuilParAn').hide();
    			 			 $('#nbrSemaineAcceuilParAnLabel').hide();
    			    		});	
     	$(':radio#radio2').on('click', function ()
	    		{$('#nbrSemaineAcceuilParAn').show();
	 			 $('#nbrSemaineAcceuilParAnLabel').show();
	    		});	
	
	});