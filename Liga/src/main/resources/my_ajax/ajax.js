var servResponce = document.querySelector('#responce');

document.forms.myForm.onsubmit = function(e){
    e.preventDefault();
    var userInput = document.forms.ourForm.ourForm_inp.value;
    userInput = encoderURIComponent(userInput);

    var xhr = new XMLHttpRequest();
    
    xhr.open('POST', 'form.php');

    var formData = new FormData(document.forms.myForm);

    xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');

    xhr.onreadystatechange = function(){
        if(xhr.readyState === 4 && xhr.status === 200){
            servResponce.textContent = xhr.responceText;
        }
    }
    xhr.send(formData);
};