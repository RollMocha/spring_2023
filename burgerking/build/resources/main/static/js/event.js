const te = document.getElementsByClassName("th_event");
const se = document.getElementsByClassName("sub_event");
const tp = document.getElementsByClassName("th_progress");
const eb = document.getElementsByClassName("event_bulletin");
const ap = document.getElementsByClassName("a_progress");
/*var eventJS = [[${th_event}]];*/

const all = document.getElementById("all");
const ongoing = document.getElementById("ongoing");
te[0].addEventListener("click", function(){
    /*
    te[0].style.border = 'none';
    tns[0].style.border = 'none';

    tns[0].style.backgroundColor = '#f2f2f2';
    tns[0].style.borderBottom = '2px solid black';
    tns[0].style.color = '#ffffff';

    te[0].style.backgroundColor = '#ffffff';
    te[0].style.color = '#000000';
    te[0].style.borderTop = '2px solid black';
    te[0].style.borderLeft = '2px solid black';
    te[0].style.borderRight = '2px solid black';
    */
    location.href="/burgerking/event/0/1";
});

te[1].addEventListener("click", function(){
    /*
    te[0].style.border = 'none';
    tns[0].style.border = 'none';

    te[0].style.backgroundColor = '#f2f2f2';
    te[0].style.borderBottom = '2px solid black';
    te[0].style.color = '#ffffff';

    tns[0].style.backgroundColor = '#ffffff';
    tns[0].style.color = '#000000';
    tns[0].style.borderTop = '2px solid black';
    tns[0].style.borderLeft = '2px solid black';
    tns[0].style.borderRight = '2px solid black';
    */
    location.href="/burgerking/event/1/0";
});
/*
tp[1].addEventListener("click", function(){
    ap[1].style.cssText="color: red";
    ap[0].style.cssText="color: #000000";
    ap[2].style.cssText="color: #000000";
});
tp[2].addEventListener("click", function(){
    ap[2].style.cssText="color: red";
    ap[0].style.cssText="color: #000000";
    ap[1].style.cssText="color: #000000";
});
*/
function AllIsClick() {
    var link = document.location.href;
    alert(link);
//    var link = document.location.href;
//    alert(link);
//
//    switch(link){
//        case "http://localhost:8080/burgerking/event/0/0":
//            all.style.cssText("color: red");
//            break;
//        case "http://localhost:8080/burgerking/event/0/1":
//            all.style.cssText("color: black");
//            break;
//        case "http://localhost:8080/burgerking/event/0/2":
//
//            break;
//    }

}