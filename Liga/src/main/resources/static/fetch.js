function sendForm(event) {
 let player = event.target.Username.value
 let url = 'http://localhost:8080/like.json'
    fetch( url,{
        method: "post",
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ name: player})
    }).then(response => response.json())
}
