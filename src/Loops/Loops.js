// Sum of the first 10 numbers Write a loop that sums up the first 10 numbers (1 through 10).

let sum = 0
for (let i = 1; i <= 10; i++) {
    sum += i;
}

console.log("Summe", sum);

// Sum of every third number between 1 and 30

let sum2 = 0;
for (let i = 1; i <= 30; i += 3) {
    sum2 += i;
}
console.log("Summe", sum2);

// Print the even numbers between 1 and 20 Write a loop that prints all the even numbers from 1 to 20.

for (let i = 2; i <= 20; i += 2) {
    console.log(i);
}

//Write a loop that prints all the odd numbers from 1 to 20.

for (let i = 1; i <= 20; i += 2) {
    console.log(i);
}

//Count down from 10 to 1 Write a loop that counts down from 10 to 1 and prints each number.

for (let i = 10; i >= 1; i--) {
    console.log(i);
}

//Sum of squares from 1 to 5 Write a loop that calculates the sum of squares of the first 5 numbers (1^2 + 2^2 + ... + 5^2).

let sum3 = 0;
for (let i = 1; i <= 5; i++) {
    sum3 += i * i;
}
console.log(sum3);

//Sum of the numbers from 1 to 100 Write a loop that sums all the numbers from 1 to 100.

let sum4 = 0;
for (let i = 1; i <= 100; i++) {
    sum4 += i;
}
console.log(sum4);

//• Find the product of the first 5 numbers Write a loop that calculates the product of the first 5 numbers (1 * 2 * 3 * 4 * 5).
let product = 1;
for (let i = 1; i <= 5; i++) {
    product *= i;
}
console.log(product);

//Write a loop that prints the multiplication table for the number 3 (3 * 1, 3 * 2, ..., 3 * 10).Print the reverse of a string

let sum5 = 0;
let a = 0;
for (let i = 1; i <= 10; i++) {
    a = i * 3;
    sum5 = sum5 + a;
}
console.log(sum5);

//• Print the reverse of a string Write a loop that prints a string in reverse. For example, reverse "hello" to "olleh".
