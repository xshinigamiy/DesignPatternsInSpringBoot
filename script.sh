if ! [ -x "$(command -v docker-compose)" ]; then
  echo 'Error: docker-compose is not installed..' >&2
  exit 1
fi

docker-compose -f docker-compose.yml up -d --remove-orphans
sleep 5
./gradlew clean build
java -jar -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 build/libs/designpatterns-0.0.1-SNAPSHOT.jar