function sendForm(event) {
 let player = event.target.Username.value
 let url1 = 'http://localhost:8080/like'
 let url2 = 'http://localhost:8080/index'
    fetch(url1,{
        method: "post",
        body: player
    }).then((response) =>
    function(response){
        if(response.ok){
            const action = fetch(url2, {
                method: "post",
                body: player
            }).then(response => response.json())
            alert("Игрок записан.")
            return
        } else {
            alert("Нельзя добавить игрока, он уже там!")
            return
        }
    })
}
