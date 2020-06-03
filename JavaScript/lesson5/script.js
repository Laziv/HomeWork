formRegistration.onsubmit = async (e) => {
    e.preventDefault();
    let age = document.querySelector('[name="age"] ');
    if (Number.parseInt(age.value) < 1 || Number.parseInt(age.value) > 100) {
        age.parentElement.querySelector('small').innerText = "Вiк повинен бути від 1 до 100 років";
        return;
    } else {
        age.parentElement.querySelector('small').innerText = "";
    }

    let response = await fetch("http://localhost:8080/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json;charset=utf-8"
        },
        body: JSON.stringify(Object.fromEntries(new FormData(formRegistration)))
    });

    let result = await response.text();
    alert(result);
}

async function showUsers() {
    let response = await fetch("http://localhost:8080/users")
    createTableFromJson(await response.json());
}

formShow.onsubmit = async (e) => {
    e.preventDefault();
    let id = document.getElementById("id").value;
    let response = await fetch("http://localhost:8080/users/" + id);
    document.getElementById("showUser").innerHTML = await response.text();
}

function createTableFromJson(json) {
    if (json.length < 1) {
        return;
    }

    let table = document.createElement("table")
    let row = table.insertRow();

    for (let o in json[0]) {
        let th = document.createElement("th");
        th.innerHTML = o;
        row.appendChild(th);
    }

    for (let i = 0; i < json.length; i++) {
        row = table.insertRow();
        for (let o in json[i]) {
            row.insertCell().innerHTML = json[i][o];
        }
    }

    table.setAttribute('id', 'tab');
    let element = document.getElementById("showUsers");
    element.innerHTML = "";
    element.appendChild(table)
}

//Task 4
async function getUsers(names) {
    let users = [];
    for (let name of names) {
        let response = await fetch("https://api.github.com/users/" + name);
        if (response.ok) {
            users.push(await response.json());
        } else {
            users.push(null);
        }
    }
    return users;
}