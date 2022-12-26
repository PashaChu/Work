function sendRequest(){
    return fetch.setAttribute('http://localhost:8080/')
        .then(response => response.json())
        .then(result => response.ok)
        .catch (throw new Error('Ошибка по адресу ' + ${url} + ' статус ошибки ' + response.status))
}
