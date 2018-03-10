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
	}

	function closeSearch() {
		if(fetchedData){
            $(".main-body").hide();
		}
        else {
			if(tweetsData.length != 0){
                $(".main-body").show();
			}
            else {
                $(".main-body").hide();
			}
		}
        $(".search__suggestion").hide();
        $(".tweets-body").show();
		searchContainer.classList.remove('search--open');
		inputSearch.blur();
		inputSearch.value = '';
	}

	init();

    $('#search-button').click(function (e) {
        e.preventDefault();
        if( inputSearch.value != '' ){
        	var dom = "";
			$.get("http://localhost:9000/tweets/" + inputSearch.value).done(function (data) {
                tweetsData.concat(data);
                closeSearch();
                data.forEach(function (value,index) {
                    dom+="<p>" + " " + "*" + " ";
                	dom += value.text;
                    dom+="</p>";
				});
                fetchedData = true;
                $(".main-body").hide();
                $(".tweets-body").append(dom);
                $(".tweets-body").show();
            });
		}
    });

})(window);
