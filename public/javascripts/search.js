;(function(window) {

	'use strict';

    document.documentElement.className = 'js';
    $(".search__suggestion").hide();
    $(".main-body").show();
    $(".tweets-body").hide();
    var fetchedData = false;
    var tweetsData = [];
	var closeCtrl = document.getElementById('btn-search-close'),
		searchContainer = document.querySelector('.search'),
		inputSearch = searchContainer.querySelector('.search__input');

	function init() {
		initEvents();	
	}

	function initEvents() {
		inputSearch.addEventListener('focus', openSearch);
		closeCtrl.addEventListener('click', closeSearch);
		document.addEventListener('keyup', function(ev) {
			// escape key.
			if( ev.keyCode == 27 ) {
				closeSearch();
			}
		});
	}

	function openSearch() {
        $(".search__suggestion").show();
        $(".main-body").hide();
        $(".tweets-body").hide();
		searchContainer.classList.add('search--open');
		inputSearch.focus();
		$("main").removeClass("main-wrap-open");
        $("main").addClass("main-wrap-close");
	}

	function closeSearch() {
		if(fetchedData){
            $(".main-body").hide();
            $(".tweets-body").show();
		}
        else {
			if(tweetsData.length != 0){
                $(".main-body").show();
                $(".tweets-body").show();
			}
            else {
                $(".main-body").hide();
			}
		}
        $(".search__suggestion").hide();
		searchContainer.classList.remove('search--open');
		inputSearch.blur();
        $("main").addClass("main-wrap-open");
        $("main").removeClass("main-wrap-close");
	}

	init();

    $('#search-form').submit(function (e) {
        e.preventDefault();
        if( inputSearch.value != '' ){
        	var dom = "";
			$.get("http://localhost:9000/tweets/" + inputSearch.value).done(function (data) {
                tweetsData.concat(data);
                closeSearch();
                data.forEach(function (value) {
                    dom += "<p>" + " " + "*" + " ";
                	dom += "<a target='_blank' href='http://localhost:9000/userProfile/"+value.screenName+"'>(Username - "+value.name+")</a>" + "Tweet - "+value.text;
                    dom += "</p>";
				});
                fetchedData = true;
                $(".main-body").hide();
                $(".tweets-body").append(dom);
                $(".tweets-body").show();
            });
		}
    });

})(window);
