### **TEMPLATE**
**spring boot + maven + docker**

#### 1. Run unit test
```bash
mvn clean test
```

#### 2. Build jar
```bash
mvn clean install
```

#### 3. Build docker image locally
```bash
mvn clean package -Plocal-build
```

#### 4. Build docker image in registry
```bash
mvn clean package -Pregistry-build -Djib.to.auth.username= -Djib.to.auth.password=
```

#### 5. Run application
```bash
docker-compose -f docker/docker-compose.yml up
```