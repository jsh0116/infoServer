## REST API로 내부 통신하는 MSA 구축
bithumb tech academy daily homework

#### Spec
- WebClient

#### Request
```
GET localhost:8080/hello?name$name
```

#### Response
- aplication/json
```
{
  "to": `${name}`,
  "job": "",
  "message": `hello ${name}
}
