# spring-boot-v3.0-jwt-mysql-auth-boilerplate
new spring boot 3.0 security implementation

- This is based on **MySQL**, **JWT**.
- ~~WebSecurityConfigurerAdapter~~ removed because it is deprecated in spring boot v3.0

<h2>1. User Register</h2>
###### end point

POST>http://localhost:8080/api/v1/auth/register

###### request
```
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "hello@gmail.com",
    "password": "1234"
}
```

###### response
```
{
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJoZWxsb0BnbWFpbC5jb20iLCJpYXQiOjE2ODEzNjUwNjYsImV4cCI6MTY4MTM2NjUwNn0.Dm-27HVjKRiU1fcHQPo7AoprqvT6HS7XUvGdnF4-bxQ"
}
```

<h2>2. Sign in</h2>

###### end point
POST>http://localhost:8080/api/v1/auth/authenticate

###### request
```
{
    "email": "hello@gmail.com",
    "password": "1234"
}
```

###### response
```
{
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJoZWxsb0BnbWFpbC5jb20iLCJpYXQiOjE2ODEzNjUyMDcsImV4cCI6MTY4MTM2NjY0N30.Ll6YqzTmW2ZwrE8VjvC3EN20qbqDSVXjav2spxYdhyc"
}
```
<h2>3. User logout</h2>

###### end point
GET>http://localhost:8080/api/v1/auth/logout

###### motivated by : https://youtu.be/BVdQ3iuovg0