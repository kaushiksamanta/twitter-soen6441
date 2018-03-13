;(function(window) {

	'use strict';

	// Setting global class name
    document.documentElement.className = 'js';
    // Flag to know whether data is already in the dom
    var fetchedData = false;
    // Variable to store tweets
    var tweetsData = [];
    // Javascript selectors
    var closeCtrl = document.getElementById('btn-search-close'),
        searchContainer = document.querySelector('.search'),
        inputSearch = searchContainer.querySelector('.search__input');

    // Initialize at start
	function init() {
		initEvents();	
	}

	// Function defination for initEvents
	function initEvents() {
        jQuery(".search__suggestion").hide();
        jQuery(".main-body").show();
        jQuery(".tweets-body").hide();
		inputSearch.addEventListener('focus', openSearch);
		closeCtrl.addEventListener('click', closeSearch);
		document.addEventListener('keyup', function(ev) {
			// escape key.
			if( ev.keyCode == 27 ) {
				closeSearch();
			}
		});
	}

	// Function defination for openSearch
	function openSearch() {
        jQuery(".search__suggestion").show();
        jQuery(".main-body").hide();
        jQuery(".tweets-body").hide();
		searchContainer.classList.add('search--open');
		inputSearch.focus();
		jQuery("main").removeClass("main-wrap-open");
        jQuery("main").addClass("main-wrap-close");
	}

    // Function defination for closeSearch
	function closeSearch() {
		if(fetchedData){
            jQuery(".main-body").hide();
            jQuery(".tweets-body").show();
		}
        else {
			if(tweetsData.length != 0){
                jQuery(".main-body").show();
                jQuery(".tweets-body").show();
			}
            else {
                jQuery(".main-body").hide();
			}
		}
        jQuery(".search__suggestion").hide();
		searchContainer.classList.remove('search--open');
		inputSearch.blur();
        jQuery("main").addClass("main-wrap-open");
        jQuery("main").removeClass("main-wrap-close");
	}

	init();

	// Submit called on form submit
    jQuery('#search-form').submit(function (e) {
        e.preventDefault();
        if( inputSearch.value != '' ){
        	var dom = "";
			jQuery.get("http://localhost:9000/tweets/" + inputSearch.value).done(function (data) {
                tweetsData.concat(data);
                closeSearch();
                data.forEach(function (value) {
                    dom += "<p>" + " " + "*" + " ";
                	dom += "<a target='_blank' href='http://localhost:9000/userProfile/"+value.screenName+"'>("+value.name+")</a>" + "Tweet - "+value.text;
                    dom += "</p>";
				});
                fetchedData = true;
                jQuery(".main-body").hide();
                jQuery(".tweets-body").append(dom);
                jQuery(".tweets-body").show();
            });
		}
    });

})(window);
