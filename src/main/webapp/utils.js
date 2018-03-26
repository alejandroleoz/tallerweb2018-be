(function(global){
	
	// Devuelve una Promise
	// dataType = json|text|html
	global.ajax = function(url, method, dataType) {
		return new Promise(function(resolve, reject) {
            var xhr;

            xhr = new XMLHttpRequest();
            xhr.open(method || "GET", url);
            xhr.onreadystatechange = function() {
                var DONE = 4, // readyState 4 means the request is done.
                    OK = 200, // status 200 is a successful return.
                    data;

                if (xhr.readyState === DONE) {
                    if (xhr.status === OK) {
                    	if(dataType === "json") {
							data = JSON.parse(xhr.responseText);
                    	} else {
                    		data = xhr.responseText;
                    	}
                        
                        // Resolve OK
                        resolve(data);
                    } else {
                        // other error
                        reject({
                            code: xhr.status
                        });
                    }
                }
            };
            xhr.send();
        });
	};

	global.getTip = function() {
		return this.ajax("https://tallerweb2018.herokuapp.com/randomTip", "GET", "text");
	};

})(window)