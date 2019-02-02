
var revapi;

	$(document).ready(function() {
				/*slider trigger*/
			   revapi = jQuery('.tp-banner').revolution(
				{
					delay:5000,
					startwidth:1170,
					startheight:650,
					hideThumbs:10,
					fullWidth:"on",
					forceFullWidth:"on"
				});

		
				var offset = 220;
				var duration = 500;
				jQuery(window).scroll(function() {
					if (jQuery(this).scrollTop() > offset) {
						jQuery('.back-to-top').fadeIn(duration);
					} else {
						jQuery('.back-to-top').fadeOut(duration);
					}
				});
				
				jQuery('.back-to-top').click(function(event) {
					event.preventDefault();
					jQuery('html, body').animate({scrollTop: 0}, duration);
					return false;
				});
			
	
			   /*magnet*/
			 	$('#container').magnet();
				
		/*animation trigger*/
		wow = new WOW(
		{
        animateClass: 'animated',
        offset:       100
		}
	  );
	    wow.init();
	    document.getElementById('moar').onclick = function() {
	      var section = document.createElement('section');
	      section.className = 'section--purple wow fadeInDown';
	      this.parentNode.insertBefore(section, this);
	    };

	});

		

