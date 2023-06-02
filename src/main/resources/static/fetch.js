
function sendForm(event) {
    fetch('http://localhost:8080/like',{
        method: 'POST',
        body: event.target.previousElementSibling.value
    }).then(response =>{
        if(response.status == 200){
            const action = fetch('http://localhost:8080/index', {
                method: 'POST',
                body: event.target.previousElementSibling.value
            }).then(response => response.json())
                alert("Игрок записан.")
        } else {
            alert("Нельзя добавить игрока, он уже там!")
        }
    })
}
