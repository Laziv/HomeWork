//Task 1
let admin;
let name;
name = "John";
admin = name;
console.log(admin);

//Task 2
let login = "admin";
let password = "qwerty";

if (login === "admin"){
    if(password === "qwerty"){
        console.log("Welcome!");
    }else if(login === ""){
        console.log("Canceled");
    }
    else{
        console.log("Wrong password");
    }
}else if(login === ""){
    console.log("Canceled");
}
else{
    console.log("I don't know you");
}

//Task 3
let user = {};
user.name = "ПИЛИП";
user.surname = "ШЕВЧЕНКО";
user.name = "СЕРГІЙ";
delete user.name;

//Task 4
let employeeSalaries = {
    employee1: 1000,
    employee2: 2000,
    employee3: 10000,
    employee4: 50
};

let countSalary = 0;
for (let e in employeeSalaries){
    countSalary +=  employeeSalaries[e];
}
console.log(countSalary);


//Task 5
function calculate(num1, num2, operation) {
    num1 = parseFloat(num1);
    num2 = parseFloat(num2);

    if (typeof num1 !== "number" || typeof num2 !== "number" || isNaN(num1) || isNaN(num2)) {
        throw new Error("The first or second parameter is not a number");
    }

    let result;
    switch (operation) {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            if (num2 === 0) {
                throw new Error("Cannot divide by zero");
            }
            result = num1 / num2;
            break;
        case "%":
            result = num1 % num2;
            break;
        default:
            throw new Error("Erroneous operation");
    }
    return result;
}

//Task 6
switch (login) {
    case "admin":
        switch(password){
            case"qwerty":
                console.log("Welcome!");
                break
            case"":
                console.log("Canceled");
                break;
            default:
                console.log("Wrong password");
        }
        break;
    case "":
        console.log("Canceled");
        break
    default:
        console.log("I don't know you");
}