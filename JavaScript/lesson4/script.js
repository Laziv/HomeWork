function fillLists() {
    let elements = document.querySelectorAll("#lists li");
    for (let i = 0; i < elements.length; i++) {
        elements[i].innerText = "element " + i;
    }
    document.getElementById("amount").innerHTML =  "Кількість всіх елементів: " + elements.length;
}
function removeText() {
    document.getElementById("text").innerHTML = "";
}
function hideButton() {
    document.getElementById("hide").hidden = true;
}

function showMenu() {
   let menu = document.getElementById("menu");
   menu.hidden = !menu.hidden;
}

function setRedColor() {
    let links = document.querySelectorAll("a");
    for (let i = 0; i < links.length; i++) {
        if ((links[i].text.indexOf("http://") !== -1 || links[i].text.indexOf("ftp://") !== -1)
            && links[i].text.indexOf("http://internal.com")  === -1){
            links[i].setAttribute("class", "external-red");
        }
    }
}