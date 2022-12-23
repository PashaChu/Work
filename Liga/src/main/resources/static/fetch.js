function sendRequest(){
    return fetch('http://localhost:8080/index', {method: 'GET'})
        .then(response => {
            return response.json()

        })
}
