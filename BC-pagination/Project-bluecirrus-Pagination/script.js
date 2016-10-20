$(document).ready(function(){


		$('#registration-form').validate({
	    rules: {
	    	PHY_SER_ID: {
	        required: true,
	       required: true
	      },
		  
	      NO_OF_PROCESSORS: {
	        minlength: 6,
	        required: true
	      },
		  
	      IP_ADDR: {
				required: true,
				ipaddress: true
			},
			DEPT_ID: {
				required: true,
				minlength: 6,
			},
		  
			HDD: {
	        required: true,
	        
	      },
		  
	     
	      HARD_DRIVE_QTY: {
	      	
	        required: true
	      },
	      
	      MEMORY: {
		      	
		     required: true
		      },
		      
		      
		  HOST_NAME: {
			      	
			  required: true
			  },
	      STP_BOND_NO: {
				     	
			required: true
		      },
	      HBA_TYPE: {
	    	  
	       required: true
		      },
	      
		   RACK_ID: {
					      	
			 required: true
		      },
		     
		   OS: {
							      	
	        required: true
		      },
							      
		  REMARKS: {
								      	
		   required: true,
		   minlength:100,
		    },
							      
							      
		  
		  agree: "required"
		  
	    },
			highlight: function(element) {
				$(element).closest('.control-group').removeClass('success').addClass('error');
			},
			success: function(element) {
				element
				.text('OK!').addClass('valid')
				.closest('.control-group').removeClass('error').addClass('success');
			}
	  });

}); // end document.ready