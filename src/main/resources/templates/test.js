fetch('http://localhost:8080/admin')
    .then(response => {
        response.json().then(data => {
            if (data.length > 0) {
                let temp = ""
                data.forEach((x) => {
                    temp += "<tr>";
                    temp += "<td>" + x.id + "</td>";
                    temp += "<td>" + x.username + "</td>"
                    temp += "<td>" + x.lastName + "</td>"
                    temp += "<td>" + x.weight + "</td>"
                    temp += "<td>" + x.height + "</td>"


                })
                document.getElementById("users").innerHTML = temp;
            }
        })
    })