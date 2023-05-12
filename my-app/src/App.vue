<template>
  <head>
    <meta charset="UTF-8">
    <title>Moba-игра</title>
  </head>
  <body>
    <header class="header">
      <div class="container">
          <div class="header__inner">
              <div class="header__logo">League of Legends</div>
              <nav class="nav">
                  <a class="nav_link">Сообщество</a>
                  <a class="nav_link">Помощь</a>
                  <a class="nav_link">Матчи</a>
                  <a class="nav_link">Новости</a>
              </nav>
          </div>
      </div>
  </header>
      <div class="intro">
            <section class="buf">
                -----------------------------------------------------------------------------------------------
            </section>
            <table class="table_sort" align="center">
              <thead>
                  <tr>
                      <td class="head" v-on:click="sort()">Игроки</td>
                      <td class="head" v-on:click="sort()">Герои</td>
                      <td class="head" v-on:click="sort()">Закуп</td>
                      <td class="head" v-on:click="sort()">KDA</td>
                  </tr>
              </thead>
              <tr>
                  <td class="green">
                      <input class="TextWindow" type="text"  name="Username" value="Saske222" readonly>
                      <input type="image" class="buttonForm" name="picture" src=".\Like.png" border="0" v-on:click="sendForm(event)"/>
                  </td>
                  <td class="green">Алистар</td>
                  <td class="green">
                      <div class="popup">
                          <img src=".\Stealth_Ward_item.png" title = "Скрытый тотем">
                          <img src=".\Health_Potion_item.png" title = "Зелье здоровья">
                          <img src=".\Boots_of_Swiftness_item.png" title = "Ботинки стремительности">
                          <img src=".\Farsight_Alteration_item.png" title = "Всевидящая альтернатива">
                          <img src=".\Corrupting_Potion_item.png" title = "Вредоносное средство">
                          <img src=".\Refillable_Potion_item.png" title = "Пополняемое зелье">
                      </div></td>
                 <td class="green">9 / 8 / 9</td>
              </tr>
              <tr>
                  <td class="green">
                      <input  class="TextWindow" type="text"  name="Username" value="CopLya" readonly>
                      <input type="image" class="buttonForm" name="picture" src=".\Like.png" border="0" v-on:click="sendForm(event)"/>
                  </td>
                  <td class="green">Ари</td>
                  <td class="green">
                      <div class="popup">
                          <img src=".\Stealth_Ward_item.png" title = "Скрытый тотем">
                          <img src=".\Health_Potion_item.png" title = "Зелье здоровья">
                          <img src=".\Boots_of_Swiftness_item.png" title = "Ботинки стремительности">
                          <img src=".\Farsight_Alteration_item.png" title = "Всевидящая альтернатива">
                          <img src=".\Corrupting_Potion_item.png" title = "Вредоносное средство">
                          <img src=".\Refillable_Potion_item.png" title = "Пополняемое зелье">
                      </div></td>
                  <td class="green">8 / 5 / 15</td>
              </tr>
              <tr>
                  <td class="green">
                      <input class="TextWindow" type="text"  name="Username" value="AldUin" readonly>
                      <input type="image" class="buttonForm" name="picture" src=".\Like.png" border="0" v-on:click="sendForm(event)"/>
                  </td>
                  <td class="green">Аурелион Сол</td>
                  <td class="green">
                      <div class="popup">
                          <img src=".\Stealth_Ward_item.png" title = "Скрытый тотем">
                          <img src=".\Health_Potion_item.png" title = "Зелье здоровья">
                          <img src=".\Boots_of_Swiftness_item.png" title = "Ботинки стремительности">
                          <img src=".\Farsight_Alteration_item.png" title = "Всевидящая альтернатива">
                          <img src=".\Corrupting_Potion_item.png" title = "Вредоносное средство">
                          <img src=".\Refillable_Potion_item.png" title = "Пополняемое зелье">
                      </div></td>
                  <td class="green">7 / 9 / 4</td>
              </tr>
              <tr>
                  <td class="green">
                      <input class="TextWindow" type="text"  name="Username" value="Gogo" readonly>
                      <input type="image" class="buttonForm" name="picture" src=".\Like.png" border="0" v-on:click="sendForm(event)"/>
                  </td>
                  <td class="green">Вай</td>
                  <td class="green">
                      <div class="popup">
                          <img src=".\Stealth_Ward_item.png" title = "Скрытый тотем">
                          <img src=".\Health_Potion_item.png" title = "Зелье здоровья">
                          <img src=".\Boots_of_Swiftness_item.png" title = "Ботинки стремительности">
                          <img src=".\Farsight_Alteration_item.png" title = "Всевидящая альтернатива">
                          <img src=".\Corrupting_Potion_item.png" title = "Вредоносное средство">
                          <img src=".\Refillable_Potion_item.png" title = "Пополняемое зелье">
                      </div></td>
                  <td class="green">10 / 8 / 14</td>
              </tr>
              <tr>
                  <td class="green">
                      <input class="TextWindow" type="text"  name="Username" value="HachuNaMore" readonly>
                      <input type="image" class="buttonForm" name="picture" src=".\Like.png" border="0" v-on:click="sendForm(event)"/>
                  </td>
                  <td class="green">Варвик</td>
                  <td class="green">
                      <div class="popup">
                          <img src=".\Stealth_Ward_item.png" title = "Скрытый тотем">
                          <img src=".\Health_Potion_item.png" title = "Зелье здоровья">
                          <img src=".\Boots_of_Swiftness_item.png" title = "Ботинки стремительности">
                          <img src=".\Farsight_Alteration_item.png" title = "Всевидящая альтернатива">
                          <img src=".\Corrupting_Potion_item.png" title = "Вредоносное средство">
                          <img src=".\Refillable_Potion_item.png" title = "Пополняемое зелье">
                      </div></td>
                  <td class="green">5 / 8 / 6</td>
              </tr>
              <tr>
                  <td class="red">
                      <input class="TextWindow" type="text"  name="Username" value="Wow" readonly>
                      <input type="image" class="buttonForm" name="picture" src=".\Like.png" border="0" v-on:click="sendForm(event)"/>
                  </td>
                  <td class="red">Галио</td>
                  <td class="red">
                      <div class="popup">
                          <img src=".\Stealth_Ward_item.png" title = "Скрытый тотем">
                          <img src=".\Health_Potion_item.png" title = "Зелье здоровья">
                          <img src=".\Boots_of_Swiftness_item.png" title = "Ботинки стремительности">
                          <img src=".\Farsight_Alteration_item.png" title = "Всевидящая альтернатива">
                          <img src=".\Corrupting_Potion_item.png" title = "Вредоносное средство">
                          <img src=".\Refillable_Potion_item.png" title = "Пополняемое зелье">
                      </div></td>
                  <td class="red">2 / 10 / 5</td>
              </tr>
              <tr>
                  <td class="red">
                      <input class="TextWindow" type="text"  name="Username" value="1769HH" readonly>
                      <input type="image" class="buttonForm" name="picture" src=".\Like.png" border="0" v-on:click="sendForm(event)"/>
                  </td>
                  <td class="red">Дариус</td>
                  <td class="red">
                      <div class="popup">
                          <img src=".\Stealth_Ward_item.png" title = "Скрытый тотем">
                          <img src=".\Health_Potion_item.png" title = "Зелье здоровья">
                          <img src=".\Boots_of_Swiftness_item.png" title = "Ботинки стремительности">
                          <img src=".\Farsight_Alteration_item.png" title = "Всевидящая альтернатива">
                          <img src=".\Corrupting_Potion_item.png" title = "Вредоносное средство">
                          <img src=".\Refillable_Potion_item.png" title = "Пополняемое зелье">
                      </div></td>
                  <td class="red">12 / 10 / 11</td>
              </tr>
              <tr>
                  <td class="red">
                      <input class="TextWindow" type="text"  name="Username" value="Errora" readonly>
                      <input type="image" class="buttonForm" name="picture" src=".\Like.png" border="0" v-on:click="sendForm(event)"/>
                  </td>
                  <td class="red">Джакс</td>
                  <td class="red">
                      <div class="popup">
                          <img src=".\Stealth_Ward_item.png" title = "Скрытый тотем">
                          <img src=".\Health_Potion_item.png" title = "Зелье здоровья">
                          <img src=".\Boots_of_Swiftness_item.png" title = "Ботинки стремительности">
                          <img src=".\Farsight_Alteration_item.png" title = "Всевидящая альтернатива">
                          <img src=".\Corrupting_Potion_item.png" title = "Вредоносное средство">
                          <img src=".\Refillable_Potion_item.png" title = "Пополняемое зелье">
                      </div></td>
                  <td class="red">6 / 1 / 5</td>
              </tr>
              <tr>
                  <td class="red">
                      <input class="TextWindow" type="text"  name="Username" value="Vlad" readonly>
                      <input type="image" class="buttonForm" name="picture" src=".\Like.png" border="0" v-on:click="sendForm(event)"/>
                  </td>
                  <td class="red">Дрейвен</td>
                  <td class="red">
                      <div class="popup">
                          <img src=".\Stealth_Ward_item.png" title = "Скрытый тотем">
                          <img src=".\Health_Potion_item.png" title = "Зелье здоровья">
                          <img src=".\Boots_of_Swiftness_item.png" title = "Ботинки стремительности">
                          <img src=".\Farsight_Alteration_item.png" title = "Всевидящая альтернатива">
                          <img src=".\Corrupting_Potion_item.png" title = "Вредоносное средство">
                          <img src=".\Refillable_Potion_item.png" title = "Пополняемое зелье">
                      </div></td>
                  <td class="red">7 / 6 / 19</td>
              </tr>
              <tr>
                  <td class="red">
                      <input class="TextWindow" type="text"  name="Username" value="Maksim2008" readonly>
                      <input type="image" class="buttonForm" name="picture" src=".\Like.png" border="0" v-on:click="sendForm(event)"/>
                  </td>
                  <td class="red">Джинкс</td>
                  <td class="red">
                      <div class="popup">
                          <img src=".\Stealth_Ward_item.png" title = "Скрытый тотем">
                          <img src=".\Health_Potion_item.png" title = "Зелье здоровья">
                          <img src=".\Boots_of_Swiftness_item.png" title = "Ботинки стремительности">
                          <img src=".\Farsight_Alteration_item.png" title = "Всевидящая альтернатива">
                          <img src=".\Corrupting_Potion_item.png" title = "Вредоносное средство">
                          <img src=".\Refillable_Potion_item.png" title = "Пополняемое зелье">
                      </div></td>
                  <td class="red">11 / 12 / 5</td>
              </tr>
          </table>
      </div>     
  </body>
</template>

<script>
export default {
  name: 'App',
  data() {
    return{
      BackUrl: "http://localhost:8080"
    };
  }, 
  methods:{
    sendForm(event) {
      fetch('http://localhost:8080/like',{
          method: 'POST',
          body: event.target.previousElementSibling.value
      }).then(response =>{
          if(response.status == 200){
              this.requestFetch(event);
          } else {
              alert("Нельзя добавить игрока, он уже там!")
          }
      })
    },
    async requestFetch(event){
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
        if(action){
          return;
        }
    }, 
    sort(){
      document.addEventListener('DOMContentLoaded', () => {
        const getSort = ({target}) => {
          const order = (target.dataset.order = -(target.dataset.order || -1));
          const index = [...target.parentNode.cells].indexOf(target);
          const collator = new Intl.Collator(['en', 'ru'], { numeric: true });
          const comparator = (index, order) => (a, b) => order * collator.compare(a.children[index].innerHTML, b.children[index].innerHTML);
          for(const tBody of target.closest('table').tBodies){
            tBody.append(...[...tBody.rows].sort(comparator(index, order)));
            for(const cell of target.parentNode.cells){
              cell.classList.toggle('sorted', cell === target);
            }
          }
        };
          document.querySelectorAll('.table_sort thead').forEach(tableTH => tableTH.addEventListener('click', () => getSort(event)));
      });
    }
  }
}
</script>

<style>
  body {
    margin: 0;
    font-size: 15px;
    line-height: 1.6;
    color:chartreuse;
  }

  .container {
    width: 100%;
    max-width: 1200px;
    margin: 0 auto;
  }
  /*фон сайта*/
  .intro {
    width: 100%;
    height: 100%;
    background: url("https://i.pinimg.com/originals/c9/71/ff/c971ffc55a0aad1862f0711879fae1eb.jpg") center no-repeat;
    background-size: cover;
    display: flex;
    flex-direction: column;
  }

  .header {
    width: 100%;
    position:absolute;
    top: 0;
    left: 0;
    right: 0;
    z-index: 1000;
  }
  .header__inner {
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  .header__logo {
    font-size: 30px;
    font-weight: 700;
    font-family:inherit;
    color:aqua;
  }
  .nav {
    font-size: 14px;
    text-transform: uppercase;
  }
  .nav_link {
    display: inline-block;
    vertical-align: top;
    margin: 0 15px;
    position: relative;
    text-decoration: none;
    transition: color .2s linear;
    color:chartreuse;
  }
  .nav_link:after {
    content: "";
    display: block;
    width: 100%;
    height: 3px;
    display: none;
    background-color: darkmagenta;
    position: absolute;
    top: 100%;
    left: 0;
    z-index: 1;
  }
  .nav_link:hover {
    color:black;
  }
  .nav-link:hover:after {
    display: block;
  }
  /*таблица и ячейки*/
  table {
    font-family: sans-serif;
    text-align: center;
    border-collapse: separate;
    border-spacing: 5px;
    background: yellow;
    color: antiquewhite;
    border: 16px solid grey;
    border-radius: 20px;
    box-sizing:content-box;
  }
  td {
    background: black;
    padding: 7px;
  }
  /*линия перед таблицей*/
  .buf {
    font-size: 60px;
    font-weight: 700;
    border:30px;
  }
  /*цвета ячеек и текста в таблице*/
  .head {
  background: aqua;
  color: black;
  cursor: pointer;
  }
  .green {
  background: green;
  }
  .red {
  background: red;
  }
  /* Popup container - can be anything you want */
  .popup {
    position: relative;
    display: inline-block;
    cursor: pointer;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
  }

  /* The actual popup */
  .popup .popuptext {
    visibility: hidden;
    width: 160px;
    background-color: #555;
    color: #fff;
    text-align: center;
    border-radius: 6px;
    padding: 8px 0;
    position: absolute;
    z-index: 1;
    bottom: 100%;
    left: 50%;
    margin-left: -80px;
  }

  /* Popup arrow */
  .popup .popuptext::after {
    content: "";
    position: absolute;
    top: 100%;
    left: 50%;
    margin-left: -5px;
    border-width: 5px;
    border-style: solid;
    border-color: #555 transparent transparent transparent;
  }

  /* Toggle this class - hide and show the popup */
  .popup .show {
    visibility: visible;
    -webkit-animation: fadeIn 1s;
    animation: fadeIn 1s;
  }

  /* Add animation (fade in the popup) */
  @-webkit-keyframes fadeIn {
    from {opacity: 0;} 
    to {opacity: 1;}
  }

  @keyframes fadeIn {
    from {opacity: 0;}
    to {opacity:1 ;}
  }

  /*Likes*/

  .buttonForm {
  width: 25px;
    background-color: transparent;
    background-repeat: no-repeat;
    border: none;
    cursor: pointer;
    overflow: hidden;
    outline: none;
  }

  .button {
    width: 70px;
    height: 25px;
    background-color: blue;
    background-repeat: no-repeat;
    border: none;
    cursor: pointer;
    overflow: hidden;
    outline: none;
  }

  .TextWindow{
    text-align: center;
    width: 100px;
    line-height: 28px;
    background:none transparent;
    border: none;
  }

  textarea:focus, input:focus {
    color: #0000ff;
  }
</style>
