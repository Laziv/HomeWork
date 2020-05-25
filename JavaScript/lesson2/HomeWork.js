//Task1
let products = ["Milk", "Apple", "Lemon"];
console.log(products[products.length - 1]);

//Task2
let styles = ["Джаз", "Блюз"];
styles.push("Рок-н-Ролл");
styles[styles.length - 2] = "Класика";
console.log(styles.shift());
styles.unshift("Реп", "Реггі");
console.log(styles);

//Task3
function find(arr, value) {
    return arr.indexOf(value);
}

//Task4
let numbers = [4, 43, 3, 7, -5, 2, -67, 34, 1234, -45, 101, -1, -111, 454, 54, 456, 65, 657, 321, 43];
console.log(numbers.sort((a, b) => a - b));
console.log(numbers.sort((a, b) => b - a));
let positiveNumbers = numbers.filter(n => n >= 0);
let negativeNumbers = numbers.filter(n => n < 0);

//Task5
function filterRange(arr, a, b) {
    return arr.slice(a, b);
}

//Task 6
function camelize(str) {
    let  result = str.split("-");
    return result.reduce((resultStr, e) => resultStr + e.charAt(0).toUpperCase() + e.slice(1));
}
console.log(camelize("my-short-string"));

//Task 7
let students = [
    {"yearOfStuding": 3, "facultyName": "Економічний факультет"},
    {"yearOfStuding": 1, "facultyName": "Факультет мистецтв"},
    {"yearOfStuding": 3, "facultyName": "Факультет державного управління"},
    {"yearOfStuding": 2, "facultyName": "Біотехнологічний факультет"},
    {"yearOfStuding": 4, "facultyName": "Філософський факультет"},
    {"yearOfStuding": 3, "facultyName": "Хімічний факультет"},
    {"yearOfStuding": 4, "facultyName": "Біологічний факультет"},
    {"yearOfStuding": 3, "facultyName": "Фізичний факультет"},
    {"yearOfStuding": 2, "facultyName": "Факультет журналістики"},
    {"yearOfStuding": 1, "facultyName": "Географічний факультет"}
];
let facultyNames = students.map(e => e.facultyName);
let sum = students.reduce((sum, e) => sum + e.yearOfStuding, 0);
console.log(sum);