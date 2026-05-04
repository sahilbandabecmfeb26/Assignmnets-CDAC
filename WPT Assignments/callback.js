// Exercise 1 & 2: Define processData and call the callback within it
function processData(input, callback) {
    console.log("Processing input: " + input); // Requirement: Define function
    callback(input); // Requirement: Call it within processData
}

// Defining a simple callback function to use[cite: 5]
function myCallback(data) {
    console.log("Callback executed with: " + data);
}

// Running Exercise 1 & 2[cite: 5]
processData("CDAC Mumbai", myCallback);