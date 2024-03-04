## Project setup
1. Run mysql db instance in your local using below commands

```
docker run -p 3306:3306 --name=pls -e MYSQL_ROOT_PASSWORD=password@123 --restart on-failure -d mysql/mysql-server:latest
```
2. connect to instance using command
```
docker exec -it pls mysql -uroot -ppassword@123
```
3. Create database
```
CREATE DATABASE parkinglotsystem;
```
4. Create user and provide grants
```
CREATE USER 'pls-local'@'localhost' IDENTIFIED BY 'password@123';
CREATE USER 'pls-local'@'172.17.0.1' IDENTIFIED BY 'password@123';
GRANT ALL PRIVILEGES ON *.* TO 'pls-local'@'localhost';
GRANT ALL PRIVILEGES ON *.* TO 'pls-local'@'172.17.0.1';
FLUSH PRIVILEGES;
```


Run the application and access the api's using swagger link
[Localhost Swagger Link](http://localhost:8383/parkinglot/swagger-ui/index.html)

