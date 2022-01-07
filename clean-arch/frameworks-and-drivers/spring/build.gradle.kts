plugins {
	id ("org.springframework.boot") version "2.6.2"
	id ("io.spring.dependency-management") version "1.0.11.RELEASE"
	java
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(project(":enterprise-business-rules"))
	implementation(project(":application-business-rules"))

	compileOnly("org.projectlombok:lombok:1.18.22")
	annotationProcessor("org.projectlombok:lombok:1.18.22")
	testCompileOnly("org.projectlombok:lombok:1.18.22")
	testAnnotationProcessor("org.projectlombok:lombok:1.18.22")
	implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation ("org.springframework.boot:spring-boot-starter-web")
	runtimeOnly ("com.h2database:h2")
}

tasks.named<Test>("test") {
	useJUnitPlatform()
}


