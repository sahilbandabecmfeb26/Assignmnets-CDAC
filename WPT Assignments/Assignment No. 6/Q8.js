const cart = [
    { item: "Shirt", price: 600 },
    { item: "Shoes", price: 2100 },
    { item: "Watch", price: 2700 }
];

const totalPrice = cart.reduce((total, item) => total + item.price, 0);

console.log("Total Price:", totalPrice);