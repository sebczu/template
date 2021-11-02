### **TEMPLATE**
**spring boot + maven + docker**

#### 1. Build jar
```bash
mvn clean install
```

#### 2. Build docker image locally
```bash
mvn clean package -Plocal-build
```

#### 3. Build docker image in registry
```bash
mvn clean package -Pregistry-build -Djib.to.auth.username= -Djib.to.auth.password=
```

#### 4. Run application
```bash
docker-compose -f docker/docker-compose.yml up
```