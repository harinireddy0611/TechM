var Bus = /** @class */ (function () {
    function Bus(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    return Bus;
}());
var myBus = new Bus('Mercedes', 'Sprinter', 2025);
console.log(myBus);
