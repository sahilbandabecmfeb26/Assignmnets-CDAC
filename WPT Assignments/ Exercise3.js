// Exercise 3: Simulate a network request with a delay[cite: 5]
function fetchData(url, callback) {
    console.log("Connecting to " + url + "...");
    
    // Requirement: Use setTimeout to simulate a delay[cite: 5]
    setTimeout(() => {
        const response = "Server response from " + url;
        // Requirement: Call the callback with the response string[cite: 5]
        callback(response);
    }, 2000); // 2-second delay
}

// Running Exercise 3: Log the response to console after delay[cite: 5]
fetchData("https://api.example.com", (res) => {
    console.log("Received: " + res);
});