
function sendForm(event) {
    fetch('http://localhost:8080/like',{
        method: 'POST',
        body: event.target.previousElementSibling.value
    }).then(response =>{
        if(response.status == 200){
            requestFetch(event);
        } else {
            alert("Нельзя добавить игрока, он уже там!")
        }
    })
}

async function requestFetch(event){
    const action = await fetch('http://localhost:8080/index', {
        method: 'POST',
        body: event.target.previousElementSibling.value
    }).then(response => {
        if(response.status == 200){
            alert("Игрок записан.")
        } else {
            alert("Ошибка: " + response.status)
        }
    })
}
