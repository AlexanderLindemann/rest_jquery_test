const requestURL = 'http://localhost:8080/admin'

const xhr = new XMLHttpRequest()

xhr.open('GET', requestURL)

xhr.onload = () => {
    console.log(xhr.response)
}

xhr.send()