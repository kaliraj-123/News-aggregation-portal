function register() {

    const password = document.getElementById("password").value;
    const name=document.getElementById("name").value;
    const email=document.getElementById("email").value;
    const confirmPassword = document.getElementById("confirmPassword").value;
    const video = document.querySelector(".bg-video");
    video.playbackRate = 0.3;
    if (password != confirmPassword) {
        alert("Passwords do not match");
        return;
    }
    if(password===""||name===""||email==="")
    {
        alert("plece enter details");
        return;
    }

    const user = {
        name: document.getElementById("name").value,
        mobileNumber: document.getElementById("mobileNumber").value,
        email: document.getElementById("email").value,
        password: password
    };

    fetch("http://localhost:8080/api/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
    })
    .then(response => response.json())
    .then(data => {
        alert("Registration Successful");
        window.location.href = "login.html";
    })
    .catch(error => {
        alert("Registration Failed");
        console.log(error);
    });

}