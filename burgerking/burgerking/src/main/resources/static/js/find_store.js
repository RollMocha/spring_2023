var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
var options = { //지도를 생성할 때 필요한 기본 옵션
	center: new kakao.maps.LatLng(33.450701, 126.570667), //지도의 중심좌표.
	level: 3 //지도의 레벨(확대, 축소 정도)
};

var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴

const ts = document.getElementsByClassName("th_store");
const arr = document.getElementsByClassName("arrow");
const sso = document.getElementsByClassName("sub_store_options");
const x = document.getElementsByClassName("x");
const bs = document.getElementsByClassName("btn_search");
const tsn = document.getElementsByClassName("txt_store_name");
const sa = document.getElementsByClassName("search_area");
const m = document.getElementsByClassName("metropolitan");
const d = document.getElementsByClassName("district");

ts[0].addEventListener("click", function(){
    ts[0].style.cssText="color: red; border-bottom: 2px solid red";
    ts[1].style.cssText="color: black; border-bottom: none";
    ts[2].style.cssText="color: black; border-bottom: none";

    bs[0].style.cssText="display: inline";
    tsn[0].style.cssText="display: none";
    sa[0].style.cssText="display: none";
});
ts[1].addEventListener("click", function(){
    ts[0].style.cssText="color: black; border-bottom: none";
    ts[1].style.cssText="color: red; border-bottom: 2px solid red";
    ts[2].style.cssText="color: black; border-bottom: none";

    bs[0].style.cssText="display: none";
    tsn[0].style.cssText="display: inline";
    sa[0].style.cssText="display: none";
});
ts[2].addEventListener("click", function(){
    ts[0].style.cssText="color: black; border-bottom: none";
    ts[1].style.cssText="color: black; border-bottom: none";
    ts[2].style.cssText="color: red; border-bottom: 2px solid red";

    bs[0].style.cssText="display: none";
    tsn[0].style.cssText="display: none";
    sa[0].style.cssText="display: inline";
});
arr[0].addEventListener("click", function(){
    arr[0].style.cssText="transform: rotate( 90deg )";
    sso[0].style.cssText="display: inline";
});
x[0].addEventListener("click", function(){
    arr[0].style.cssText="transform: rotate( -90deg )";
    sso[0].style.cssText="display: none";
});
function handleOnChange(e) {
    const value = e.value;
    let number = 0;
    switch(value) {
        case "Metropolitan":
            number = 0;
            for(let i=0; i<18; i++) {
                if(i == number) {
                    d[i].style.cssText="display: inline";
                }
                d[i].style.cssText="display: none";
            }
            break;

        case "Seoul":
            number = 1;
            for(let i=0; i<18; i++) {
                if(i == number) {
                    d[i].style.cssText="display: inline";
                }
                d[i].style.cssText="display: none";
            }
            break;
    }


}
/*17*/