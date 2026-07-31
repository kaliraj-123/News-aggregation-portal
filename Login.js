function login() {

    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value.trim();

    if (email === "" || password === "") {
        alert("Please enter your email and password");
        return;
    }

    const user = {
        email: email,
        password: password
    };

    const video = document.querySelector(".bg-video");
    if (video) {
        video.playbackRate = 0.3;
    }

    fetch("http://localhost:8080/api/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
    })
    .then(response => response.text())
    .then(data => {

        if (data === "Login Successful") {

            localStorage.setItem("email", email);

            alert("Login Successful");

            window.location.href = "dashboard.html";

        } else {

            alert(data);

        }

    })
    .catch(error => {

        console.error(error);
        alert("Server Error");

    });
}