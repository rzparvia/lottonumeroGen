function arpoja() {
    var numerot = [];
    for (var i = 0; i < 7; i++) {
        var numero = Math.floor(Math.random() * 41);
        if (!(numerot.includes(numero)))
        numerot += numero;
        i++;
    }
}

// var numerot = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
//     11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
//     21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
//     31, 32, 33, 34, 35, 36, 37, 38, 39, 40];