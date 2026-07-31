let data1 = "";

function showOtp() {

    const email = document.getElementById("email").value;

    if (email.trim() === "") {
        alert("Please enter email");
        return;
    }

    const user = {
        email: email
    };

    fetch("http://localhost:8080/api/forget", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
    })
    .then(response => response.text())
    .then(data => {

        let arr = data.split(" ");

        let status = arr[0];
        data1 = arr[1];

        if (status === "OTPSent") {
            alert("OTP sent successfully.");
            document.getElementById("otpSection").style.display = "block";
        } else {
            alert(status);
        }

    })
    .catch(error => {
        console.error(error);
        alert("Server Error");
    });
}
function verifyOtp() {

    const otp = document.getElementById("otp").value;
    const email = document.getElementById("email").value;

    if (otp === data1) {

        // Save the current email
        localStorage.setItem("email", email);

        alert("OTP Verified");

        setTimeout(() => {
            window.location.href = "password.html";
        }, 1000);

    } else {
        alert("Wrong OTP");
    }
}