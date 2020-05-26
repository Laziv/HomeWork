//Task1,2
function MakeBuffer() {
    let arrBuffer = [];

     this.add = function(value) {
        arrBuffer.push(value);
    }

    this.print = function() {
        return arrBuffer.join("");
    }

    this.clear = function() {
        arrBuffer = [];
    }
}
let buffer = new MakeBuffer();
buffer.add(0);
buffer.add(1);
buffer.add(2);
console.log(buffer.print());
buffer.clear()
console.log(buffer.print());

//Task3
class Robot {
    work(){
        console.log("Я Robot – я просто працюю.");
    }
}
class CoffeRobot extends Robot{
    work(){
        console.log("Я CoffeRobot – я варю каву.");
    }
}
class RobotDancer extends Robot{
    work(){
        console.log("Я RobotDancer – я просто танцюю.");
    }
}
class RobotCoocker extends Robot{
    work(){
        console.log("Я RobotCoocker – я просто готую.");
    }
}

let robots = [new Robot(), new CoffeRobot, new RobotDancer(), new RobotCoocker()];
for (let i = 0; i < robots.length; i++) {
    robots[i].work();
}

let robot = {
    work(){
        console.log("Я Robot – я просто працюю.");
    }
};
let coffeRobot = {
    work(){
        console.log("Я CoffeRobot – я варю каву.");
    },
    __proto__: robot
};
let robotDancer = {
    work(){
        console.log("Я RobotDancer – я просто танцюю.");
    },
    __proto__: robot
};
let robotCoocker = {
    work(){
        console.log("Я RobotCoocker – я просто готую.");
    },
    __proto__: robot
};

robots = [robot, coffeRobot, robotDancer, robotCoocker];
for (let i = 0; i < robots.length; i++) {
    robots[i].work();
}

