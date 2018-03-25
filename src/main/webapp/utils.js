(function(global){
	
	// Devuelve una Promise
	global.ajax = function(url, method) {

		var promise = new Promise(function(resolve, reject) {
            var xhr;

            xhr = new XMLHttpRequest();
            xhr.open(method || "GET", url);
            xhr.onreadystatechange = function() {
                var DONE = 4, // readyState 4 means the request is done.
                    OK = 200, // status 200 is a successful return.
                    json;

                if (xhr.readyState === DONE) {
                    if (xhr.status === OK) {
                        json = JSON.parse(xhr.responseText);

                        // Resolve OK
                        resolve(json);
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

})(window)