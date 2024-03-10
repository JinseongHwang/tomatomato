## 시연 방법

1. mongodb가 로컬에서 실행되어 있어야 한다.
```shell
docker ps | grep local-mongodb
```
2. spring boot application을 실행한다.
```shell
java -jar -Dspring.profiles.active=local ~/IdeaProjects/tomatomato/build/libs/tomatomato-0.0.1-SNAPSHOT.jar
```
3. ngrok로 외부 트래픽을 열어준다.
```shell
ngrok http 8080
```