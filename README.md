# Login Registration Backend 
### Not a complete code still changes to be done 

### Experimenting 

Complete login registration backend system using Spring Boot.


- [x] Spring Boot
- [x] Spring Security
- [x] Java Mail
- [x] Email verification with expiry
- [x] Spring Boot


```
curl --location --request POST 'localhost:8080/api/v1/registration' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "skac",
    "lastName": "Code",
    "email": "skac@g.com",
    "password": "password"
}'
```
