fetch('http://localhost:8080/admin')
    .then(response => {
        response.json().then(data => {
            if (data.length > 0) {
                let temp = ""
                data.forEach((x) => {
                    temp += "<tr>";
                    temp += "<td>" + x.id + "</td>";
                    temp += "<td>" + x.login + "</td>"
                    temp += "<td>" + x.email + "</td>"
                    temp += "<td>" + x.password + "</td>"
                    temp += "<td>" + x.name + "</td>"
                    temp += "<td>" + x.lastname + "</td>"
                    temp += "<td>" + x.age + "</td>"


                })
                document.getElementById("users").innerHTML = temp;
            }
        })
    })