const email = localStorage.getItem("email");

fetch("http://localhost:8080/api/profile", {
    method: "POST",
    headers: {
        "Content-Type": "application/json"
    },
    body: JSON.stringify({
        email: email
    })
})
.then(response => response.json())
.then(data => {

    document.getElementById("name").innerText = data.name;
    document.getElementById("email").innerText = data.email;
    document.getElementById("mobile").innerText = data.mobileNumber;

    const today = new Date();
    document.getElementById("loginDate").innerText =
        today.toLocaleDateString() + " " + today.toLocaleTimeString();

})
.catch(error => {
    console.log(error);
});