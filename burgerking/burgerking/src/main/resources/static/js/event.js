const tns = document.getElementsByClassName("th_new_store");
const te = document.getElementsByClassName("th_event");

tns[0].addEventListener("click", function(){
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
});

te[0].addEventListener("click", function(){
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
});

