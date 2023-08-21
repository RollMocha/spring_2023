function handleOnChange(e){
    const value = e.value;

    switch (value) {
        case "burger":
            document.getElementById('burger').style.cssText = `display: inline`;
            document.getElementById('side').style.cssText = `display: none`;
            break;
        case "side":
            document.getElementById('burger').style.cssText = `display: none`;
            document.getElementById('side').style.cssText = `display: inline`;
            break;
        case "drink":
            BK[4].style.cssText("display: inline");
            break;
    }
}