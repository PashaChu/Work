<?php

$inp = $_POST['Username'];

$list_arr = array();
$list_arr = file('myList.txt');

foreach($list_arr as $inp) {
    if($list_arr == $inp) {
        switch($inp) {
            case 'Saske':
                echo 'Игрок Saske уже был отмечен.';
                break;
            case 'CopLya':
                echo 'Игрок CopLya уже был отмечен';
                break;
            case 'AldUin':
                echo 'Игрок AldUin уже был отмечен';
                break;
            case 'Gogo':
                echo 'Игрок Gogo уже был отмечен';
                break;
            case 'HashuNaMore':
                echo 'Игрок HashuNaMore уже был отмечен';
                break;
            case 'Wow':
                echo 'Игрок Wow уже был отмечен';
                break;
            case '1769HH':
                echo 'Игрок 1769HH уже был отмечен';
                break;
            case 'Errora':
                echo 'Игрок Errora уже был отмечен';
                break;
            case 'Vlad':
                echo 'Игрок Vlad уже был отмечен';
                break;
            case 'Maksim2008':
                echo 'Игрок Maksim2008 уже был отмечен';
                break;
            default:
                echo 'Это не имя игрока!';
        }
    }
}