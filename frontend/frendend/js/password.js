function show() {

    const btn = document.getElementById("btn");
    const tex = document.getElementById("tex");

    if (btn.innerText === "Show my password") {

const email = localStorage.getItem("email");
        fetch("http://localhost:8080/api/getPassword", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                email: email
            })
        })
        .then(response => response.text())
        .then(data => {
            tex.innerText = data;
            btn.innerText = "Hide my password";
        })
        .catch(error => {
            console.log(error);
        });

    } else {

        tex.innerText = "*******************";
        btn.innerText = "Show my password";

    }
}