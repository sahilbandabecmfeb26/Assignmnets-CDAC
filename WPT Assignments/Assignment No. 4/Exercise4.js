// Exercise 4: Modify fetchData to include error handling[cite: 5]
function fetchDataWithError(url, callback) {
    console.log("Requesting data from: " + url);

    setTimeout(() => {
        // Simulating a random error condition[cite: 5]
        const isError = Math.random() > 0.7; 

        if (isError) {
            // Requirement: Call callback with error message[cite: 5]
            callback("Error: Resource not found (404)", null);
        } else {
            // Requirement: Otherwise, pass the response[cite: 5]
            callback(null, "Secure Data from " + url);
        }
    }, 2000);
}

// Running Exercise 4: Handle the error gracefully by logging it[cite: 5]
fetchDataWithError("https://secure.cdac.in", (error, response) => {
    if (error) {
        console.error("Graceful Log: " + error); // Requirement: Handle error gracefully[cite: 5]
    } else {
        console.log("Success: " + response);
    }
});